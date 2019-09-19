package com.example.android.conroute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    Button Start;
    TextView Forgot , Sign_up ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Start = findViewById(R.id.btn_started) ;
        Forgot = findViewById(R.id.txt_forgot_pass);
        Sign_up = findViewById(R.id.txt_signup_login);

        Sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),create.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
