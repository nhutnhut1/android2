
package com.example.information;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TrangChu extends AppCompatActivity {

    private TextView TvShowThongTin;
    private Button btnCall,btnOpenWeb, btnXemBeo, btnOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);

        TvShowThongTin = findViewById(R.id.TvShowThongTin);
        btnCall = findViewById(R.id.btnCall);
        btnOpenWeb = findViewById(R.id.btnOpenWeb);
        btnXemBeo = findViewById(R.id.btnXemBeo);
        btnOrder = findViewById(R.id.btnOrder);


        Intent intent = getIntent();
        TvShowThongTin.setText("Hello Bro " + intent.getStringExtra("hoTen") + "( " + intent.getStringExtra("name") + " )");

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + 123123123));

                startActivity(callIntent);
            }
        });

        btnOpenWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                startActivity(intent);
            }
        });
        btnXemBeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrangChu.this , height.class);
                startActivity(intent);
            }
        });
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrangChu.this , MainActivity3.class);
                startActivity(intent);
            }
        });


    }


}