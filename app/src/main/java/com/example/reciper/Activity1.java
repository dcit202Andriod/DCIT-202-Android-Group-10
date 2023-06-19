package com.example.reciper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class Activity1 extends AppCompatActivity {
    ArrayList<cheeseBurger>cheeseBurgers = new ArrayList<>();
    int[] burgerImages = {R.drawable.cheeseburger};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        setUpCheeseBurgerModels();
    }
    private void setUpCheeseBurgerModels(){
        String[] cheeseBurgerNames = getResources().getStringArray(R.array.recipes_names_full_txt);

        for (int i = 0; i< cheeseBurgerNames.length;i++){
            cheeseBurgers.add(new cheeseBurger(cheeseBurgerNames[i],burgerImages[i]));
        }
    }
}