package com.example.intentex;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;

public class AC2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac2);



        Button t1=findViewById(R.id.text1);
        Button t2=findViewById(R.id.text2);
        Button t3=findViewById(R.id.text3);

        Intent intent=getIntent();
        String letter = intent.getStringExtra("char");

        switch (letter) {
            case "a":
                t1.setText("apple");
                t2.setText("action");
                t3.setText("addition");
                break;
            case "b":
                t1.setText("blue");
                t2.setText("black");
                t3.setText("bear");
                break;
            case "c":
                t1.setText("clear");
                t2.setText("condition");
                t3.setText("control");

                break;
            default:

                t1.setText("date");
                t2.setText("drink");
                t3.setText("door");
                break;
        }

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent search = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.google.com/search?q="+t1.getText().toString()));
                startActivity(search);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent search = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.google.com/search?q="+t2.getText().toString()));
                startActivity(search);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent search = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.google.com/search?q="+t3.getText().toString()));
                startActivity(search);
            }
        });


    }
}