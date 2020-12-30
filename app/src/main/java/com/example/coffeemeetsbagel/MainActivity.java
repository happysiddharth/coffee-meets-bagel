package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button fb_login_btn,termnConditionBtn,phoneLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        fb_login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fbLoginIntent = new Intent(getApplicationContext(),IntroStep1.class);
                startActivity(fbLoginIntent);
            }
        });
        phoneLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewEnterPhoneNo = new Intent(MainActivity.this,EnterPhoneNoToSignup.class);
                startActivity(viewEnterPhoneNo);
            }
        });
    }

    private void init(){
        fb_login_btn = findViewById(R.id.fb_login_btn);
        termnConditionBtn = findViewById(R.id.termnConditionBtn);
        phoneLogin = findViewById(R.id.phoneLogin);
    }
}