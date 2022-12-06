package com.example.kpopchreography;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BTS_IDOL_FANCAM_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bts_idol_fancam);


        Button bts_idol_fancam_jeongguk = (Button) findViewById(R.id.bts_idol_fancam_jeongguk);
        bts_idol_fancam_jeongguk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BTS_IDOL_JEONGGUK_Activity.class);
                startActivity(intent);
            }
        });


        Button bts_idol_fancam_jhope = (Button) findViewById(R.id.bts_idol_fancam_jhope);
        bts_idol_fancam_jhope.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BTS_IDOL_JHOPE_Activity.class);
                startActivity(intent);
            }
        });

        Button bts_idol_fancam_jimin = (Button) findViewById(R.id.bts_idol_fancam_jimin);
        bts_idol_fancam_jimin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BTS_IDOL_JIMIN_Activity.class);
                startActivity(intent);
            }
        });

        Button bts_idol_fancam_v = (Button) findViewById(R.id.bts_idol_fancam_v);
        bts_idol_fancam_v.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BTS_IDOL_V_Activity.class);
                startActivity(intent);
            }
        });

    Button bts_idol_fancam_rm = (Button) findViewById(R.id.bts_idol_fancam_rm);
        bts_idol_fancam_rm.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), BTS_IDOL_RM_Activity.class);
            startActivity(intent);
        }
    });
        Button bts_idol_fancam_sugar = (Button) findViewById(R.id.bts_idol_fancam_sugar);
        bts_idol_fancam_sugar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BTS_IDOL_SUGAR_Activity.class);
                startActivity(intent);
            }
        });
        Button bts_idol_fancam_jin = (Button) findViewById(R.id.bts_idol_fancam_jin);
        bts_idol_fancam_jin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BTS_IDOL_JIN_Activity.class);
                startActivity(intent);
            }
        });
}
}



