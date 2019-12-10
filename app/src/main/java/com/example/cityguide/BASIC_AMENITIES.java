package com.example.cityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BASIC_AMENITIES extends AppCompatActivity {

    private Button pp,schools, colleges,markets,orphanage,oah,accomadation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic__amenities);

        pp =(Button) findViewById(R.id.pp);
        schools =(Button) findViewById(R.id.schools);
        colleges = (Button) findViewById(R.id.colleges);
        markets =(Button) findViewById(R.id.markets);
        orphanage = (Button)findViewById(R.id.orphanage);
        oah = (Button)findViewById(R.id.oah);
        accomadation = (Button)findViewById(R.id.accomadation);

        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=petrol pumps");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        schools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=schools");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        colleges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=colleges");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        markets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=markets");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        orphanage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=orpahanges");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        oah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=old age homes");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        accomadation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=hostels");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });


    }
}
