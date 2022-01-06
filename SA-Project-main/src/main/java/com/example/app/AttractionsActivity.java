package com.example.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new AttractionsFragment()).commit();

    }
}
