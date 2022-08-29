package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2, ed3;
    Button btn;
    RadioButton m, f;
    RadioGroup G;
    Switch s;
    CheckBox c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.e1);
        ed2 = findViewById(R.id.e2);
        ed3 = findViewById(R.id.e3);
        btn = findViewById(R.id.button);
        G = findViewById(R.id.r2);
        m = findViewById(R.id.rad2);
        f = findViewById(R.id.rad);
        s = findViewById(R.id.switch1);
        c = findViewById(R.id.checkBox);
    }


    public void submit(View view) {
        if (validate()) {
            Toast.makeText(MainActivity.this, "ALL THE DATA IS VALID", Toast.LENGTH_SHORT).show();


        } else {
            Toast.makeText(MainActivity.this, "some data is invalid", Toast.LENGTH_SHORT).show();
        }


    }

    private boolean validate() {
        Boolean isValid = false;
       String fname,lname;
        fname=ed1.getText().toString();
       lname=ed2.getText().toString();
        if (fname.equals("")) {
            Toast.makeText(this, "first name is empty", Toast.LENGTH_SHORT).show();
        } else if (lname.equals("")) {
            Toast.makeText(this, "last name is empty", Toast.LENGTH_SHORT).show();
        } else if (m.isChecked() && f.isChecked()) {
            Toast.makeText(this, "please choose gender", Toast.LENGTH_SHORT).show();
        } else if (ed3.length() < 5) {
            Toast.makeText(this, "password must have atleast 5 letters", Toast.LENGTH_SHORT).show();
        } else if (s.isChecked()) {
            Toast.makeText(this, "NEW MEMBER", Toast.LENGTH_SHORT).show();
        } else if (c.isChecked()) {
            Toast.makeText(this, "Please agree the terms and conditions", Toast.LENGTH_SHORT).show();
        } else {
            isValid = true;
        }
        return isValid;
    }
}
