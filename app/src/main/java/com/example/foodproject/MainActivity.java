package com.example.foodproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

 TextView textview;
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
        textview=findViewById(R.id.textTonext);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,MainScreen.class);
                startActivity(intent);
            }
        });
    }
}