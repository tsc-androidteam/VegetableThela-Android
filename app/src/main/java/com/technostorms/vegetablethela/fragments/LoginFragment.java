package com.technostorms.vegetablethela.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.technostorms.vegetablethela.R;

public class LoginFragment extends BaseFragment {

    private TextInputEditText etEmail, etPasword;
    private Button btnLogin;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        fView = inflater.inflate(R.layout.fragment_login, container, false);

        initData();

        initui();

        return fView;
    }

    @Override
    protected void initData() {
        super.initData();
    }

    @Override
    protected void initui() {
        super.initui();

        etEmail = fView.findViewById(R.id.et_email);
        etPasword = fView.findViewById(R.id.et_password);
        btnLogin = fView.findViewById(R.id.btn_login);

        buttonEnableDisable();
    }

    private void buttonEnableDisable()
    {
        etEmail.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s.toString().trim().length()==0){
                    btnLogin.setAlpha(0.5f);
                } else {
                    btnLogin.setAlpha(1.0f);
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });

        etPasword.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s.toString().trim().length()==0){
                    btnLogin.setAlpha(0.5f);
                } else {
                    btnLogin.setAlpha(1.0f);
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });
    }
}

