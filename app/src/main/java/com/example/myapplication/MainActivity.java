package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contact> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Look up the recyclerview in activity layout
        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvContacts);

        //Initialize contacts
        contacts = Contact.createContactList(20);
        //Create adapter passing in the sample user data
        ContactAdapter adapter = new ContactAdapter(contacts);
        //Attach the adapter to the recycler view to populate items
        rvContacts.setAdapter(adapter);
        //Set layout manager to position the items
        rvContacts.setLayoutManager(new LinearLayoutManager(this));
    }

}