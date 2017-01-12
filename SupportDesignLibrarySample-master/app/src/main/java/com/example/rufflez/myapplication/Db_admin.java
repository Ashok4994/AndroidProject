package com.example.rufflez.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by A$hok on 15-04-2016.
 */
public class Db_admin extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);
EditText e1;
    EditText e2;
    EditText e3;
    Button b;
    String s1,s2,s3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.db_admin);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
        b=(Button)findViewById(R.id.bupdate);
        s1=e1.getText().toString();
        s2=e2.getText().toString();
        s3=e3.getText().toString();






    }

}

