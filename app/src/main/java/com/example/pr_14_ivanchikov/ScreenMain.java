package com.example.pr_14_ivanchikov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScreenMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_main);
    }
    public void onClick2 (View v) {
        Intent intent = new Intent(this,StatisticScreen.class);
        startActivity(intent);
    }
    public void onClick3 (View v) {
        Intent intent = new Intent(this,OnePunchMan.class);
        startActivity(intent);
    }
}