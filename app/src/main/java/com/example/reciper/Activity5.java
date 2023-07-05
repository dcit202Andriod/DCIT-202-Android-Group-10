package com.example.reciper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.reciper.Models.MyRecipeData;
import com.example.reciper.Models.RecipeAdapter;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

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



