package com.example.medicalstore;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        RecyclerView recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));





        MyMovieData[] myMovieData = new MyMovieData[]{
                new MyMovieData("Paracetamol","Rs 45 flim",R.drawable.medicine_logo),
                new MyMovieData("Pain Head Disprin","Rs 33",R.drawable.medicine_logo),
                new MyMovieData("Allegra 120mg Tablet","Rs 120",R.drawable.medicine_logo),
                new MyMovieData("Aciloc 150 Tablet","Rs 343",R.drawable.medicine_logo),
                new MyMovieData("Augmentin 625 Duo Tablet","Rs 121",R.drawable.medicine_logo),
                new MyMovieData("Ascoril LS Syrup","Rs 43",R.drawable.medicine_logo),
                new MyMovieData("Azithral 500 Tablet","Rs 676",R.drawable.medicine_logo),
                new MyMovieData("Avil 25 Tablet","Rs 14",R.drawable.medicine_logo),
                new MyMovieData("Azithral 200 Liquid","Rs 7",R.drawable.medicine_logo),
                new MyMovieData("Asthalin 100mcg Inhaler","Rs 129",R.drawable.medicine_logo),
                new MyMovieData("Alprax 0.5mg Tablet SR","Rs not for sale",R.drawable.medicine_logo),
                new MyMovieData("Ativan 1mg Tablet","Rs 454",R.drawable.medicine_logo),
                new MyMovieData("Albendazole 400mg Tablet","Rs 400",R.drawable.medicine_logo),
                new MyMovieData("Aldactone Tablet","Rs 232",R.drawable.medicine_logo),
                new MyMovieData("Altraday Capsule SR","Rs 434",R.drawable.medicine_logo),
                new MyMovieData("Altraday Capsule SR","Rs 98",R.drawable.medicine_logo),
                new MyMovieData("Ascoril D Plus Syrup Sugar Free","Rs 67",R.drawable.medicine_logo),
                new MyMovieData("Ambrodil-S Syrup","Rs 24",R.drawable.medicine_logo),
                new MyMovieData("Ativan 2mg Tablet","Rs not for sale",R.drawable.medicine_logo),
        };
        MyMovieAdapter myMovieAdapter = new MyMovieAdapter(myMovieData,MainActivity2.this);
        recyclerView.setAdapter(myMovieAdapter);
    }
}