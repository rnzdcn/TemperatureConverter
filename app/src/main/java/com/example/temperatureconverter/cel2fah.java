package com.example.temperatureconverter;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class cel2fah extends AppCompatActivity {

    ImageButton backBtn;
    Button convertBtn;
    EditText userInput;
    TextView answerTV;
    Double input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cel2fah);

        userInput = findViewById(R.id.c_userInput);
        answerTV = findViewById(R.id.c_answerTV);

        convertBtn = findViewById(R.id.c_convertBtn);
        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cel2fah();
            }
        });

        backBtn = findViewById(R.id.c_backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }

    public  void cel2fah(){
        input = Double.parseDouble(String.valueOf(userInput.getText()));
        Double b = input-32;
        Double formula = b*5/9 ;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String res = String.valueOf(decimalFormat.format(formula));
        answerTV.setText(res +  "°C");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}