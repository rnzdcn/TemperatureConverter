package com.example.temperatureconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton celBtn, fahBtn;
    Button nxtBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        celBtn = findViewById(R.id.celsiusRBtn);
        fahBtn = findViewById(R.id.fahrenheitRBtn);

        nxtBtn = findViewById(R.id.nextBtn);
        nxtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(celBtn.isChecked()){
                    Intent cel = new Intent(MainActivity.this,cel2fah.class);
                    startActivity(cel);
                } else if (fahBtn.isChecked()){
                    Intent fah = new Intent(MainActivity.this,fah2cel.class);
                    startActivity(fah);
                } else {
                    Toast.makeText(getApplicationContext(), "Please select temperature", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}