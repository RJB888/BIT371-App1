package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity2(View view){
        TextView text = (TextView) findViewById(R.id.textView);
        Intent myIntent = new Intent(getApplicationContext(), Activity2.class);
        myIntent.putExtra("msg", "Hello New Activity!");
        startActivity(myIntent);
        Log.i("INFO", "switching to activity 2");
    }
}