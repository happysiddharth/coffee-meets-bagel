package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chats extends AppCompatActivity {
    private Button suggestedPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chats);
        init();
        suggestedPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),Dashboard.class);
                startActivity(intent);
            }
        });
    }
    private void init(){
        suggestedPage = findViewById(R.id.suggestedPage);
    }
}