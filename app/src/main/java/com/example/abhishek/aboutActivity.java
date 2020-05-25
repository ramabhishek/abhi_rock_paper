package com.example.abhishek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class aboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);





    }

    public void BacktoMainMenu (View  view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }
}
