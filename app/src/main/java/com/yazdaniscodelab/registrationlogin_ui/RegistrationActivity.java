package com.yazdaniscodelab.registrationlogin_ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        signup=(Button)findViewById(R.id.signup_btn);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Registration Successfully",Toast.LENGTH_LONG).show();

                startActivity(new Intent(RegistrationActivity.this,MainActivity.class));
            }
        });

    }
}
