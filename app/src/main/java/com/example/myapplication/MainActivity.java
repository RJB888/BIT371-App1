package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    String[] cities = {"Seattle", "Bothell", "Kirkland", "Bellevue", "Lynnwood", "Renton",
            "Redmond", "Spokane", "Vancouver", "Tacoma", "Olympia", "Bellingham", "Arlington",
            "Everett", "Woodinville", "Monroe", "New Castle", "Ballard", "Lacey"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, R.layout.listview_layout, R.id.city, cities);
        ListView cityListView = findViewById(R.id.city_list);
        cityListView.setAdapter(myAdapter);
    }

}