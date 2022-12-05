package com.usman.lettergame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        char[] skyLetter = {'b', 'd', 'f', 'h', 'k', 'l', 't'};
        char[] grassLetter = {'a', 'c', 'e', 'i', 'm', 'n', 'o', 'r', 's', 'u', 'v', 'w', 'x', 'z'};
        char[] rootLetter = {'g', 'j', 'p', 'q', 'y'};

        Button skyButton = findViewById(R.id.btnSky);
        Button grassButton = findViewById(R.id.btnGrass);
        Button rootButton = findViewById(R.id.btnRoot);

        TextView character = findViewById(R.id.txtViewCharacter);
        TextView guessView = findViewById(R.id.txtViewGuessResult);

        Random random = new Random();
        int firstRand = random.nextInt(3);
        if(firstRand == 0)
        {
            int secondRandom = random.nextInt(skyLetter.length);
            character.setText(Character.toString(skyLetter[secondRandom]));

            skyButton.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View view) {
                    guessView.setText("Awesome");
                }
            });
        }
        else
        {
            guessView.setText("Try Again");
        }

        if(firstRand == 1)
        {
            int secondRandom = random.nextInt(grassLetter.length);
            character.setText(Character.toString(grassLetter[secondRandom]));
            grassButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    guessView.setText("Awesome");
                }
            });
        }
        else
        {
            guessView.setText("Try Again");
        }

        if(firstRand == 2)
        {
            int secondRandom = random.nextInt(rootLetter.length);
            character.setText(Character.toString(rootLetter[secondRandom]));
            rootButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    guessView.setText("Awesome");
                }
            });
        }
        else
        {
            guessView.setText("Try, Try Again!");
        }

    }
}