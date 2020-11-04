package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class ChooseRecipientFragment extends Fragment implements View.OnClickListener {

    NavController navController;
    private EditText recipientInput;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //set next button listener
        view.findViewById(R.id.next_btn).setOnClickListener(this);
        //set cancel button listener\
        view.findViewById(R.id.cancel_btn).setOnClickListener(this);

        navController = Navigation.findNavController(view);
        recipientInput = view.findViewById(R.id.input_recipient);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_choose_recipient, container, false);
    }

    @Override
    public void onClick(View view) {
        String recipient = this.recipientInput.getText().toString();
        Log.i("INFO", recipientInput.getText().toString());
        switch (view.getId()){
            case R.id.cancel_btn :
                getActivity().onBackPressed();
                break;
            case R.id.next_btn :
                if (!TextUtils.isEmpty(recipient)){
                    Bundle bundle = new Bundle();
                    bundle.putString("recipient", recipient);
                    navController.navigate(R.id.action_chooseRecipientFragment_to_specifyAmountFragment, bundle);
                }
                break;
        }
    }
}