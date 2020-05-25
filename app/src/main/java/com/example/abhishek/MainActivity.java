package com.example.abhishek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void startGame_SinglePlayer(View view) {
        Intent i = new Intent(this, GameActivity.class);
        startActivity(i);

    }
    public void startGame_multiPlayer(View view) {
        Intent i = new Intent(this, MultiActivity.class);
        startActivity(i);

    }
    public void about(View view) {
        Intent i = new Intent(this, aboutActivity.class);
        startActivity(i);


    }


    }
