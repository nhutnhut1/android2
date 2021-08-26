package com.example.information;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class height extends AppCompatActivity {

    private EditText edtChieuCao, edtCanNang;
    private Button  btnResult;
    private TextView TvShowResult;
    private Double chieuCao , canNang, Bmi ,canNangLyTuong , a ;
    private String dong1, dong2 , dong3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height);

        edtCanNang = findViewById(R.id.edtCanNang);
        edtChieuCao = findViewById(R.id.edtChieuCao);
        btnResult = findViewById(R.id.btnResult);
        TvShowResult = findViewById(R.id.TvShowResult);



        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 DecimalFormat df = new DecimalFormat("###.##");

                 chieuCao = (Double.parseDouble(edtChieuCao.getText().toString())) ;
                 canNang = (Double.parseDouble(edtCanNang.getText().toString()));
                 Bmi =   canNang/(chieuCao / 100*2);

                 if(Bmi < 18.5) {
                     dong1 = "Chỉ số BMI của bạn :"  + df.format(Bmi) + "\n" + "Bạn bị gầy gòiiii";
                 }if (Bmi > 18 && Bmi < 24.9) {
                    dong1 = "Chỉ số BMI của bạn :"  + df.format(Bmi) + "\n" + "Bạn bình thường êiiii";
                 }if(Bmi > 25 && Bmi < 29.9 ) {
                    dong1 = "Chỉ số BMI của bạn :"  + df.format(Bmi) + "\n" + "Bạn đang tăng cân đóóó";
                 }if(Bmi > 30 && Bmi < 34.9 ) {
                    dong1 = "Chỉ số BMI của bạn :"  + df.format(Bmi) + "\n" + "Bạn béo phì độ I";
                 }if(Bmi > 35 && Bmi < 39.9 ) {
                    dong1 = "Chỉ số BMI của bạn :"  + df.format(Bmi) + "\n" + "Bạn béo phì độ II";
                 }if(Bmi > 40) {
                    dong1 = "Chỉ số BMI của bạn :"  + df.format(Bmi) + "\n" + "Bạn béo phì độ III";
                 }
                DecimalFormat dff = new DecimalFormat("###");
                canNangLyTuong = (chieuCao - 100) * 9 /10;
                dong2 = "Cân nặng lý tưởng của bạn là: " +  dff.format(canNangLyTuong) + " Kg";

                if(canNang > canNangLyTuong) {
                    a = canNang - canNangLyTuong;
                    dong3 = "Bạn thừa " +  dff.format(a) + " Kg";

                }if(canNang < canNangLyTuong) {
                    a = canNangLyTuong - canNang ;
                    dong3 = "Bạn thừa " +  dff.format(a) + " Kg";

                }if(canNang == canNangLyTuong) {

                    dong3 = "Cân nặng của bạn đang lý tưởng - Cố gắng duy trì nhé";

                }

                TvShowResult.setText(dong1 + "\n" + dong2 + "\n" + dong3);







            }
        });


    }
}