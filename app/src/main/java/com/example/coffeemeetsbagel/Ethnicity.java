package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioButton;

public class Ethnicity extends AppCompatActivity {
    private Button ethnicityNext;
    private ImageButton previousBntn;
    private int currentActiveRadioButton = 0,previousActiveRadioButton = 0;
    private RadioButton asia,arab,black,hispanic,nativeAmerican ,pacificIslander,southAsian,white,nepali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ethnicity);
        init();
        ethnicityNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (previousActiveRadioButton!=0){
                   Intent intent = new Intent(getApplicationContext(),Religion.class);
                   startActivity(intent);
               }
            }
        });

        previousBntn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        asia.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });

        arab.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });

        black.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });

        hispanic.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });

        nativeAmerican.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });

        pacificIslander.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });
        southAsian.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });
        white.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });
        nepali.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });



    }
    private void toggleRadioButtion(int currentRadioButtonId){
        if (this.previousActiveRadioButton!=0){

            RadioButton temp = (RadioButton) findViewById(this.previousActiveRadioButton);
            this.previousActiveRadioButton = this.currentActiveRadioButton;

            this.currentActiveRadioButton = currentRadioButtonId;
            temp.setChecked(false);

        }else{
            this.currentActiveRadioButton = currentRadioButtonId;
            this.previousActiveRadioButton = currentRadioButtonId;
            ethnicityNext.setBackground(getDrawable(R.drawable.next_btn_enable));
            ethnicityNext.setTextColor(getResources().getColor(R.color.white));

        }

    }
    private void init(){
        ethnicityNext = findViewById(R.id.regliNext);
        previousBntn = findViewById(R.id.ethnicityPrevious);
        asia = findViewById(R.id.asian);
        arab = findViewById(R.id.arab);
        black = findViewById(R.id.black);
        hispanic = findViewById(R.id.hispanic);
        white = findViewById(R.id.white);
        nativeAmerican = findViewById(R.id.nativeAmerican);
        pacificIslander = findViewById(R.id.pacificIslander);
        southAsian = findViewById(R.id.southAsian);
        nepali = findViewById(R.id.nepali);


    }
}