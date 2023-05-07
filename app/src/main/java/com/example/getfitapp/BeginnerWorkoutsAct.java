package com.example.getfitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class BeginnerWorkoutsAct extends AppCompatActivity {
        Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_beginner_workouts);

        back = (Button) findViewById(R.id.BBBtn);
    }
}