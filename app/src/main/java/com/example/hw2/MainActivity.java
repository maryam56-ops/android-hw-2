package com.example.hw2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //actionbar titel
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("first activity");

        //Edit text
        final EditText name11 = findViewById(R.id.Name1);
        final EditText age11 = findViewById(R.id.Age1);
        final EditText yourjob11 = findViewById(R.id.Yourjob1);
        final EditText phonenomber11 = findViewById(R.id.Phonenomber1);
        final EditText Email11 = findViewById(R.id.Email1);

        //Button
        Button next = findViewById(R.id.button);

        //Button click listener
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //get data from Edit text
                String name = name11.getText().toString();
                String age = age11.getText().toString();
                String yourjob = yourjob11.getText().toString();
                String Phonenomber = phonenomber11.getText().toString();
                String Email = Email11.getText().toString();

                //activety intent
                final Intent i = new Intent(MainActivity.this, MainActivity2.class);

                i.putExtra("NAME", name);
                i.putExtra("AGE", age);
                i.putExtra("yourjob",yourjob);
                i.putExtra("Phonenomber",Phonenomber);
                i.putExtra("Email", Email);
                startActivity(i);

                    }


            }

        )

            ;}







    }
