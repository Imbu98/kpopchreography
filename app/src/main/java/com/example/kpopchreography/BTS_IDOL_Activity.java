package com.example.kpopchreography;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BTS_IDOL_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bts_idol);

        Button bts_idol_choreobtn = (Button) findViewById(R.id.bts_idol_choreo);
        bts_idol_choreobtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BTS_IDOL_CHOREO_Activity.class);
                startActivity(intent);
            }
        });
        Button bts_idol_stageobtn = (Button) findViewById(R.id.bts_idol_stage);
        bts_idol_stageobtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BTS_IDOL_STAGE_Activity.class);
                startActivity(intent);
            }
        });
        Button bts_idol_fancambtn = (Button) findViewById(R.id.bts_idol_fancam);
        bts_idol_fancambtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BTS_IDOL_FANCAM_Activity.class);
                startActivity(intent);
            }
        });

    }
}