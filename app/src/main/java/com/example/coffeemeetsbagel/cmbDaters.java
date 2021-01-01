package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class cmbDaters extends AppCompatActivity {

    private Button nextBtn;
    ImageView backFromcmbDaters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmb_daters);
        init();
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),uploadPhotoToIntroduce.class);
                startActivity(intent);
            }
        });
        backFromcmbDaters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void init(){
        nextBtn = findViewById(R.id.nextPageBtn);
        backFromcmbDaters = findViewById(R.id.backFromcmbDaters);
    }
}