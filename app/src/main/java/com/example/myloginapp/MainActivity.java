package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intentSignUp = new Intent(this, SignupActivity.class);
        Intent intentHome = new Intent(this, HomeActivity.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);
        TextView signup_text = findViewById(R.id.signup_now);
        MaterialButton login_btn = findViewById(R.id.login_btn);


        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("mahdi") && password.getText().toString().equals("welcome") ){
                    startActivity(intentHome);
                }else{
                    Toast.makeText(MainActivity.this, "Username or password is not True", Toast.LENGTH_SHORT).show();
                }
            }
        });

        signup_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentSignUp);
            }
        });



     }
}