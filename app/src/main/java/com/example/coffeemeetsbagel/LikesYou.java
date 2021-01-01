package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LikesYou extends AppCompatActivity {
    private Button chatBtn,discoverBtn,suggestedPage,profileBtn,toshopFromLikeSYou,toshopFromLikeSYouSubscribe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_likes_you);
        init();
        chatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Chats.class);
                startActivity(intent);
            }
        });
        discoverBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Discover.class);
                startActivity(intent);
            }
        });
        suggestedPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Dashboard.class);
                startActivity(intent);
            }
        });
        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MyProfile.class);
                startActivity(intent);
            }
        });
        toshopFromLikeSYou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Shop.class);
                startActivity(intent);
            }
        });
        toshopFromLikeSYouSubscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Shop.class);
                startActivity(intent);
            }
        });

    }
    private void init(){
        chatBtn = findViewById(R.id.chat);
        discoverBtn = findViewById(R.id.discover);
        suggestedPage = findViewById(R.id.suggestedPage);
        profileBtn = findViewById(R.id.profileBtnLikeYouPage);
        toshopFromLikeSYou = findViewById(R.id.toshopFromLikeSYou);
        toshopFromLikeSYouSubscribe = findViewById(R.id.toshopFromLikeSYouSubscribe);
    }
}