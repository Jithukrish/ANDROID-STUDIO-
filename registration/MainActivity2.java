package com.example.regisform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView fn,ln,g;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fn=findViewById(R.id.t4);
        ln=findViewById(R.id.t5);
        g=findViewById(R.id.t6);
        btn=findViewById(R.id.b2);

    }

    public void submit(View view) {
        SharedPreferences sharedPref=getSharedPreferences("my_pref",MODE_PRIVATE);
        fn.setText("First name= "+sharedPref.getString("Fname",""));
        ln.setText("Last Name= " +sharedPref.getString("Lname",""));
        g.setText("gender= "+sharedPref.getString("gender",""));
    }
}