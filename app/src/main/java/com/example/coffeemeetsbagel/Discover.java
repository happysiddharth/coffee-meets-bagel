package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Discover extends AppCompatActivity {
    private CardView card1,card2,card3,card4;
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
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ProfilePage.class);
                intent.putExtra("photo","");
                startActivity(intent);
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ProfilePage.class);
                intent.putExtra("photo","");
                startActivity(intent);
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ProfilePage.class);
                intent.putExtra("photo","");
                startActivity(intent);
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ProfilePage.class);
                intent.putExtra("photo","");
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
        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        card4 = findViewById(R.id.card4);
    }
}