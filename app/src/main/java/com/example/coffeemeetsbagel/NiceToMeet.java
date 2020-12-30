package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NiceToMeet extends AppCompatActivity {
    private Button niceToMeetbtnClick;
    private TextView name;
    private EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nice_to_meet);
        init();
        if (getIntent()!=null){
            niceToMeetbtnClick=findViewById(R.id.BtnNice2Meet);
            niceToMeetbtnClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (validateEmail()){
                        Intent lookingpage=new Intent(NiceToMeet.this,whatareYouLookingFor.class);
                        startActivity(lookingpage);
                    }

                }
            });
            name.setText("Nice to meet you, "+getIntent().getExtras().get("firstName").toString()+" "
                            +getIntent().getExtras().get("lastName").toString()+", Whats your email ?");
        }

    }
    private Boolean validateEmail(){
        String temp = email.getEditableText().toString();
        if ((!TextUtils.isEmpty(temp) && Patterns.EMAIL_ADDRESS.matcher(temp).matches())==true){
            return true;
        }
        email.setError("Incorrect email");
        return false;
    }
    private void init(){
        name = findViewById(R.id.nameofuser);
        email = findViewById(R.id.email);
    }
}