package com.example.reciper;

//Imported Dependencies
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import com.google.android.material.button.MaterialButton;


public class Activity7 extends AppCompatActivity {

    private static final int NOTIFICATION_ID = 1;

    private MaterialButton buttonAll;
    private MaterialButton buttonRead;
    private MaterialButton buttonUnread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        buttonAll = findViewById(R.id.button4);
        buttonRead = findViewById(R.id.button5);
        buttonUnread = findViewById(R.id.button2);

        buttonAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNotification("All");
            }
        });

        buttonRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNotification("Read");
            }
        });

        buttonUnread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNotification("Unread");
            }
        });
        // Get references to the ImageButton elements in the tab bar
        ImageButton homeButton = findViewById(R.id.home);
        ImageButton searchButton = findViewById(R.id.search);
        ImageButton notificationButton = findViewById(R.id.notification);
// Set click listeners for the buttons
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an intent to navigate to Activity4
                Intent intent = new Intent(Activity7.this, Activity4.class);
                startActivity(intent);
            }
        });

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an intent to navigate to Activity5
                Intent intent = new Intent(Activity7.this, Activity5.class);
                startActivity(intent);
            }
        });

        notificationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an intent to navigate to Activity7 (or whatever the current activity is)
                Intent intent = new Intent(Activity7.this, Activity7.class);
                startActivity(intent);
            }
        });
    }

    private void showNotification(String category) {
        // Create an explicit intent for the Activity7
        Intent intent = new Intent(this, Activity7.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE);

        // Build the notification
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "channel_id")
                .setSmallIcon(android.R.drawable.ic_dialog_info) //
                .setContentTitle("Notification Title")
                .setContentText("This is the notification content for category: " + category)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true);

        // Show the notification
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(NOTIFICATION_ID, builder.build());
    }
}
