package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chats extends AppCompatActivity {
    private Button suggestedPage,likePage,discoverPage;
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
        likePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LikesYou.class);
                startActivity(intent);

            }
        });
        discoverPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Discover.class);
                startActivity(intent);
            }
        });
    }
    private void init(){
        suggestedPage = findViewById(R.id.suggestedPage);
        likePage = findViewById(R.id.likePageBtninChatActivity);
        discoverPage = findViewById(R.id.discoverBtninChatActivity);


    }
}