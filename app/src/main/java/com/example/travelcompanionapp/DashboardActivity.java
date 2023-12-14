package com.example.travelcompanionapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.travelcompanionapp.R;


public class DashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Your dashboard initialization code or other functionalities
        Button destinationSearchButton = findViewById(R.id.destinationSearchButton);
        destinationSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check login logic here
                // If login successful, navigate to DashboardActivity
                Intent intent = new Intent(DashboardActivity.this, DashboardActivity.class);
                startActivity(intent);
            }

        });

        Button imageGalleryButton = findViewById(R.id.imageGalleryButton);
        imageGalleryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, galleryActivity.class);
                startActivity(intent);
            }
        });

        Button tripPlannerButton = findViewById(R.id.tripPlannerButton);
        tripPlannerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, plannerActivity.class);
                startActivity(intent);
            }
        });

        Button settingsButton = findViewById(R.id.settingsButton);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, settingsActivity.class);
                startActivity(intent);
            }
        });



    }
}
