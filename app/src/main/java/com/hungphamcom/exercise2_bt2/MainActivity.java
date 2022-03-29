package com.hungphamcom.exercise2_bt2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button green = findViewById(R.id.green);
        Button blue = findViewById(R.id.blue);
        Button red = findViewById(R.id.red);
        Button orange = findViewById(R.id.orange);

        View.OnClickListener onRadioButtonClicked=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checked=((RadioButton)view).isChecked();
                switch(view.getId()){
                    case R.id.green:
                    {
                        int color = Color.parseColor("#B5EAD8");
                        setActivityBackgroundColor(color);
                        break;
                    }
                    case R.id.red:
                    {
                        int color = Color.parseColor("#F294A5");
                        setActivityBackgroundColor(color);
                        break;
                    }
                    case R.id.blue:
                    {
                        int color = Color.parseColor("#D0D9F2");
                        setActivityBackgroundColor(color);
                        break;
                    }
                    case R.id.orange:
                    {
                        int color = Color.parseColor("#F2CFBB");
                        setActivityBackgroundColor(color);
                        break;
                    }
                }
            }
        };
        green.setOnClickListener(onRadioButtonClicked);
        red.setOnClickListener(onRadioButtonClicked);
        blue.setOnClickListener(onRadioButtonClicked);
        orange.setOnClickListener(onRadioButtonClicked);
    }



    public void setActivityBackgroundColor(int color) {
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }





}