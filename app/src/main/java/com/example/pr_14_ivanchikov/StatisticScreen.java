package com.example.pr_14_ivanchikov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StatisticScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic_screen);
    }
    public void onClick1 (View v) {
        Intent intent = new Intent(this,ScreenMain.class);
        startActivity(intent);
    }
}