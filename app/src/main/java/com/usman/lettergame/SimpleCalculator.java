package com.usman.lettergame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);

        TextView textView = findViewById(R.id.txtViewResult);

        Button addButton = findViewById(R.id.btnAdd);
        Button subButton = findViewById(R.id.btnSubtraction);
        Button mulButton = findViewById(R.id.btnMultiple);
        Button divButton = findViewById(R.id.btnDivide);

        EditText first = findViewById(R.id.editNumberFirst);
        EditText second = findViewById(R.id.editTextNumberSecond);

        String firstNumber = first.getText().toString();
        String secondNumber = second.getText().toString();

        int firstNo = 0;
        try{
            firstNo = Integer.parseInt(firstNumber);
            System.out.println(firstNo); // output = 25
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }

        int secondNo = 0;
        try{
            secondNo = Integer.parseInt(firstNumber);
            System.out.println(secondNo); // output = 25
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }


        int finalSecondNo = secondNo;
        int finalFirstNo = firstNo;
        addButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                textView.setText(finalFirstNo + finalSecondNo);
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                textView.setText(finalFirstNo - finalSecondNo);
            }
        });

        mulButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                textView.setText(finalFirstNo * finalSecondNo);
            }
        });

    }
}