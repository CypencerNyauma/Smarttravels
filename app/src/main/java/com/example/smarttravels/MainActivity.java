package com.example.smarttravels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText username=(EditText) findViewById(R.id.firstNameInput);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        MaterialButton materialButton=(MaterialButton) findViewById(R.id.createAccountButton);
        materialButton.setOnClickListener(v -> {
                startActivities(new Intent[]{new Intent(MainActivity.this, LoginActivity.class)});

        });
    }
}