package com.example.nabda_error;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class protect extends AppCompatActivity {


    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protect);

        viewPager=(ViewPager)findViewById(R.id.viewpager);
        ImageAdapter adpater=new ImageAdapter(this);
        viewPager.setAdapter(adpater);



    }
}