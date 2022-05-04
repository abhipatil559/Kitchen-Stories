package com.example.pbl;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class dashboard extends AppCompatActivity {

    ImageView maha;
    ImageView south;
    ImageView north;
    ImageView gujarat;
    ImageView bengali;
    ImageView rajas;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        maha = findViewById(R.id.maha);


        maha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, select_meal.class);
                startActivity(intent);
            }
        });

        south=findViewById(R.id.south);
        south.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, select_meal.class);
                startActivity(intent);
            }
        });

        north=findViewById(R.id.north);
        north.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, select_meal.class);
                startActivity(intent);
            }
        });

        gujarat=findViewById(R.id.gujrat);
        gujarat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, select_meal.class);
                startActivity(intent);
            }
        });

        bengali=findViewById(R.id.bengali);
        bengali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, select_meal.class);
                startActivity(intent);
            }
        });

        rajas = findViewById(R.id.rajas);
        rajas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, select_meal.class);
                startActivity(intent);
            }
        });
    }
}