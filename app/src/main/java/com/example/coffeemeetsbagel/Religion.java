package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Religion extends AppCompatActivity {
    private Button nextPageBtn;
    private ImageButton backfromreligion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religion);
        init();
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),JobTitle.class);
                startActivity(intent);
            }
        });
        backfromreligion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });
    }
    private void init(){
        nextPageBtn = findViewById(R.id.regliNext);
        backfromreligion = findViewById(R.id.backfromreligion);
    }
}