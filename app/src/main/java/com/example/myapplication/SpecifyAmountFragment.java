package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class SpecifyAmountFragment extends Fragment implements View.OnClickListener {

    NavController navController;
    private String recipient;
    private EditText amountInput;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.send_btn).setOnClickListener(this);
        view.findViewById(R.id.cancel_btn).setOnClickListener(this);
        amountInput = view.findViewById(R.id.input_amount);
        recipient = getArguments().getString("recipient");

        navController = Navigation.findNavController(view);
        Log.i("INFO", String.format("Transferred data is %s", recipient));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_specify_amount, container, false);
    }

    @Override
    public void onClick(View view) {
        String amount = this.amountInput.getText().toString();
        switch (view.getId()){
            //send btn
            case R.id.send_btn :
                if (!TextUtils.isEmpty(amount)){
                    Bundle bundle = new Bundle();
                    try {
                        bundle.putInt("amount", Integer.parseInt(amount));
                        bundle.putString("recipient", recipient);
                        navController.navigate(R.id.action_specifyAmountFragment_to_confirmationFragment, bundle);
                    }catch (NumberFormatException ex){
                        Log.i("INFO", String.format("Improperly formatted input.\n%s", ex.getMessage()));
                    }
                }
                break;
            //cancel btn
            case R.id.cancel_btn :
                getActivity().onBackPressed();
                break;
        }
    }
}