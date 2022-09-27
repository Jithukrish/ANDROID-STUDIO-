package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

EditText ed1,ed2;
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.e1);
        ed2=findViewById(R.id.e2);
        t=findViewById(R.id.t1);


    }

    public void add(View view) {
        float a=Float.parseFloat(String.valueOf(ed1.getText()));
        float b=Float.parseFloat(String.valueOf(ed2.getText()));
         float c=a+b;
        t.setText(Float.toString(c));


    }

    public void dif(View view) {
        float a=Float.parseFloat(String.valueOf(ed1.getText()));
        float b=Float.parseFloat(String.valueOf(ed2.getText()));
        float c=a-b;
        t.setText(Float.toString(c));

    }


    public void mult(View view) {
        float a=Float.parseFloat(String.valueOf(ed1.getText()));
        float b=Float.parseFloat(String.valueOf(ed2.getText()));
        float c=a*b;
        t.setText(Float.toString(c));
    }

    public void div(View view) {
        float a=Float.parseFloat(String.valueOf(ed1.getText()));
        float b=Float.parseFloat(String.valueOf(ed2.getText()));
        float c=a/b;
        t.setText(Float.toString(c));
    }
}