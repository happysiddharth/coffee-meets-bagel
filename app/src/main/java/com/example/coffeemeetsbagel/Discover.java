package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Discover extends AppCompatActivity {
    private Button chat,suggested,likesPage,gotoProfilePage,toshopFromDiscover;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);
        init();
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Chats.class);
                startActivity(intent);
            }
        });
        suggested.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Dashboard.class);
                startActivity(intent);
            }
        });
        likesPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LikesYou.class);
                startActivity(intent);
            }
        });
        gotoProfilePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MyProfile.class);
                startActivity(intent);
            }
        });
        toshopFromDiscover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Shop.class);
                startActivity(intent);
            }
        });
    }
    private void init(){
        chat = findViewById(R.id.chat);
        suggested = findViewById(R.id.suggestedPage);
        likesPage = findViewById(R.id.likesPageonDiscoverPage);
        gotoProfilePage = findViewById(R.id.gotoProfilePage);
        toshopFromDiscover = findViewById(R.id.toshopFromDiscover);
    }
}