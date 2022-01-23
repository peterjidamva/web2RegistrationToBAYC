package com.example.java1010;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button= (Button) findViewById(R.id.buttonId);

        button.setOnClickListener(
                v -> {
                    System.out.println("clicked");
                    Context ctx = MainActivity.this ;
                    Toast.makeText(ctx, "CLICKED", Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(this , Main2Activity.class);
                    startActivity(i);

                });


}}
