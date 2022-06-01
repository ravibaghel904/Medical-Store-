package com.example.medicalstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity29 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);

        RecyclerView recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));





        MyMovieData[] myMovieData = new MyMovieData[]{
                new MyMovieData("Cyrene","Rs 45 flim",R.drawable.medicine_logo),
                new MyMovieData("Coros acid","Rs 33",R.drawable.medicine_logo),
                new MyMovieData("Arzastatin","Rs 120",R.drawable.medicine_logo),
                new MyMovieData("Vylene","Rs 120",R.drawable.medicine_logo),
                new MyMovieData("Dermic","Rs 121",R.drawable.medicine_logo),
                new MyMovieData("Azuren","Rs 43",R.drawable.medicine_logo),
                new MyMovieData("Xoren","Rs 676",R.drawable.medicine_logo),
                new MyMovieData("Xlavnie","Rs 14",R.drawable.medicine_logo),
                new MyMovieData("Nyclin","Rs not for sale",R.drawable.medicine_logo),
                new MyMovieData("Droidogrel ","Rs 454",R.drawable.medicine_logo),
                new MyMovieData("Mabebazine","Rs 400",R.drawable.medicine_logo),
                new MyMovieData("Clerzene","Rs 232",R.drawable.medicine_logo),
                new MyMovieData("Rolene","Rs 434",R.drawable.medicine_logo),
                new MyMovieData("Dyrene","Rs 98",R.drawable.medicine_logo),
                new MyMovieData("Zwene","Rs 67",R.drawable.medicine_logo),
                new MyMovieData("Hyzen","Rs 24",R.drawable.medicine_logo),
                new MyMovieData("Colene","Rs not for sale",R.drawable.medicine_logo),
        };
        MyMovieAdapter myMovieAdapter = new MyMovieAdapter(myMovieData,MainActivity29.this);
        recyclerView.setAdapter(myMovieAdapter);
    }



}