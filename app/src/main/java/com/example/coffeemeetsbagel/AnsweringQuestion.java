package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnsweringQuestion extends AppCompatActivity {
    private Button BtnAnswering;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answering_question);
        init();
        BtnAnswering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),HeightInput.class);
                startActivity(intent);
            }
        });
    }
    private void init(){
        BtnAnswering = findViewById(R.id.BtnAnswering);
    }
}