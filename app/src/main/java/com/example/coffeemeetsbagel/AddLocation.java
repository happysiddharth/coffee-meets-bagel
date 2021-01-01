package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Tagss","w");
                Intent intent = new Intent(getApplicationContext(),PreviouslyDated.class);
                startActivity(intent);
            }
        });
    }
    private void init(){
        backBtn = findViewById(R.id.prevousPageImgBtn);
        nextBtn = findViewById(R.id.nextPageBtn);
    }
}