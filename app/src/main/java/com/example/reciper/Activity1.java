package com.example.reciper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.reciper.Adapters.recyclerViewAdapter;

import java.util.ArrayList;

public class Activity1 extends AppCompatActivity {
    ArrayList<cheeseBurger>cheeseBurgers = new ArrayList<>();
    int[] burgerImages = {R.drawable.cheeseburger,R.drawable.cheeseburger,R.drawable.cheeseburger,R.drawable.cheeseburger};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity5a);


        RecyclerView recyclerView = findViewById(R.id.mRes);

        setUpCheeseBurgerModels();

        recyclerViewAdapter adapter = new recyclerViewAdapter(this, cheeseBurgers);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void setUpCheeseBurgerModels(){
        String[] cheeseBurgerNames = getResources().getStringArray(R.array.recipes_names_full_txt);

        for (int i = 0; i< cheeseBurgerNames.length;i++){
            cheeseBurgers.add(new cheeseBurger(cheeseBurgerNames[i],burgerImages[i]));
        }
    }
}