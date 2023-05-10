package com.example.getfitapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.getfitapp.ui.notifications.NotificationsFragment;

public class AdvancedWorkoutsAct extends AppCompatActivity {
    CardView d1,d2,d3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_advanced_workouts);

        Button back = (Button) findViewById(R.id.ABBtn1);

        d1 = (CardView) findViewById(R.id.AWD1);
        d2 = (CardView) findViewById(R.id.AWD2);
        d3 = (CardView) findViewById(R.id.AWD3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdvancedWorkoutsAct.this, IndexActivity.class));
            }
        });

       d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdvancedWorkoutsAct.this, AD1.class));
            }
        });
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdvancedWorkoutsAct.this, AD2.class));
            }
        });
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdvancedWorkoutsAct.this, AD3.class));
            }
        });
    }


}