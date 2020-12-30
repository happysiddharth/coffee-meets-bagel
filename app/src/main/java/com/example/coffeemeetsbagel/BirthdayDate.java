package com.example.coffeemeetsbagel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageButton;

import java.util.Calendar;

public class BirthdayDate extends AppCompatActivity {
    private CalendarView calendar;
    private Button nextBtn;
    private ImageButton prevousPageImgBtn;
    private Boolean isDateSelected = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_date);
        init();
        nextBtn.setTextColor(getResources().getColor(R.color.white));

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                isDateSelected = true;
                nextBtn.setBackground(getDrawable(R.drawable.next_btn_enable));
            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isDateSelected==true){
                    Intent nextpage = new Intent(getApplicationContext(),AddLocation.class);
                    startActivity(nextpage);
                }
            }
        });
        prevousPageImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void init(){
        calendar = findViewById(R.id.calendarView);
        nextBtn = findViewById(R.id.nextBtn);
        prevousPageImgBtn = findViewById(R.id.prevousPageImgBtn);
    }
}