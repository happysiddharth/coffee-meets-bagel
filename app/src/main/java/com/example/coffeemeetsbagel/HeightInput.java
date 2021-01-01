package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HeightInput extends AppCompatActivity {
    private Button height1,height2,height3,tonextpage;
    Button current;
    private ImageView backfromHeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height_input);
        init();
        current= height2;
        height1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                height1.setTypeface(height1.getTypeface(), Typeface.BOLD);
                current.setTypeface(current.getTypeface(), Typeface.ITALIC);
                current = height1;
            }
        });
        height2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                height2.setTypeface(height2.getTypeface(), Typeface.BOLD);
                current.setTypeface(current.getTypeface(), Typeface.ITALIC);
                current = height2;
            }
        });
        height3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                height3.setTypeface(height3.getTypeface(), Typeface.BOLD);
                current.setTypeface(current.getTypeface(), Typeface.ITALIC);
                current = height3;
            }
        });
        tonextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Ethnicity.class);
                startActivity(intent);
            }
        });
        backfromHeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              finish();
            }
        });

    }
    private void init(){
        height1 = findViewById(R.id.height1);
        height2 = findViewById(R.id.height2);
        height3 = findViewById(R.id.height3);
        tonextpage = findViewById(R.id.tonextpage);
        backfromHeight = findViewById(R.id.backfromHeight);
    }
}