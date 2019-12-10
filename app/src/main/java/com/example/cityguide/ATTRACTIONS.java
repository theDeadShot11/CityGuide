package com.example.cityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ATTRACTIONS extends AppCompatActivity {

    private Button gardens,museums, histoplaces,zoo,artgallery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);

        gardens =(Button) findViewById(R.id.gardens);
        museums =(Button) findViewById(R.id.museums);
        zoo = (Button) findViewById(R.id.zoo);
        histoplaces =(Button) findViewById(R.id.histoplaces);
        artgallery = (Button)findViewById(R.id.artgallery);

        gardens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=gardens");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        museums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=museums");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        histoplaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=historical places");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        zoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=zoos");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        artgallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=art gallery");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });


    }
}
