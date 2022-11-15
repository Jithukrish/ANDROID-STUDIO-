package com.example.spinner;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
   Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.names, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       spinner.setAdapter(adapter);
       spinner.setOnItemClickListener(this::onItemSelected);



    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast toast=Toast.makeText(this,"selected item "+adapterView.getItemAtPosition(i),Toast.LENGTH_LONG);
        toast.show();


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}