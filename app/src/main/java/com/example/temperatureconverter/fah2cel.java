package com.example.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class fah2cel extends AppCompatActivity {

    ImageButton backBtn;
    Button convertBtn;
    EditText userInput;
    TextView answerTV;
    Double input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fah2cel);

        userInput = findViewById(R.id.f_userInput);
        answerTV = findViewById(R.id.f_answerTV);

        convertBtn = findViewById(R.id.f_convertBtn);
        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fah2cel();
            }
        });

        backBtn = findViewById(R.id.f_backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    public  void fah2cel(){
        input=Double.parseDouble(String.valueOf(userInput.getText()));
        Double b=input*9/5+32;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String res=String.valueOf(decimalFormat.format(b));
        answerTV.setText(res + "°F");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}