package com.example.pbl;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {

    EditText mEmail,mPassword;
    Button mloginBtn;
    Button msignup;
    FirebaseAuth fAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        mEmail = findViewById(R.id.editText);
        mPassword = findViewById(R.id.editText2);
        fAuth = FirebaseAuth.getInstance();
        mloginBtn=findViewById(R.id.login1);
        msignup = findViewById(R.id.signup);

        if(fAuth.getCurrentUser() !=null)
        {
            startActivity(new Intent(getApplicationContext(),preferance.class));
            finish();
        }


        mloginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = mEmail.getText().toString().trim();
                String password = mPassword.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    mEmail.setError("Email is Required");
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    mPassword.setError("Password is Required");
                    return;
                }

                //authenticate user

                fAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){
                            Toast.makeText(login.this, "Login Successfully.", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),preferance.class));
                        }else{
                            Toast.makeText(login.this, "Error !"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        msignup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),signup.class));
            }
        });


    }
}