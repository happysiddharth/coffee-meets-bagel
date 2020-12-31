package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class uploadPhotoToIntroduce extends AppCompatActivity {
    private ImageView prevoiusBtn;
    private Button nextBtn;
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
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),HoldToReloadPage.class);
                startActivity(intent);
            }
        });
    }
    private void init(){
        prevoiusBtn = findViewById(R.id.prevoiusBtn);
        nextBtn = findViewById(R.id.nextPage);

    }
}