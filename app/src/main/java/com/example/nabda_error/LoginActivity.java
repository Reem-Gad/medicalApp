package com.example.nabda_error;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button logBut;
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        logBut=(Button)findViewById(R.id.signin);
        logBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  Intent intentToHome=new Intent(getApplicationContext(),MainHome.class);
                startActivity(intentToHome);
            }
        });

        signup=(TextView)findViewById(R.id.signup_txt);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  Intent intentToSignup=new Intent(getApplicationContext(),SignUpActivity.class);
                  startActivity(intentToSignup);
            }
        });


    }
}