package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HoldToReloadPage extends AppCompatActivity {
    private ImageView prevousBtn,image1,image2,image3,image4,image5,image6,image7,image8,image9;
    private Button nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hold_to_reload_page);
        init();
        prevousBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AnsweringQuestion.class);
                startActivity(intent);
            }
        });
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Tags","a");
                image1.setImageResource(R.drawable.profile_pic);
                image1.setScaleType(ImageView.ScaleType.FIT_XY);
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Tags","a");
                image2.setImageResource(R.drawable.profile_pic);
                image2.setScaleType(ImageView.ScaleType.FIT_XY);
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Tags","a");
                image3.setImageResource(R.drawable.profile_pic);
                image3.setScaleType(ImageView.ScaleType.FIT_XY);
            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Tags","a");
                image4.setImageResource(R.drawable.profile_pic);
                image4.setScaleType(ImageView.ScaleType.FIT_XY);
            }
        });
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Tags","a");
                image5.setImageResource(R.drawable.profile_pic);
                image5.setScaleType(ImageView.ScaleType.FIT_XY);
            }
        });
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Tags","a");
                image6.setImageResource(R.drawable.profile_pic);
                image6.setScaleType(ImageView.ScaleType.FIT_XY);
            }
        });
        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Tags","a");
                image7.setImageResource(R.drawable.profile_pic);
                image7.setScaleType(ImageView.ScaleType.FIT_XY);
            }
        });
        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Tags","a");
                image8.setImageResource(R.drawable.profile_pic);
                image8.setScaleType(ImageView.ScaleType.FIT_XY);
            }
        });
        image9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Tags","a");
                image9.setImageResource(R.drawable.profile_pic);
                image9.setScaleType(ImageView.ScaleType.FIT_XY);
            }
        });



    }
    private void init(){
        prevousBtn = findViewById(R.id.prevoiusPage);
        nextBtn = findViewById(R.id.nextPage);
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        image7 = findViewById(R.id.image7);
        image8 = findViewById(R.id.image8);
        image9 = findViewById(R.id.image9);
    }
}