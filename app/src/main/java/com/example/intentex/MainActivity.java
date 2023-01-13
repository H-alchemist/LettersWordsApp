package com.example.intentex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button a=findViewById(R.id.A);
        Button b=findViewById(R.id.B);
        Button c=findViewById(R.id.C);
        Button d=findViewById(R.id.D);
        Intent in=new Intent(this,AC2.class);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            in.putExtra("char","a");
            startActivity(in);
            }

        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in.putExtra("char","b");
                startActivity(in);
            }

        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in.putExtra("char","c");
                startActivity(in);
            }

        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View d) {
                in.putExtra("char","d");
                startActivity(in);
            }

        });




    }
}