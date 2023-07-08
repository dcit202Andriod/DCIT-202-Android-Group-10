package com.example.reciper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        EditText username = (EditText) findViewById(R.id.Username);
        MaterialButton createAccount = (MaterialButton) findViewById(R.id.create_account);
        createAccount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String username1 = username.getText().toString();
                Toast.makeText(Activity3.this,"Username is",Toast.LENGTH_SHORT).show();
            }
        });


        ImageButton goToActivityButton = findViewById(R.id.back_button);
        goToActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this, Activity2.class);
                startActivity(intent);
            }
        });


    }
}