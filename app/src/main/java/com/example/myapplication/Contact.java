package com.example.myapplication;

import java.util.ArrayList;

public class Contact {
    private String mName;
    private boolean mOnline;
    private static int lastContactId = 0;

    public Contact(String name, boolean online) {
        mName = name;
        mOnline = online;
    }

    public String getmName(){
        return mName;
    }

    public boolean isOnline(){
        return mOnline;
    }

    public static ArrayList<Contact> createContactList(int numContacts) {
        ArrayList<Contact> contacts = new ArrayList<>();

        for (int i= 0; i <= numContacts; i++) {
            contacts.add(new Contact("Person" + ++lastContactId, i <= numContacts / 2));
            }

        return contacts;
    }
}
