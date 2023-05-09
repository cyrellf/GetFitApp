package com.example.getfitapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntermWorkoutsAct extends AppCompatActivity {
    CardView cv1,cv2,cv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_interm_workouts);

        cv1 = (CardView) findViewById(R.id.IWD1);
        cv2 = (CardView) findViewById(R.id.IWD2);
        cv3 = (CardView) findViewById(R.id.IWD3);

        Button back = (Button) findViewById(R.id.IBBtn1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntermWorkoutsAct.this, IndexActivity.class));
            }
        });

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntermWorkoutsAct.this, ID1.class));
            }
        });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntermWorkoutsAct.this, ID2.class));
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntermWorkoutsAct.this, ID3.class));
            }
        });
    }
}