package com.example.rufflez.myapplication;

/**
 * Created by A$hok on 14-02-2016.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {
    Button b5,b6,b7,b8,b9,b10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.administration);


        b5 = (Button) findViewById(R.id.button5);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ThirdActivity.this, Ad_vc.class);
                startActivity(i);

            }
        });
        b6 = (Button) findViewById(R.id.button6);

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ThirdActivity.this, Ad_rector.class);
                startActivity(i);

            }
        });
        b7 = (Button) findViewById(R.id.button7);

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ThirdActivity.this, Ad_registrar.class);
                startActivity(i);

            }
        });
        b8 = (Button) findViewById(R.id.button8);

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ThirdActivity.this, Ad_btech.class);
                startActivity(i);

            }
        });
        b9 = (Button) findViewById(R.id.button9);

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ThirdActivity.this, Ad_farmcy.class);
                startActivity(i);

            }
        });
        b10 = (Button) findViewById(R.id.button15);

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ThirdActivity.this, Ad_arts.class);
                startActivity(i);

            }
        });



    }


}

