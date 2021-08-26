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

public class Register extends AppCompatActivity {

    private EditText edtNhapTen,edtNhapMK,edtNhapLaiMK;
    private Button btnTiepTheo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edtNhapTen = findViewById(R.id.edtNhapTen);
        edtNhapMK = findViewById(R.id.edtNhapMK);
        edtNhapLaiMK = findViewById(R.id.edtNhapLaiMK);
        btnTiepTheo = findViewById(R.id.btnTiepTheo);


        btnTiepTheo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!edtNhapTen.getText().toString().isEmpty()  && !edtNhapMK.getText().toString().isEmpty()  && !edtNhapLaiMK.getText().toString().isEmpty()) {
                    if(edtNhapLaiMK.getText().toString().equals(edtNhapMK.getText().toString())) {
                        Intent intent = new Intent(Register.this , Register2.class);
                        intent.putExtra("name", edtNhapTen.getText().toString());
                        intent.putExtra("pass", edtNhapMK.getText().toString());
                        intent.putExtra("repass", edtNhapLaiMK.getText().toString());
                        startActivity(intent);
                    }else Toast.makeText(getApplicationContext(), "Nhâp mà cũng sai nữa ", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(), "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


}