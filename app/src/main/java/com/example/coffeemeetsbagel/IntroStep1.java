package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntroStep1 extends AppCompatActivity {
    private Button step2Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_step1);
        init();
        step2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent step2Intent = new Intent(getApplicationContext(),IntroPage2.class);
                startActivity(step2Intent);
            }
        });
    }
    private void init(){
        step2Btn = findViewById(R.id.letsDothisBtn);
    }
}