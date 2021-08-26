package com.example.information;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView TvName, TvEmail;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TvEmail = findViewById(R.id.TvEmail);
        TvName = findViewById(R.id.TvName);

        Intent intent = getIntent();
        Bundle bungdle = intent.getExtras();
        String hoTenBungdle = bungdle.getString("hoTen", "");
        String EmailBungdle = bungdle.getString("Email", "");


        TvName.setText(" Họ và tên : " + hoTenBungdle);
        TvEmail.setText(" Email : " + EmailBungdle);

    }
}