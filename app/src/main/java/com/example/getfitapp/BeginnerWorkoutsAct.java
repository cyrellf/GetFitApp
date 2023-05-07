package com.example.getfitapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.getfitapp.ui.notifications.NotificationsFragment;
import com.example.getfitapp.ui.notifications.NotificationsViewModel;

public class BeginnerWorkoutsAct extends AppCompatActivity {
        Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_beginner_workouts);

        back = (Button) findViewById(R.id.BBBtn);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BeginnerWorkoutsAct.this, IndexActivity.class));
            }
        });

    }
}