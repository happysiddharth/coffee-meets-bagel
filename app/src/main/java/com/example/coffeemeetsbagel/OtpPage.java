package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class OtpPage extends AppCompatActivity {
    private Button OtpPageBtnClick;
    private ImageView goToPreviousPage;
    private TextView phonenumber, count, resendOtp;
    private int c = 30;
    private EditText otp1, otp2, otp3, otp4;
    private String defaultPassword ="1234";
    private Character one,two,three,four;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_page);
        init();
        if (getIntent() != null) {
            phonenumber.setText(" " + getIntent().getExtras().get("country_code").toString() + " " + getIntent().getExtras().get("phone").toString());
            otp1.requestFocus();
            CountDownTimer countDownTimer = new CountDownTimer((30000), 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    c--;
                    count.setText(" within " + String.valueOf(c) + " sec.");
                }

                @Override
                public void onFinish() {
                    // Do your other task on finish
                    Log.d("Tags", "finishde");
                    resendOtp.setTextColor(getResources().getColor(R.color.appBlue));
                }
            }.start();
            otp1.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    Log.d("Tags", "before" + String.valueOf(s.toString().length()));

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if (s.length() == 10) {

                    }
                }

                @Override
                public void afterTextChanged(Editable s) {
                    Log.d("Tags", "after" + String.valueOf(s.toString().length()));
                    if (s.toString().length()==1){
                        one = s.charAt(0);
                        otp2.requestFocus();
                    }

                }
            });

            otp2.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    Log.d("Tags", "before" + String.valueOf(s.toString().length()));

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if (s.length() == 10) {

                    }
                }

                @Override
                public void afterTextChanged(Editable s) {
                    Log.d("Tags", "after" + String.valueOf(s.toString().length()));
                    if (s.toString().length()==1){
                        two = s.charAt(0);

                        otp3.requestFocus();
                    }else {
                        otp1.requestFocus();

                    }

                }
            });

            otp3.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    Log.d("Tags", "before" + String.valueOf(s.toString().length()));

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if (s.length() == 10) {

                    }
                }

                @Override
                public void afterTextChanged(Editable s) {
                    Log.d("Tags", "after" + String.valueOf(s.toString().length()));
                    if (s.toString().length()==1){
                        three = s.charAt(0);
                        Log.d("Tags",s.toString());

                        otp4.requestFocus();
                    }else{
                        otp2.requestFocus();

                    }

                }
            });

            otp4.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    Log.d("Tags", "before" + String.valueOf(s.toString().length()));

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if (s.length() == 10) {

                    }
                }

                @Override
                public void afterTextChanged(Editable s) {
                    Log.d("Tags", "after" + String.valueOf(s.toString().length()));
                    if (s.toString().length()==1){
                        four = s.charAt(0);

                        OtpPageBtnClick.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent introStep1 = new Intent(OtpPage.this, IntroStep1.class);
                                if (one==defaultPassword.charAt(0) && two==defaultPassword.charAt(1) &&three==defaultPassword.charAt(2) &&four==defaultPassword.charAt(3) ){
                                    startActivity(introStep1);
                                }else {
                                    otp4.setError("Wrong Otp");
                                }

                            }
                        });
                        OtpPageBtnClick.setTextColor(getResources().getColor(R.color.white));
                        OtpPageBtnClick.setBackground(getResources().getDrawable(R.drawable.next_btn_enable));

                    }else{
                        otp3.requestFocus();

                        OtpPageBtnClick.setOnClickListener(null);
                    }

                }
            });
            goToPreviousPage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }

    }

    private void init() {
        OtpPageBtnClick = findViewById(R.id.OtppageBtn);

        phonenumber = findViewById(R.id.phonenumber);
        count = findViewById(R.id.counterText);
        resendOtp = findViewById(R.id.resendOtp);
        otp1 = findViewById(R.id.otp1);
        otp2 = findViewById(R.id.otp2);
        otp3 = findViewById(R.id.otp3);
        otp4 = findViewById(R.id.otp4);
        goToPreviousPage = findViewById(R.id.goToPreviousPage);
    }
}