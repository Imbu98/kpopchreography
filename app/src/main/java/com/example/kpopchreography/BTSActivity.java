package com.example.kpopchreography;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BTSActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bts);


        Button bts_idol = (Button) findViewById(R.id.BTS_IDOL);
        bts_idol.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BTS_IDOL_Activity.class);
                startActivity(intent);
            }
        });

        Button bts_on = (Button) findViewById(R.id.BTS_ON);
        bts_on.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BTS_ON_Activity.class);
                startActivity(intent);
            }
        });

        Button bts_butter = (Button) findViewById(R.id.BTS_BUTTER);
        bts_butter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BTS_BUTTER_Activity.class);
                startActivity(intent);
            }
        });



    }
}