package com.test.asus.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private Button btnjum,btnkur,btnkal,btnbag,btnkmbl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnjum = findViewById(R.id.Jumlah);
        btnbag = findViewById(R.id.Bagi);
        btnkal = findViewById(R.id.Kali);
        btnkur = findViewById(R.id.Kurang);
        btnkmbl = findViewById(R.id.kembali);

        btnjum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent( Main2Activity.this, Main3Activity.class);
                startActivity(moveIntent);
            }
        });

        btnbag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent( Main2Activity.this, Main6Activity.class);
                startActivity(moveIntent);
            }
        });

        btnkur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent( Main2Activity.this, Main4Activity.class);
                startActivity(moveIntent);
            }
        });

        btnkal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent( Main2Activity.this, Main5Activity.class);
                startActivity(moveIntent);
            }
        });

        btnkmbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent( Main2Activity.this, MainActivity.class);
                startActivity(moveIntent);
            }
        });


    }
}
