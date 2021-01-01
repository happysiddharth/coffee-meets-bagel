package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Setting extends AppCompatActivity {
    private ImageView backbtnSettingPage,backtoPrevoiousFromSettings;
    private Button logoutBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        init();
        backtoPrevoiousFromSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logout = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(logout);
            }
        });
    }
    private void init(){
        backtoPrevoiousFromSettings = findViewById(R.id.backtoPrevoiousFromSettings);
        logoutBtn = findViewById(R.id.logoutBtn);
    }
}