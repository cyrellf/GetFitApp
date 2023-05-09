package com.example.getfitapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.getfitapp.ui.notifications.NotificationsFragment;
import com.example.getfitapp.ui.notifications.NotificationsViewModel;

public class BeginnerWorkoutsAct extends AppCompatActivity {
        Button back;
        CardView d1,d2,d3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_beginner_workouts);

        back = (Button) findViewById(R.id.BBBtn);
        d1 = (CardView) findViewById(R.id.BWD1);
        d2 = (CardView) findViewById(R.id.BWD2);
        d3 = (CardView) findViewById(R.id.BWD3);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BeginnerWorkoutsAct.this, IndexActivity.class));
            }
        });

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BeginnerWorkoutsAct.this, BD1.class));
            }
        });
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BeginnerWorkoutsAct.this, BD2.class));
            }
        });

        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BeginnerWorkoutsAct.this, BD3.class));
            }
        });
    }
}