package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declare EditText, TextView and Button by each id
        final EditText edit = (EditText) findViewById(R.id.editText_1);
        final TextView text = (TextView) findViewById((R.id.textView1));
        Button button = (Button) findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String name = edit.getText().toString();
              text.setText(name);
            }
        });
    }
}

