package com.example.cityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.emergency.EmergencyNumber;
import android.view.View;
import android.widget.Button;

public class home_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Button but1 = (Button) findViewById(R.id.button1);
        Button but2 = (Button) findViewById(R.id.button2);
        Button but3 = (Button) findViewById(R.id.button3);
        Button but4 = (Button) findViewById(R.id.button4);
        Button but5 = (Button) findViewById(R.id.button5);
        Button but6 = (Button) findViewById(R.id.button6);


        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(),BASIC_AMENITIES.class);
                startActivity(int1);
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(getApplicationContext(),ENTERTAINMENT.class);
                startActivity(int2);
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3 = new Intent(getApplicationContext(),TRANSPORT.class);
                startActivity(int3);
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4 = new Intent(getApplicationContext(), EMERGENCY.class);
                startActivity(int4);
            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5 = new Intent(getApplicationContext(), ATTRACTIONS.class);
                startActivity(int5);
            }
        });


        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6 = new Intent(getApplicationContext(), RELIGIOUS_PLACES.class);
                startActivity(int6);
            }
        });


    }

}


