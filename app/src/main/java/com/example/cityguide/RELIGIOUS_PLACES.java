package com.example.cityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RELIGIOUS_PLACES extends AppCompatActivity {

    private Button temples,mosque,churches;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religious__places);

        temples =(Button) findViewById(R.id.temples);
        mosque =(Button) findViewById(R.id.mosques);
        churches = (Button) findViewById(R.id.churches);

        temples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=temples");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        mosque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=mosque");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        churches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri= Uri.parse("geo:0,0?q=churches");
                Intent intent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });


    }
}
