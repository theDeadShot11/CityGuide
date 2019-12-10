package com.example.cityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ENTERTAINMENT extends AppCompatActivity {

    private Button malls,theaters, restaurants,amusements,cafes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);

        malls =(Button) findViewById(R.id.malls);
        theaters =(Button) findViewById(R.id.theaters);
        restaurants = (Button) findViewById(R.id.restaurants);
        amusements =(Button) findViewById(R.id.amusements);
        cafes = (Button)findViewById(R.id.cafes);

        malls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=malls");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        theaters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=theaters");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=restaurants ");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        amusements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=amusements");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        cafes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=cafes");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });


    }
}
