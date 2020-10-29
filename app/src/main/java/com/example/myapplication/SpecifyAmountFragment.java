package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SpecifyAmountFragment extends Fragment implements View.OnClickListener {

    NavController navController;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.send_btn).setOnClickListener(this);
        view.findViewById(R.id.cancel_btn).setOnClickListener(this);

        navController = Navigation.findNavController(view);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_specify_amount, container, false);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            //send btn
            case R.id.send_btn :
                navController.navigate(R.id.action_specifyAmountFragment_to_confirmationFragment);
                break;
            //cancel btn
            case R.id.cancel_btn :
                getActivity().onBackPressed();
                break;
        }
    }
}