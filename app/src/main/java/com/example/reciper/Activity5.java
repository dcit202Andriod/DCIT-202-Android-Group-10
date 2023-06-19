package com.example.reciper;

//Imported Dependencies
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.reciper.Models.MyRecipeData;
import com.example.reciper.Models.RecipeAdapter;

public class  Activity5 extends AppCompatActivity {
    private SearchView searchView;
    private RecipeAdapter recipeAdapter;
    private RecyclerView recyclerView;

    public Activity5(RecipeAdapter recipeAdapter, RecyclerView recyclerView) {
        this.recipeAdapter = recipeAdapter;
        this.recyclerView = recyclerView;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        searchView = findViewById(R.id.searchView);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                fileList();
                return true;
            }
        });


        MyRecipeData[] myRecipeData = new MyRecipeData[]{
                new MyRecipeData("Cheese Burger",R.drawable.cheeseburger),
                new MyRecipeData("Curry Noodles", R.drawable.currynoodles),
                new MyRecipeData("Noodles", R.drawable.noodles),
                new MyRecipeData("Home made Pan Cakes", R.drawable.pancakes),
                new MyRecipeData("Cheese & shell salad", R.drawable.salad),

        };
        RecipeAdapter recipeAdapter = new RecipeAdapter(myRecipeData, Activity5.this);
        recyclerView.setAdapter(recipeAdapter);
    }


}



