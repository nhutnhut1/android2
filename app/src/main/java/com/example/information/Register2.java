package com.example.information;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register2 extends AppCompatActivity {

    private EditText edtNhapHoTen, edtDiaChi, edtSDT;
    private Button btnDangKy1, btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        edtNhapHoTen = findViewById(R.id.edtNhapHoTen);
        edtDiaChi = findViewById(R.id.edtDiaChi);
        edtSDT = findViewById(R.id.edtSDT);
        btnDangKy1 = findViewById(R.id.btnDangKy1);
        btnBack = findViewById(R.id.btnBack);


        btnDangKy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNhapHoTen.getText().toString().length() != 0 && edtDiaChi.getText().toString().length() != 0 && edtSDT.getText().toString().length() != 0 ) {
                    Intent intent = new Intent(Register2.this ,Login.class);
                    Intent intent1 = getIntent();
                    intent.putExtra("name" , intent1.getStringExtra("name"));
                    intent.putExtra("pass", intent1.getStringExtra("pass"));
                    intent.putExtra("hoTen", edtNhapHoTen.getText().toString());
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = getIntent();
//                intent.putExtra("name", intent.getStringExtra("name"));
//                intent.putExtra("pass", intent.getStringExtra("pass"));
//                intent.putExtra("repass", intent.getStringExtra("repass"));
//                setResult(1,intent);
                finish();

            }
        });

    }
}