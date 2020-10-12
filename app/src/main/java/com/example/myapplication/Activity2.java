package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        TextView tv = findViewById(R.id.textView2);
        String name = getIntent().getStringExtra("name").toString();
        String pass = getIntent().getStringExtra("passWord").toString();
        Log.i("INFO", "Name: " + name);
        Log.i("INFO", "Pass: " + pass);
        if (name.equals("Robert") && pass.equals("1234"))
            tv.setText("Welcome " + name);
        else
            tv.setText("Username / Password combination is wrong");
    }
}