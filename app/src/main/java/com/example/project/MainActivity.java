package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


//    Declaring the global variables
    Button LoginBtn;
    EditText UserEmail, UserPassword;
    TextView registerPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing the global variable
        UserEmail = findViewById(R.id.editorEmailAddress);
        UserPassword = findViewById(R.id.editorPassword);
        LoginBtn = findViewById(R.id.Loginbtn);
        registerPage = findViewById(R.id.RegisterLink);

        //Setting the Text color to blue
        registerPage.setTextColor(Color.parseColor("#0000FF"));

        //Go to Register Activity when the user press the message
        registerPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RegisterPage.class);
                startActivity(intent);
            }
        });





    }
}