package com.example.pr_14_ivanchikov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondScreen extends AppCompatActivity {
    EditText email;
    EditText password;
    String e1;
    String p1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
    }
    public void onClick (View v) {
        email=findViewById(R.id.editTextTextEmailAddress);
        password=findViewById(R.id.editTextTextPassword);
        if (String.valueOf(email.getText())!="" &&String.valueOf(password.getText())!="") {
            Intent intent = new Intent(this, ScreenMain.class);
            startActivity(intent);
        }
    }
}