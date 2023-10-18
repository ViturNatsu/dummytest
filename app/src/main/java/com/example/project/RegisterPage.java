package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class RegisterPage extends AppCompatActivity {

//    Declaring the global variables
    Button Register,Cancel;
    EditText Email,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        //Initializing the global variables
        Email = findViewById(R.id.editorRegisterEmail);
        Password = findViewById(R.id.editorRegisterPassword);
        Register = findViewById(R.id.Registerbtn);
        Cancel = findViewById(R.id.Cancelbtn);

        //Return to Login Page
        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterPage.this,MainActivity.class);
                startActivity(intent);
            }
        });

        //Register the data for email and password into database
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterPage.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}