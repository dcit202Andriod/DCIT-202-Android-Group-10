package com.example.reciper;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class Activity1 extends AppCompatActivity {

    private static final int SPLASH_DELAY = 4000; // 4 seconds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);


        // Create a handler to delay the execution of the next activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Create an intent to start the next activity
                Intent intent = new Intent(Activity1.this, Activity2.class);
                startActivity(intent);

                // Close the splash screen activity
                finish();
            }
        }, SPLASH_DELAY);
    }
}