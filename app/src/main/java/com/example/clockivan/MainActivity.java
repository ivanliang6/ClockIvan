package com.example.clockivan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        Button tw4button = findViewById(R.id.button5);
        tw4button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextClock textClock = findViewById(R.id.textView3);
                TextClock textClock1 = findViewById(R.id.textView6);
                TextClock textClock2 = findViewById(R.id.textView9);
                TextClock textClock3 = findViewById(R.id.textView12);
                TextClock textClock4 = findViewById(R.id.textView15);
                textClock.setFormat12Hour("HH:mm:ss");
                textClock.setFormat24Hour(null);
                textClock1.setFormat12Hour("HH:mm:ss");
                textClock1.setFormat24Hour(null);
                textClock2.setFormat12Hour("HH:mm:ss");
                textClock2.setFormat24Hour(null);
                textClock3.setFormat12Hour("HH:mm:ss");
                textClock3.setFormat24Hour(null);
                textClock4.setFormat12Hour("HH:mm:ss");
                textClock4.setFormat24Hour(null);



            }
        });

        Button twbutton = findViewById(R.id.button3);
        twbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextClock textClock = findViewById(R.id.textView3);
                TextClock textClock1 = findViewById(R.id.textView6);
                TextClock textClock2 = findViewById(R.id.textView9);
                TextClock textClock3 = findViewById(R.id.textView12);
                TextClock textClock4 = findViewById(R.id.textView15);
                textClock.setFormat12Hour(null);
                textClock.setFormat24Hour("hh:mm:ss a");
                textClock1.setFormat12Hour(null);
                textClock1.setFormat24Hour("hh:mm:ss a");
                textClock2.setFormat12Hour(null);
                textClock2.setFormat24Hour("hh:mm:ss a");
                textClock3.setFormat12Hour(null);
                textClock3.setFormat24Hour("hh:mm:ss a");
                textClock4.setFormat12Hour(null);
                textClock4.setFormat24Hour("hh:mm:ss a");



            }
        });

    }





    }













