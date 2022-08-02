package com.example.foodproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.function.IntToLongFunction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Toast.makeText(this,"Loading...",Toast.LENGTH_SHORT).show();
        Button register =findViewById(R.id.Register);
        register.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,SignUp.class);
            startActivity(intent);
        });
        Button login=findViewById(R.id.Login);
        login.setOnClickListener(view -> {
            Intent intent1=new Intent (MainActivity.this,Login.class);
            startActivity(intent1);
        });
    }
}