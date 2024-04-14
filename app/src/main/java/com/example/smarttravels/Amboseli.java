package com.example.smarttravels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class Amboseli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amboseli);
        MaterialButton materialButton=(MaterialButton) findViewById(R.id.button2);
        materialButton.setOnClickListener(v -> {
            startActivities(new Intent[]{new Intent(Amboseli.this, Diani.class)});

        });
    }
}