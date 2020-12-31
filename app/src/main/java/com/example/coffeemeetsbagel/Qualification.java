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

public class Qualification extends AppCompatActivity {
    private RadioButton bachelor,masters,mba,phd,md,doe,jd,highSchool,secondarySchool,associateDegree,diploma,
            other;
    private int currentActiveRadioButton = 0,previousActiveRadioButton = 0;
    private Button nextBtn;
    private ImageButton ethnicityPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qualification);
        init();
        bachelor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });

        masters.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });

        mba.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });

        phd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });

        doe.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });

        jd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });

        highSchool.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });

        secondarySchool.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });

        associateDegree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });

        diploma.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });

        other.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextpageIntent = new Intent(getApplicationContext(),SchoolName.class);
                startActivity(nextpageIntent);
            }
        });
        ethnicityPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    private void init(){
        nextBtn = findViewById(R.id.regliNext);
        ethnicityPrevious = findViewById(R.id.ethnicityPrevious);
        bachelor = findViewById(R.id.bachelors);
        masters = findViewById(R.id.masters);
        mba = findViewById(R.id.mba);
        phd = findViewById(R.id.phd);
        doe = findViewById(R.id.doe);
        jd = findViewById(R.id.jd);
        highSchool = findViewById(R.id.highSchool);
        secondarySchool = findViewById(R.id.secondarySchool);
        associateDegree = findViewById(R.id.associateDegree);
        diploma = findViewById(R.id.diploma);
        other = findViewById(R.id.diploma);

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

}