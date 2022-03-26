package com.example.hw2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //actionbar titel
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("second activity");

        //intent to get data
        Intent i = getIntent();
        String name2 = i.getStringExtra("NAME");
        String age2 = i.getStringExtra("AGE");
        String Yourjob2 = i.getStringExtra("yourjob");
        String Phonenomber2 = i.getStringExtra("Phonenomber");
        String Email2 = i.getStringExtra("Email");

       //textview
        TextView Resulty =findViewById(R.id.Name1);
        TextView Resulty2 =findViewById(R.id.Email1);
        TextView Resulty3 =findViewById(R.id.Age1);
        TextView Resulty4 =findViewById(R.id.Yourjob1);
        TextView Resulty5 =findViewById(R.id.Phonenomber1);

        //resulty
        Resulty.setText("NAME: "+name2+"");
        Resulty3.setText("AGE: "+age2+"");
        Resulty4.setText("yourjob: "+Yourjob2+"");
        Resulty5.setText("Phonenomber: "+Phonenomber2+"");
        Resulty2.setText("Email: "+Email2+"");

    }
}