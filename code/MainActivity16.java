package com.example.medicalstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);


    }

    public void ayurve(View v) {
        Intent i = new Intent(MainActivity16.this, MainActivity11.class);
        startActivity(i);

    }
    public void bariatrics(View v) {
        Intent i = new Intent(MainActivity16.this, MainActivity12.class);
        startActivity(i);

    }
    public void chest(View v) {
        Intent i = new Intent(MainActivity16.this, MainActivity13.class);
        startActivity(i);

    }
    public void child(View v) {
        Intent i = new Intent(MainActivity16.this, MainActivity14.class);
        startActivity(i);

    }
    public void anaes(View v) {
        Intent i = new Intent(MainActivity16.this, MainActivity15.class);
        startActivity(i);

    }
    public void family(View v) {
        Intent i = new Intent(MainActivity16.this, MainActivity17.class);
        startActivity(i);

    }
}