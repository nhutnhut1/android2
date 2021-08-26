package com.example.information;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    private Button btnBunBo, btnPho, btnBunRieu, btnHuTieu, btnMiQuang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btnBunBo = findViewById(R.id.btnBunBo);
        btnPho = findViewById(R.id.btnPho);
        btnBunRieu = findViewById(R.id.btnBunRieu);
        btnHuTieu = findViewById(R.id.btnHuTieu);
        btnMiQuang = findViewById(R.id.btnMiQuang);


        btnBunBo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("bunbo", "Bún Bò");
                setResult(1, intent);
                finish();
            }
        });

        btnPho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("Pho", "Phở");
                setResult(2, intent);
                finish();
            }
        });
        btnBunRieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("bungieu", "Bún Giêu");
                setResult(3, intent);
                finish();
            }
        });

        btnHuTieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("hutieu", "Hủ Tiếu Sài Gòn");
                setResult(4, intent);
                finish();
            }
        });
        btnMiQuang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("miquang", "Mì Quảng");
                setResult(5, intent);
                finish();
            }
        });






    }
}