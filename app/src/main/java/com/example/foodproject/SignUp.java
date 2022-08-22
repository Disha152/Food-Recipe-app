package com.example.foodproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    Button register;
    TextView already;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().setTitle("Sign Up");

        register=findViewById(R.id.button3);
        already= findViewById(R.id.textView7);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignUp.this, "You are registered now !", Toast.LENGTH_SHORT).show();
                Intent intent4=new Intent(SignUp.this,MainScreen.class);
                startActivity(intent4);
            }
        });
        already.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5=new Intent(SignUp.this,MainScreen.class);
                startActivity(intent5);
            }
        });
    }
}