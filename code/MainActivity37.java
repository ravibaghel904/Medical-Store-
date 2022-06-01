package com.example.medicalstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity37 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);

        RecyclerView recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));





        MyMovieData[] myMovieData = new MyMovieData[]{
                new MyMovieData("Allopurinol","Rs 45 flim",R.drawable.medicine_logo),
                new MyMovieData("Amoxicillin+Clavulinic acid","Rs 33",R.drawable.medicine_logo),
                new MyMovieData("Atorvastatin","Rs 120",R.drawable.medicine_logo),
                new MyMovieData(" Betamethasone","Rs 343",R.drawable.medicine_logo),
                new MyMovieData("Carboplatin","Rs 121",R.drawable.medicine_logo),
                new MyMovieData("Cefixime","Rs 43",R.drawable.medicine_logo),
                new MyMovieData("Cetrizine","Rs 676",R.drawable.medicine_logo),
                new MyMovieData("Betamethasone","Rs 14",R.drawable.medicine_logo),
                new MyMovieData("Clindamycin\n","Rs not for sale",R.drawable.medicine_logo),
                new MyMovieData("Clopidogrel ","Rs 454",R.drawable.medicine_logo),
                new MyMovieData("Dacarbazine\n","Rs 400",R.drawable.medicine_logo),
                new MyMovieData("","Rs 232",R.drawable.medicine_logo),
                new MyMovieData("Altraday Capsule SR","Rs 434",R.drawable.medicine_logo),
                new MyMovieData("Altraday Capsule SR","Rs 98",R.drawable.medicine_logo),
                new MyMovieData("Amoxicillin+Clavulinic acid","Rs 67",R.drawable.medicine_logo),
                new MyMovieData("Carboplatin","Rs 24",R.drawable.medicine_logo),
                new MyMovieData("Betamethasone","Rs not for sale",R.drawable.medicine_logo),
        };
        MyMovieAdapter myMovieAdapter = new MyMovieAdapter(myMovieData,MainActivity37.this);
        recyclerView.setAdapter(myMovieAdapter);
    }



}