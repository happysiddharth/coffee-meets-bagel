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

public class SelectGender extends AppCompatActivity {
    private RadioButton man,women;
    private Button nextBtn;
    private ImageView backToPrevious;
    private int currentActiveRadioButton = 0,previousActiveRadioButton = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_gender);
        init();
        man.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });

        women.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("Tags",String.valueOf(buttonView.getId()));
                toggleRadioButtion(buttonView.getId());
            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (previousActiveRadioButton!=0){
                    Intent birthdayPageIntent = new Intent(getApplicationContext(),BirthdayDate.class);
                    startActivity(birthdayPageIntent);
                }
            }
        });
        backToPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
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
        }

    }
    private void init(){
        man =  (RadioButton)findViewById(R.id.man);
        women =  (RadioButton)findViewById(R.id.women);

        nextBtn =  findViewById(R.id.nextBtn);
        backToPrevious = findViewById(R.id.backToPrevious);
    }
}