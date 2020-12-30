package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;

public class EnterPhoneNoToSignup extends AppCompatActivity {
    private ImageView backtoprevious;
    private Button getStartedBtn;
    private EditText phoneNumber;
    private Intent otpPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_phone_no_to_signup);
        init();

        backtoprevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        phoneNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d("Tags","before"+String.valueOf(s.toString().length()));

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length()==10){
                    otpPage = new Intent(EnterPhoneNoToSignup.this, OtpPage.class);
                    otpPage.putExtra("phone",s.toString());
                    otpPage.putExtra("country_code","+91");
                    getStartedBtn.setBackground(getDrawable(R.drawable.next_btn_enable));
                    getStartedBtn.setTextColor(getResources().getColor(R.color.white));
                    Log.d("Tags",String.valueOf(s.toString().length()));
                    String onlyNumberRegex = "^[0-9]*$";
                    if (s.toString().matches(onlyNumberRegex)){
                        getStartedBtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                startActivity(otpPage);
                            }
                        });
                    }else{
                        phoneNumber.setError("Type not accepted");
                    }

                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("Tags","after"+String.valueOf(s.toString().length()));
                if (s.toString().length()<10){
                    getStartedBtn.setOnClickListener(null);
                    getStartedBtn.setBackground(getDrawable(R.drawable.rectangle_bg));
                    getStartedBtn.setTextColor(R.color.darkgrey);
                }
            }
        });
    }

    private void init() {
        getStartedBtn = findViewById(R.id.btnEnterphno);
        backtoprevious = findViewById(R.id.backToPrevious);
        phoneNumber = findViewById(R.id.rect2v);
    }
}