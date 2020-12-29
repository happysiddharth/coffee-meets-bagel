package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntroPage2 extends AppCompatActivity {
    private Button toStep3Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_page2);
        init();
        toStep3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toStep3Inent = new Intent(getApplicationContext(),IntoPage3Final.class);
                startActivity(toStep3Inent);
            }
        });
    }
    private void init(){
        toStep3Btn = findViewById(R.id.toStep3Btn);
    }
}