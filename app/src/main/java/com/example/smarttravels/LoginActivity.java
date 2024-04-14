package com.example.smarttravels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        MaterialButton materialButton=(MaterialButton) findViewById(R.id.loginButton);
        materialButton.setOnClickListener(v -> {
            startActivities(new Intent[]{new Intent(LoginActivity.this, Amboseli.class)});

        });
    }
}