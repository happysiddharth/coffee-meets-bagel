package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PreviouslyDated extends AppCompatActivity {
    ImageButton backFromPrevousDated;
    Button nexFromPrevoislyDated;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previously_dated);
        init();
        backFromPrevousDated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        nexFromPrevoislyDated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(),cmbDaters.class);
               startActivity(intent);
            }
        });
        //cmbDaters.class
    }
    private void init(){
        backFromPrevousDated = findViewById(R.id.backFromPrevousDated);
        nexFromPrevoislyDated = findViewById(R.id.nexFromPrevoislyDated);
    }
}