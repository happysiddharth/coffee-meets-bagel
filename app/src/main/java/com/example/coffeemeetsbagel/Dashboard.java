package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {
    private Button chatBtn,discoverBtn,likesYouBtn,profileBtn;
    private ImageView chatImg,likeImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        init();
        chatImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Chats.class);
                startActivity(intent);
            }
        });
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
        likesYouBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LikesYou.class);
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
        likeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent = new Intent(getApplicationContext(),LikesYou.class);
             startActivity(intent);
            }
        });

    }
    private void init(){
        chatBtn = findViewById(R.id.chat);
        chatImg = findViewById(R.id.chatIV);
        discoverBtn = findViewById(R.id.discoverBtn);
        likesYouBtn = findViewById(R.id.likesYouBtn);
        profileBtn = findViewById(R.id.profileBtn);
        likeImage = findViewById(R.id.likeImageView);
    }
}