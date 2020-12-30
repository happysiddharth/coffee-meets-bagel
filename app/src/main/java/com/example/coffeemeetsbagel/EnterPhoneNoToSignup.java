package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnterPhoneNoToSignup extends AppCompatActivity {

    private Button getStartedBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_phone_no_to_signup);
        getStartedBtn=findViewById(R.id.btnEnterphno);
        getStartedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otpPage=new Intent(EnterPhoneNoToSignup.this,OtpPage.class);
                startActivity(otpPage);
            }
        });
    }
}