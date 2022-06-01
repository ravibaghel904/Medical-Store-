package com.example.medicalstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity30 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);

        RecyclerView recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));





        MyMovieData[] myMovieData = new MyMovieData[]{
                new MyMovieData("Menylene","Rs 45 flim",R.drawable.medicine_logo),
                new MyMovieData("Syzer","Rs 33",R.drawable.medicine_logo),
                new MyMovieData("xonser","Rs 120",R.drawable.medicine_logo),
                new MyMovieData("Senyl","Rs 343",R.drawable.medicine_logo),
                new MyMovieData("Demol","Rs 121",R.drawable.medicine_logo),
                new MyMovieData("Froxic","Rs 43",R.drawable.medicine_logo),
                new MyMovieData("Jrenon","Rs 676",R.drawable.medicine_logo),
                new MyMovieData("Atol","Rs 14",R.drawable.medicine_logo),
                new MyMovieData("Blacyne\n","Rs not for sale",R.drawable.medicine_logo),
                new MyMovieData("glene","Rs 454",R.drawable.medicine_logo),
                new MyMovieData("Lyne\n","Rs 400",R.drawable.medicine_logo),
                new MyMovieData("Wysen","Rs 232",R.drawable.medicine_logo),
                new MyMovieData("Frexene","Rs 434",R.drawable.medicine_logo),
                new MyMovieData("Kifre","Rs 98",R.drawable.medicine_logo),
                new MyMovieData("Hronym","Rs 67",R.drawable.medicine_logo),
                new MyMovieData("Bajkn","Rs 24",R.drawable.medicine_logo),
                new MyMovieData("Coserne","Rs not for sale",R.drawable.medicine_logo),
        };
        MyMovieAdapter myMovieAdapter = new MyMovieAdapter(myMovieData,MainActivity30.this);
        recyclerView.setAdapter(myMovieAdapter);
    }



}