package com.example.java1010;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.text.Editable;
import android.widget.Button;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import android.view.Menu ;

public class MainActivity extends AppCompatActivity {
     
    private  final  String TAG = getClass().getName();
    private Context mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button= (Button) findViewById(R.id.buttonId);
        EditText receivedt = (EditText) findViewById(R.id.editTextName);
//
//        TextView hhh = (TextView) findViewById(R.id.radbihh);
//        hhh.getText();

        RadioButton value2 = (RadioButton) findViewById(R.id.radbihh);

       value2.setOnCheckedChangeListener(

               new CompoundButton.OnCheckedChangeListener() {
                   @Override
                   public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                   }
               }


       );
       Editable datagot =  receivedt.getText();

        button.setOnClickListener(
                v -> {
//                    System.out.println("clicked");
//                    Context ctx = MainActivity.this ;
//                    Toast.makeText(ctx, "CLICK", Toast.LENGTH_SHORT).show();



                    Intent emailService = new Intent(Intent.ACTION_SEND);
                    emailService.setData(Uri.parse("mailto:"));
                    emailService.setType("text/plain");
                    emailService.putExtra(Intent.EXTRA_EMAIL , "To user");
                    emailService.putExtra(Intent.EXTRA_SUBJECT ,"Subject here");
                    emailService.putExtra(Intent.EXTRA_TEXT ,"Your message");
                    startActivity(emailService);
                    Context ctx = this.mainActivity ;
                    Toast.makeText(ctx,"",Toast.LENGTH_SHORT).show();
//
//                    Intent i = new Intent(this , Main2Activity.class);
//                    i.putExtra("JIDAMVA", datagot);
//                    this.startActivity(i);



                });


}}
