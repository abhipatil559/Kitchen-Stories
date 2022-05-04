package com.example.pbl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class preferance extends AppCompatActivity {
private Button Veg;
private Button Nonveg;
private Button both;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferance);
        Veg=findViewById(R.id.veg1);
        Veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(preferance.this,dashboard.class);
                startActivity(intent);
            }
        });

        Nonveg=findViewById(R.id.nonveg);
        Nonveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(preferance.this,dashboard.class);
                startActivity(intent);
            }
        });

        both=findViewById(R.id.both);
        both.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(preferance.this,dashboard.class);
                startActivity(intent);
            }
        });
    }

    public void logout(View view){
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),login.class));
        finish();
    }

}