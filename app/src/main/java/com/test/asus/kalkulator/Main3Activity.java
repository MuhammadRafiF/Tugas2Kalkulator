package com.test.asus.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    private EditText angk1,angk2;
    private Button btnjumlah,btnkembali;
    private TextView jumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        angk1 = findViewById(R.id.angka1);
        angk2 = findViewById(R.id.angka2);
        btnjumlah = findViewById(R.id.btnjmlh);
        btnkembali = findViewById(R.id.back);
        jumlah = findViewById(R.id.jmlh);

        btnjumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String a1 = angk1.getText().toString();
                    String a2 = angk2.getText().toString();

                    double angka1 = Double.parseDouble(a1);
                    double angka2 = Double.parseDouble(a2);

                    double hasil = angka1+angka2;

                    String hsl = String.valueOf(hasil);
                    jumlah.setText(hsl);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak Boleh Kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent( Main3Activity.this, Main2Activity.class);
                startActivity(moveIntent);
            }
        });

    }
}
