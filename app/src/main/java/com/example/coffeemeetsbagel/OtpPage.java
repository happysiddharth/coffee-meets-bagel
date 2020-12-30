package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OtpPage extends AppCompatActivity {
  private Button OtpPageBtnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_page);
        OtpPageBtnClick=findViewById(R.id.OtppageBtn);
        OtpPageBtnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callusCMB=new Intent(OtpPage.this,callUsCMB.class);
                startActivity(callusCMB);
            }
        });
    }
}