package com.example.reciper;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reciper.Adapters.PopularRecipes.PopularRecipeAdapter;
import com.example.reciper.Listeners.RandomRecipeResponseListener;
import com.example.reciper.Models.RandomRecipeApiResponse;


public class Activity4 extends AppCompatActivity {

    ProgressDialog dialog;
    RequestManager manager;
    PopularRecipeAdapter popularRecipeAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        dialog = new ProgressDialog(this);
        dialog.setTitle("Loading...");

        manager = new RequestManager(this);
        manager.getRandomRecipes(randomRecipeResponseListener);
        dialog.show();


        // Get references to the ImageButton elements in the tab bar
        ImageButton homeButton = findViewById(R.id.home);
        ImageButton searchButton = findViewById(R.id.search);
        ImageButton notificationButton = findViewById(R.id.notification);

        // Set click listeners for the buttons
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an intent to navigate to Activity4 (or whatever the current activity is)
                Intent intent = new Intent(Activity4.this, Activity4.class);
                startActivity(intent);
            }
        });

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an intent to navigate to Activity5
                Intent intent = new Intent(Activity4.this, Activity5.class);
                startActivity(intent);
            }
        });

        notificationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an intent to navigate to Activity7
                Intent intent = new Intent(Activity4.this, Activity7.class);
                startActivity(intent);
            }
        });




    }

    private final RandomRecipeResponseListener randomRecipeResponseListener= new RandomRecipeResponseListener() {
        @Override
        public void didFetch(RandomRecipeApiResponse response, String message) {
            recyclerView = findViewById(R.id.popular_Recipe_Recycler);
            recyclerView.hasFixedSize();
            recyclerView.setLayoutManager(new GridLayoutManager(Activity4.this , 1 ));

            popularRecipeAdapter = new PopularRecipeAdapter(Activity4.this, response.recipes);
            recyclerView.setAdapter(popularRecipeAdapter);
        }

        @Override
        public void didError(String message) {
            Toast.makeText(Activity4.this, message, Toast.LENGTH_SHORT).show();
        }
    };

}