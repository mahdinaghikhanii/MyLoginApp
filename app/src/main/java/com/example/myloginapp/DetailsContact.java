package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsContact extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_contact);

        String text = getIntent().getStringExtra("title");

        TextView fullNameContact = findViewById(R.id.Tv_details_contact);
        fullNameContact.setText(text);
    }
}