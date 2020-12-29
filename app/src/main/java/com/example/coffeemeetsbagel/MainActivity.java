package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button fb_login_btn,termnConditionBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        termnConditionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewTermNCondition = new Intent(getApplicationContext(),TermsAndPrivacy.class);
                startActivity(viewTermNCondition);
            }
        });
    }
    private void init(){
        fb_login_btn = findViewById(R.id.fb_login_btn);
        termnConditionBtn = findViewById(R.id.termnConditionBtn);
    }
}