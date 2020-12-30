package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntoPage3Final extends AppCompatActivity {
    private Button letsDothisBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_into_page3_final);
        init();
        letsDothisBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getUserName = new Intent(getApplicationContext(),callUsCMB.class);
                startActivity(getUserName);
            }
        });
    }
    private void init(){
        letsDothisBtn = findViewById(R.id.letsDothisBtn);
    }
}