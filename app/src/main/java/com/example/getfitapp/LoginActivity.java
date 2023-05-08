package com.example.getfitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
        Button login,register;
        EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login2);
        login = (Button) findViewById(R.id.SigninButton1);
        register = (Button) findViewById(R.id.SignupButton1);
        email = (EditText) findViewById(R.id.EmailET1);
        password = (EditText) findViewById(R.id.PasswordET1);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = email.getText().toString();
                String pass = password.getText().toString();

                if(username.equals("admin") && pass.equals("123"))
                {
                    Toast.makeText(LoginActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(getApplicationContext(),IndexActivity.class);
                    startActivity(intent);
                }else
                {
                    Toast.makeText(LoginActivity.this, "Invalid Credentials.", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}