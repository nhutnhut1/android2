package com.example.information;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtEmail, edtHoTen, edtPassWord,edtRePass;
    private Button btnDangKy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtEmail = findViewById(R.id.edtEmail);
        edtHoTen = findViewById(R.id.edtHoTen);
        edtPassWord = findViewById(R.id.edtPassWord);
        edtRePass = findViewById(R.id.edtRePass);
        btnDangKy = findViewById(R.id.btnDangKy);

        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this ,MainActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putString("hoTen", edtHoTen.getText().toString());
                bundle.putString("Email", edtEmail.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}