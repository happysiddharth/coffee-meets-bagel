package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NiceToMeet extends AppCompatActivity {
private Button niceToMeetbtnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nice_to_meet);
        niceToMeetbtnClick=findViewById(R.id.BtnNice2Meet);
        niceToMeetbtnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lookingpage=new Intent(NiceToMeet.this,whatareYouLookingFor.class);
                startActivity(lookingpage);
            }
        });
    }
}