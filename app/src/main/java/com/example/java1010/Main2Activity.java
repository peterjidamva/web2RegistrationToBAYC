package com.example.java1010;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.service.controls.actions.FloatAction;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Main2Activity extends AppCompatActivity {

    @Override
 protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity2_main);

        FloatingActionButton fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        FloatingActionButton fab3 = (FloatingActionButton) findViewById(R.id.fab3);

        fab1.setOnClickListener(
                v -> {
                    Intent in = new Intent();
                    in.setAction(Intent.ACTION_VIEW);
                    in.setData(Uri.parse("geo:-6.771286929636371, 39.23987923062466"));
                    startActivity(in);
                }
        );

        fab2.setOnClickListener(
                v -> {

                    Intent ini = new Intent(Intent.ACTION_VIEW , Uri.parse("https://bayc.com"));
                    startActivity(ini);
                }
        );

        fab3.setOnClickListener(
                v -> {
                    Intent in1 = new Intent();
                    in1.setAction(Intent.ACTION_VIEW);
                    in1.setData(Uri.parse("tel:0755946656"));
                    startActivity(in1);
                }
        );


 }



}
