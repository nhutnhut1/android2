package com.example.information;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText edtName,edtMatKhau;
    private Button btnDangNhap,btnDangKy;
    private CheckBox checkbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtName = findViewById(R.id.edtName);
        edtMatKhau = findViewById(R.id.edtMatKhau);
        btnDangNhap = findViewById(R.id.btnDangNhap);
        btnDangKy = findViewById(R.id.btnDangKy);
        checkbox = findViewById(R.id.checkbox);

        Intent intent = getIntent();
        edtName.setText(intent.getStringExtra("name"));
        edtMatKhau.setText(intent.getStringExtra("pass"));

        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this ,Register.class);
                startActivity(intent);

            }
        });

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!edtName.getText().toString().isEmpty() && !edtMatKhau.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                    Intent  intent = new Intent(Login.this ,TrangChu.class);
                    Intent intent1 = getIntent();
                    intent.putExtra("name", edtName.getText().toString());
                    intent.putExtra("hoTen", intent1.getStringExtra("hoTen"));
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), "Dám vô lậu à ?", Toast.LENGTH_SHORT).show();
                }

            }
        });
            checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtMatKhau.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }else {
                    edtMatKhau.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });

    }

}