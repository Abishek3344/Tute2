package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    Intent intent;
    EditText t3,t4;
    TextView result;
    double val1,val2;
    Button add,minus,multi,dive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        intent = getIntent();

        t3 = findViewById(R.id.editText3);
        t4 = findViewById(R.id.editText4);

        t3.setText(intent.getStringExtra("NUM1"));
        t4.setText(intent.getStringExtra("NUM2"));

        result = findViewById(R.id.textView5);
        result.setText(null);


        val1 = Double.parseDouble(intent.getStringExtra("NUM1"));
        val2 = Double.parseDouble(intent.getStringExtra("NUM2"));

        add=findViewById(R.id.button14);
        minus=findViewById(R.id.button15);
        multi=findViewById(R.id.button16);
        dive=findViewById(R.id.button17);


        final Context context = getApplicationContext();

        final int duration = Toast.LENGTH_LONG;



        //This execute when press Add button
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(val1 +" + "+ val2 +" = "+ (val1+val2));

                String message = "Add two numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP,0,200);
                toast.show();

            }
        });

        //This execute when press minus button
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(val1 +" - "+ val2 +" = "+ (val1-val2));

                String message = "Subtract two numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP,0,200);
                toast.show();
            }
        });

        //This execute when press Multiply button
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(val1 +" * "+ val2 +" = "+ (val1*val2));

                String message = "Multiply two numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP,0,200);
                toast.show();
            }
        });

        //This execute when press Devide button
        dive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(val1 +" / "+ val2 +" = "+ (val1/val2));

                String message = "Devide two numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP,0,200);
                toast.show();
            }
        });


    }


}
