package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {



    EditText t1,t2;
    Intent intent,intent2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        intent2 = new Intent(this,FirstActivity.class);

        //create layout as template
        LayoutInflater li = getLayoutInflater();
        View layout = li.inflate(R.layout.customtoast,(ViewGroup)findViewById(R.id.custom_toast_layout));

        //implement toast
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setView(layout);
        toast.show();

        t1=findViewById(R.id.editText1);
        t2=findViewById(R.id.editText2);
        intent= new Intent(this,SecondActivity.class);
    }

    public void calc2(View view) {

        String n1,n2;

        n1=t1.getText().toString();
        n2=t2.getText().toString();

        intent.putExtra("NUM1",n1);
        intent.putExtra("NUM2",n2);

        Context context = getApplicationContext();

        CharSequence message = "You just clicked the OK button";

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.setGravity(Gravity.TOP,0,200);
        toast.show();
        startActivity(intent);
    }
}
