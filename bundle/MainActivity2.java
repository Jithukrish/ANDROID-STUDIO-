package com.example.bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
 TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1=findViewById(R.id.textView);
        tv2=findViewById(R.id.textView2);

    Bundle extra=getIntent().getExtras();
    String text=extra.getString("name");
    String text1=extra.getString("name2");
    tv1.setText(text);
    tv2.setText(text1);

    }
}