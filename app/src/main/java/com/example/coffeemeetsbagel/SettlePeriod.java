package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class SettlePeriod extends AppCompatActivity {
    private RadioButton imreadynow,within2years,morethantwoyears,notsure;
    private Button nextBtn;
    private ImageView backToPrevious;
    private int currentActiveRadioButton = 0,previousActiveRadioButton = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settle_period);

        init();

        imreadynow.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });

        within2years.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });

        morethantwoyears.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });

        notsure.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });

        backToPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (previousActiveRadioButton!=0){
                   Intent intentToSelectGender = new Intent(getApplicationContext(),SelectGender.class);
                   startActivity(intentToSelectGender);
               }
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
            nextBtn.setBackground(getDrawable(R.drawable.next_btn_enable));
            nextBtn.setTextColor(getResources().getColor(R.color.white));

        }

    }
    private void init(){
        imreadynow =  (RadioButton)findViewById(R.id.man);
        within2years =  (RadioButton)findViewById(R.id.women);
        morethantwoyears =  (RadioButton)findViewById(R.id.morethantwoyears);
        notsure =  (RadioButton)findViewById(R.id.notsure);
        nextBtn =  findViewById(R.id.nextPageBtn);
        backToPrevious = findViewById(R.id.backToPrevious);
    }
}