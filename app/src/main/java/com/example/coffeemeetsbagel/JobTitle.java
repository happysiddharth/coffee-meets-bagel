package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class JobTitle extends AppCompatActivity {
    private ImageButton jobTitleBackBtn;
    private Button jobTitleNextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_title);
        init();
        jobTitleBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        jobTitleNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Qualification.class);
                startActivity(intent);
            }
        });
    }
    private void init(){
        jobTitleBackBtn = findViewById(R.id.jobTitleBackBtn);
        jobTitleNextBtn = findViewById(R.id.jobTitleNextBtn);
    }
}