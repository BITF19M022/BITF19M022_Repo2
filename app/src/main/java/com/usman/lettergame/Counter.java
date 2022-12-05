package com.usman.lettergame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Counter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        final int[] counter = {0};
        TextView textView = findViewById(R.id.txtViewNumber);

        Button incrementButton = findViewById(R.id.btnIncrement);
        Button decrementButton = findViewById(R.id.btnDecrement);
        Button resetButton = findViewById(R.id.btnReset);

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                counter[0]++;
                textView.setText(Integer.toString(counter[0]));
            }
        });

        decrementButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                counter[0]--;
                textView.setText(Integer.toString(counter[0]));
            }
        });


        resetButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                counter[0] = 0;
                textView.setText(Integer.toString(counter[0]));
            }
        });


    }
}