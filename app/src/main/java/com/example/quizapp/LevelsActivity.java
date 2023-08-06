package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quizapp.levels.LevelActivity1;

public class LevelsActivity extends AppCompatActivity {
    Button btnback;
    TextView level1, level2, level3, level4, level5, level6, level7, level8;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
        level1 = findViewById(R.id.level1);
        level2 = findViewById(R.id.level2);
        level3 = findViewById(R.id.level3);
        level4 = findViewById(R.id.level4);
        level5 = findViewById(R.id.level5);
        level6 = findViewById(R.id.level6);
        level7 = findViewById(R.id.level7);
        level8 = findViewById(R.id.level8);
        btnback = findViewById(R.id.button);
        btnback.setOnClickListener(view -> {
            Intent i = new Intent(LevelsActivity.this, MainActivity.class);
            startActivity(i);
            finish();
        });
        level1.setOnClickListener(view -> {
            Intent intent = new Intent(this, LevelActivity1.class);
            startActivity(intent);
            finish();
        });

    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(LevelsActivity.this, MainActivity.class);
        startActivity(i);
        finish();
        }

    }
