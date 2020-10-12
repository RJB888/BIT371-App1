package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity2(View view){
        EditText uName = findViewById(R.id.userName);
        EditText passWord = findViewById(R.id.password);
        Intent myIntent = new Intent(getApplicationContext(), Activity2.class);
        myIntent.putExtra("name", uName.getText().toString());
        myIntent.putExtra("passWord", passWord.getText().toString());
        startActivity(myIntent);
        Log.i("INFO", "switching to activity 2");
    }
}