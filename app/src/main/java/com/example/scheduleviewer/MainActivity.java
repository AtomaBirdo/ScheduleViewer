package com.example.scheduleviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ScrollView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public void weekPress(View view){
        Intent myIntent = new Intent(MainActivity.this, WeekView.class); //Create a new intent
        MainActivity.this.startActivity(myIntent);
    }

    public void dayPress(View view){
        Intent myIntent = new Intent(MainActivity.this, DayView.class); //Create a new intent
        MainActivity.this.startActivity(myIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Period.loadAllPeriods();
        setContentView(R.layout.activity_main);
    }
}
