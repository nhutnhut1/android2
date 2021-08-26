package com.example.information;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private Button btnFood, btnDrink, btnClose, btnClear;
    private TextView TvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnFood = findViewById(R.id.btnFood);
        btnDrink = findViewById(R.id.btnDrink);
        btnClose = findViewById(R.id.btnClose);
        btnClear = findViewById(R.id.btnClear);
        TvResult = findViewById(R.id.TvResult);




        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivityForResult(intent , 1);

            }
        });

        btnDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity5.class);
                startActivityForResult(intent , 2);
            }
        });

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finishAndRemoveTask();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TvResult.setText("");
            }
        });

    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (TvResult.getText().toString().isEmpty() ) {
            if(requestCode == 1 && resultCode == 1) {
                String a =   data.getStringExtra("bunbo");
                TvResult.setText(a);
            }
            if(requestCode == 1 && resultCode == 2) {
                String a = data.getStringExtra("Pho");
                TvResult.setText(a);
            }
            if(requestCode == 1 && resultCode == 3) {
                String a = data.getStringExtra("bungieu");
                TvResult.setText(a);

            }
            if(requestCode == 1 && resultCode == 4) {
                String a =   data.getStringExtra("hutieu");
                TvResult.setText(a);
            }
            if(requestCode == 1 && resultCode == 5) {
                String a =   data.getStringExtra("miquang");
                TvResult.setText(a);
            }
            if(requestCode == 2 && resultCode == 1){
                String b =   data.getStringExtra("drink");
                TvResult.setText(b);
            }
        }else {
            String a = TvResult.getText().toString() + " - " ;
            if(requestCode == 1 && resultCode == 1) {
                TvResult.setText(a + data.getStringExtra("bunbo"));
            }
            if(requestCode == 1 && resultCode == 2) {
                TvResult.setText(a + data.getStringExtra("Pho"));
            }
            if(requestCode == 1 && resultCode == 3) {
                TvResult.setText(a +  data.getStringExtra("bungieu"));
            }
            if(requestCode == 1 && resultCode == 4) {
                TvResult.setText(a + data.getStringExtra("hutieu"));
            }
            if(requestCode == 1 && resultCode == 5) {
                TvResult.setText(a + data.getStringExtra("miquang"));
            }
            if(requestCode == 2 && resultCode == 1){
                TvResult.setText(a + data.getStringExtra("drink"));
            }

        }

    }


}