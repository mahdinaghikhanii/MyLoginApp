package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intentSignUp = new Intent(this, SignupActivity.class);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView)  findViewById(R.id.password);
        MaterialButton login_btn = (MaterialButton) findViewById(R.id.login_btn);


        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("mahdi") && password.getText().toString().equals("welcome") ){
                    startActivity(intentSignUp);
                }else{
                    Toast.makeText(MainActivity.this, "Username or password is not True", Toast.LENGTH_SHORT).show();
                }
            }
        });



     }
}