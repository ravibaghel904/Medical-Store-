package com.example.medicalstore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.medicalstore.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void booktestlab(View v) {
        Intent i = new Intent(MainActivity.this,Book_testLab.class);
        startActivity(i);

    }

    public void listallmedicine(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);

    }
    public void ten(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);

    }
    public void appointment(View v) {
        Intent i = new Intent(MainActivity.this,MainActivity16.class);
        startActivity(i);

    }
    public void twenty(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);

    }
    public void mens(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);

    }
    public void drinks(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity25.class);
        startActivity(i);

    }
    public void shampoo(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);

    }
    public void sexuall(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);

    }
    public void oralcare(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);

    }
    public void kidney(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);

    }
    public void eyecare(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);

    }
    public void skin(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);

    }
    public void treatment(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);

    }
    public void diabetes(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);

    }
    public void fitness(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);

    }
    public void heart(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);

    }
    public void liver(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);

    }
    public void hair(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);

    }
}
