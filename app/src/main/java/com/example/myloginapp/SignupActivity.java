package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Intent intentMainActivity = new Intent(this, MainActivity.class);
        TextView sign_in_now_text = (TextView) findViewById( R.id.sign_in_now_text);
        sign_in_now_text.setOnClickListener(view -> startActivity(intentMainActivity));
    }
}