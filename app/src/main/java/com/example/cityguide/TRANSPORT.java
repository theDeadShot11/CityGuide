package com.example.cityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TRANSPORT extends AppCompatActivity {

    private Button bustops,rail, airport,ports;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);

        bustops =(Button) findViewById(R.id.bustops);
        rail =(Button) findViewById(R.id.rail);
        airport = (Button) findViewById(R.id.airport);
        ports =(Button) findViewById(R.id.ports);


        bustops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=bus stops");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        rail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=railway station");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        airport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=airport");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        ports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=ports");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });


    }
}
