package com.example.nabda_error;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        final CardView cv1 , cv2,cv3,cv4,cv5,cv6,cv7,cv8,cv9,cv10;
        //   GridLayout gridLayout=findViewById(R.id.grad);
        cv1=(CardView)findViewById(R.id.cv1);
        cv2=(CardView)findViewById(R.id.cv2);
        cv3=(CardView)findViewById(R.id.cv3);
        cv4=(CardView)findViewById(R.id.cv4);
        cv5=(CardView)findViewById(R.id.cv5);
        cv6=(CardView)findViewById(R.id.cv6);
        cv7=(CardView)findViewById(R.id.cv7);

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getApplicationContext(),coronaActivity.class);
                startActivity(intent);

            }
        });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),qesm1.class);
                startActivity(intent);

            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),qesm2.class);
                startActivity(intent);

            }
        });
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),qesm3.class);
                startActivity(intent);

            }
        });
        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),qesm4.class);
                startActivity(intent);

            }
        });
        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),qesm5.class);
                startActivity(intent);

            }
        });
        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),qesm6.class);
                startActivity(intent);

            }
        });




    }
}