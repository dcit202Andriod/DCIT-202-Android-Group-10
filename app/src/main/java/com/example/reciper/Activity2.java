package com.example.reciper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    EditText password;
    Button loginButton;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        password = findViewById(R.id.Password);
        loginButton = findViewById(R.id.login_button);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (password.getText().toString().equals("1234")) {
                    Toast.makeText(Activity2.this, "Login successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Activity2.this, "Invalid password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ImageButton goToActivityButton = findViewById(R.id.create_account);
        goToActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, Activity3.class);
                startActivity(intent);
            }
        });


    }
}


