package com.example.foodproject;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    Button login;
    TextView textview2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login");
        login =findViewById(R.id.LoginButton);
        textview2=findViewById(R.id.skipped);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Login.this, "Welcome!", Toast.LENGTH_SHORT).show();
                Intent intent2=new Intent(Login.this,MainScreen.class);
                 startActivity(intent2);
            }
        });
        textview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(Login.this,MainScreen.class);
           startActivity(intent3);
            }
        });
    }
}