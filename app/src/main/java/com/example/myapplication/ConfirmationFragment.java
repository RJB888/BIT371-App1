package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ConfirmationFragment extends Fragment {

    private int amount;
    private String recipient;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_confirmation, container, false);
        amount = getArguments().getInt("amount");
        recipient = getArguments().getString("recipient");
        TextView tv = view.findViewById(R.id.confirmation_message);
        tv.setText(String.format("Sent $%d to %s", amount, recipient));
        return view;
    }
}