package com.example.regisform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText e1,e2;
    RadioButton R1,R2;
    RadioGroup rr;
    private Object registrat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            e1=findViewById(R.id.ed1);
            e2=findViewById(R.id.ed2);
            R1=findViewById(R.id.r1);
            R2=findViewById(R.id.r2);
            rr=findViewById(R.id.gen);
    }

    public void submit(View view) {
        registrat();
    }

    private void registrat() {
        SharedPreferences sharedPref=getSharedPreferences("my_pref",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPref.edit();
        editor.putString("Fname",e1.getText().toString());
        editor.putString("Lname",e2.getText().toString());

        String radiovalue="";
        switch (rr.getCheckedRadioButtonId()){
            case R.id.r1:radiovalue="male";
            break;
            case R.id.r2:radiovalue="female";
            break;
        }
      editor.putString("gender",radiovalue);
        editor.apply();
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}