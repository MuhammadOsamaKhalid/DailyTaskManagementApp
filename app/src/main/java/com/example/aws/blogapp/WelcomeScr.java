package com.example.aws.blogapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aws.blogapp.Activities.LoginActivity;
import com.example.aws.blogapp.Activities.RegisterActivity;

public class WelcomeScr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_scr);

        configureLoginButton();
        configureRegisterButton();
    }

    public void configureLoginButton(){
        Button LoginButton = (Button) findViewById(R.id.logBtn);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginActivity = new Intent(getApplicationContext(), com.example.aws.blogapp.Activities.LoginActivity.class);
                startActivity(loginActivity);
                finish();
            }
        });
    }
    public void configureRegisterButton(){
        Button RegisterButton = (Button) findViewById(R.id.regBtn);
        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterActivity = new Intent(getApplicationContext(), com.example.aws.blogapp.Activities.RegisterActivity.class);
                startActivity(RegisterActivity);
                finish();
            }
        });
    }
}
