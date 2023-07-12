package com.example.reciper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reciper.Adapters.PopularRecipeAdapter;
import com.example.reciper.Listeners.RandomRecipeResponseListener;
import com.example.reciper.Models.RandomRecipeApiResponse;
import com.example.reciper.Models.Recipe;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Activity4 extends AppCompatActivity {

    ProgressDialog dialog;
    RequestManager manager;
    PopularRecipeAdapter popularRecipeAdapter;
    RecyclerView recyclerView;
    Spinner spinner;
    List<String> tags = new ArrayList<String>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        dialog = new ProgressDialog(this);
        dialog.setTitle("Loading...");

        spinner = findViewById(R.id.spinner_tags);
        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.tags,
                R.layout.spinner_text
        );
        arrayAdapter.setDropDownViewResource(R.layout.spinner_inner_text);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(spinnerSelectedListener);

        manager = new RequestManager(this);
//        manager.getRandomRecipes(randomRecipeResponseListener);
//        dialog.show();
    }

    private final RandomRecipeResponseListener randomRecipeResponseListener= new RandomRecipeResponseListener() {
        @Override
        public void didFetch(RandomRecipeApiResponse response, String message) {
            dialog.hide();
            recyclerView = findViewById(R.id.popular_Recipe_Recycler);
            recyclerView.hasFixedSize();
            recyclerView.setLayoutManager(new LinearLayoutManager(Activity4.this, LinearLayoutManager.VERTICAL, false ));
            popularRecipeAdapter = new PopularRecipeAdapter(Activity4.this, response.recipes);
            popularRecipeAdapter.setOnClickListener((position, recipe) -> Toast.makeText(getApplicationContext(), "item clicked", Toast.LENGTH_SHORT).show());
            recyclerView.setAdapter(popularRecipeAdapter);
        }

        @Override
        public void didError(String message) {
            dialog.hide();
            Toast.makeText(Activity4.this, message, Toast.LENGTH_SHORT).show();
        }
    };

    private final AdapterView.OnItemSelectedListener spinnerSelectedListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
            tags.clear();
            tags.add(adapterView.getSelectedItem().toString());
            manager.getRandomRecipes(randomRecipeResponseListener, tags);
            dialog.show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };
}