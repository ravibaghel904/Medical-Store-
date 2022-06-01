package com.example.medicalstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Book_testLab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_test_lab);
    }
    public void checkup(View v) {
        Intent i = new Intent(Book_testLab.this, MainActivity4.class);
        startActivity(i);

    }
    public void liver(View v) {
        Intent i = new Intent(Book_testLab.this, MainActivity5.class);
        startActivity(i);

    }
    public void hepatitis(View v) {
        Intent i = new Intent(Book_testLab.this, MainActivity6.class);
        startActivity(i);

    }
    public void antibody(View v) {
        Intent i = new Intent(Book_testLab.this, MainActivity7.class);
        startActivity(i);

    }
    public void diabetes(View v) {
        Intent i = new Intent(Book_testLab.this, MainActivity8.class);
        startActivity(i);

    }
    public void pregnancy(View v) {
        Intent i = new Intent(Book_testLab.this, MainActivity9.class);
        startActivity(i);

    }
    public void thyroid(View v) {
        Intent i = new Intent(Book_testLab.this, MainActivity24.class);
        startActivity(i);

    }
}