package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class uploadPhotoToIntroduce extends AppCompatActivity {
    private ImageButton prevoiusBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_photo_to_introduce);
        init();
        prevoiusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void init(){
        prevoiusBtn = findViewById(R.id.prevousPageImgBtn);

    }
}