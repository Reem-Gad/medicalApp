package com.example.nabda_error;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class coronaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corona);
        final CardView cv11 , cv12,cv13,cv14;

        // GridLayout gridLayout=findViewById(R.id.gradview);
        cv11=(CardView)findViewById(R.id.cv11);
        cv12=(CardView)findViewById(R.id.cv12);
        cv13=(CardView)findViewById(R.id.cv13);
        cv14=(CardView)findViewById(R.id.cv14);

        cv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getApplicationContext(),diagnose.class);
                startActivity(intent);
            }
        });

        cv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getApplicationContext(),protect.class);
                startActivity(intent);

            }
        });

        cv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),verses.class);
                startActivity(intent);

            }
        });

        cv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),faqs.class);
                startActivity(intent);
            }
        });



    }
}