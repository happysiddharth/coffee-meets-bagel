package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class callUsCMB extends AppCompatActivity {
private Button btnCmbClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_us_c_m_b);
        btnCmbClick=findViewById(R.id.BtnCMB);
        btnCmbClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent niceToMeet=new Intent(callUsCMB.this,NiceToMeet.class);
                startActivity(niceToMeet);
            }
        });
    }
}