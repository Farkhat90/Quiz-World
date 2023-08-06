package com.example.quizapp.levels;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.quizapp.Array;
import com.example.quizapp.LevelsActivity;
import com.example.quizapp.MainActivity;
import com.example.quizapp.R;

import java.util.Random;

public class LevelActivity1 extends AppCompatActivity {
    TextView textlevel;
    TextView numberLeft, numberRight;
    TextView numberTextLeft, numberTextRight;
    Array array = new Array();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        textlevel = findViewById(R.id.textView4);
        numberLeft = findViewById(R.id.textView5);
        numberRight = findViewById(R.id.textView6);
        numberTextLeft = findViewById(R.id.textView8);
        numberTextRight = findViewById(R.id.textView7);

        Random random = new Random();
        int indexLeft, indexRight;
        do {
            indexLeft = random.nextInt(Array.number.length);
            indexRight = random.nextInt(Array.number.length);
        } while (indexLeft == indexRight);
        numberLeft.setText(String.valueOf(Array.number[indexLeft]));
        numberRight.setText(String.valueOf(Array.number[indexRight]));
        numberTextLeft.setText(Array.numberText[indexLeft]);
        numberTextRight.setText(Array.numberText[indexRight]);
        if (Array.number[indexLeft] > Array.number[indexRight]){
        } else {

        }




        LayoutInflater li = LayoutInflater.from(this);
        View promptsView = li.inflate(R.layout.dialog, null);
        android.app.AlertDialog.Builder alertDialogBuilder = new android.app.AlertDialog.Builder(this);
        alertDialogBuilder.setView(promptsView);
        alertDialogBuilder.setCancelable(true);
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alertDialog.show();

        alertDialog.findViewById(R.id.textView3).setOnClickListener(view -> {
            Intent intent = new Intent(this, LevelsActivity.class);
            startActivity(intent);
            finish();
        });
        alertDialog.findViewById(R.id.button2).setOnClickListener(view -> {
            alertDialog.dismiss();
        });
        findViewById(R.id.button3).setOnClickListener(view -> {
            Intent i = new Intent(this, LevelsActivity.class);
            startActivity(i);
            finish();
        });
        textlevel.setText(R.string.level1);
    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, LevelsActivity.class);
        startActivity(i);
        finish();
    }
}