package com.example.coffeemeetsbagel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class callUsCMB extends AppCompatActivity {
    private Button btnCmbClick;
    private EditText firstName,secondName;
    private Boolean first=false,second=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_us_c_m_b);
        init();
        btnCmbClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateFirstName()&& validateFirstName()){
                    Intent intent = new Intent(getApplicationContext(),NiceToMeet.class);
                    intent.putExtra("firstName",firstName.getEditableText().toString());
                    intent.putExtra("lastName",secondName.getEditableText().toString());
                    startActivity(intent);
                }
            }
        });

    }
    private void init(){
        btnCmbClick=findViewById(R.id.nextBtn);
        firstName = (EditText)findViewById(R.id.firstName);
        secondName = (EditText)findViewById(R.id.lastName);
    }
    private Boolean validateFirstName(){
        if (firstName.getEditableText().toString().length()>0){
            return true;
        }
        firstName.setError("Enter first name");
        return false;
    }
    private Boolean validateLastName(){
        if (secondName.getEditableText().toString().length()>0){
            return true;
        }
        secondName.setError("Enter last name");

        return false;
    }
}