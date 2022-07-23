package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView recyclerView = findViewById(R.id.rv_Home);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(new  HomeAdapter());


        EditText fullnameET = findViewById(R.id.Et_contact_full_name);
        ImageView addNewContactIm = findViewById(R.id.Iv_add_contact);

        addNewContactIm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fullnameET.length() > 0){
                    // add new Contact


                }
            }
        });

    }
}