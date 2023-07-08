package com.example.reciper;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;


public abstract class CountDownTimer {
    private static final long TIMER_DURATION = 5000; // 5 seconds
    static CountDownTimer timer = new CountDownTimer(TIMER_DURATION, 1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            // This method is called every second during the countdown
            long secondsRemaining = millisUntilFinished / 1000;
            // Update the TextView
        }

        @Override
        public void onFinish() {
            // This method is called when the countdown is finished

            Intent intent = new Intent(Activity1.this , Activity2.class);
            startActivity(intent);
            finish(); // Close the activity so the user can't go back to it
        }
    };

    private static void startActivity(Intent intent) {
    }

    private static void finish() {
    }

    public abstract void onTick(long millisUntilFinished);

    public abstract void onFinish();
}
