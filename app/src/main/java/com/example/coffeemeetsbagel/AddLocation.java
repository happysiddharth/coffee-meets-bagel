package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AddLocation extends AppCompatActivity {
    ImageButton backBtn;
    Button nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_location);
        init();
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void init(){
        backBtn = findViewById(R.id.prevousPageImgBtn);
        nextBtn = findViewById(R.id.nextBtn);
    }
}