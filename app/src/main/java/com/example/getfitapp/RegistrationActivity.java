package com.example.getfitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {
   Button login, register;
   EditText email,pnum,pass,rpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_registration);

        login = (Button) findViewById(R.id.SigninButton2);
        email = (EditText) findViewById(R.id.EmailET2);
        pnum = (EditText) findViewById(R.id.PhoneNumET2);
        pass = (EditText) findViewById(R.id.PasswordET2);
        rpass = (EditText) findViewById(R.id.RPasswordET2);
        register = (Button) findViewById(R.id.SignupButton2);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
            }
        });
    }
}