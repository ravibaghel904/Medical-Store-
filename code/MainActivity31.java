package com.example.medicalstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity31 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);

        RecyclerView recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));





        MyMovieData[] myMovieData = new MyMovieData[]{
                new MyMovieData("Hysen","Rs 45 flim",R.drawable.medicine_logo),
                new MyMovieData("Gyren","Rs 33",R.drawable.medicine_logo),
                new MyMovieData("Jyelen","Rs 120",R.drawable.medicine_logo),
                new MyMovieData("Dyren","Rs 343",R.drawable.medicine_logo),
                new MyMovieData("Syren","Rs 121",R.drawable.medicine_logo),
                new MyMovieData("Lyren","Rs 43",R.drawable.medicine_logo),
                new MyMovieData("Zyren","Rs 676",R.drawable.medicine_logo),
                new MyMovieData("Ayren","Rs 14",R.drawable.medicine_logo),
                new MyMovieData("yren","Rs not for sale",R.drawable.medicine_logo),
                new MyMovieData("Clopidogrel ","Rs 454",R.drawable.medicine_logo),
                new MyMovieData("Wyren","Rs 400",R.drawable.medicine_logo),
                new MyMovieData("Syren","Rs 232",R.drawable.medicine_logo),
                new MyMovieData("QSyren","Rs 434",R.drawable.medicine_logo),
                new MyMovieData("Syren","Rs 98",R.drawable.medicine_logo),
                new MyMovieData("Amoxicillin+Clavulinic acid","Rs 67",R.drawable.medicine_logo),
                new MyMovieData("Carboplatin","Rs 24",R.drawable.medicine_logo),
                new MyMovieData("Syren","Rs not for sale",R.drawable.medicine_logo),
        };
        MyMovieAdapter myMovieAdapter = new MyMovieAdapter(myMovieData,MainActivity31.this);
        recyclerView.setAdapter(myMovieAdapter);
    }



}