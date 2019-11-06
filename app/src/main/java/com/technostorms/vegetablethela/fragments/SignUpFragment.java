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

public class SignUpFragment extends BaseFragment {

    private TextInputEditText etFirstName, etLastName, etEmail, etMobile, etPassword, etConfirmPassword;
    private Button btnSignup;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        fView = inflater.inflate(R.layout.fragment_sign_up, container, false);

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

        etFirstName = fView.findViewById(R.id.et_first_name);
        etLastName = fView.findViewById(R.id.et_last_name);
        etEmail = fView.findViewById(R.id.et_email);
        etMobile = fView.findViewById(R.id.et_mobile);
        etPassword = fView.findViewById(R.id.et_password);
        etConfirmPassword = fView.findViewById(R.id.et_confirm_password);
        btnSignup = fView.findViewById(R.id.btn_signup);

        buttonEnableDisable();
    }

    private void buttonEnableDisable()
    {
        etFirstName.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s.toString().trim().length()==0){
                    btnSignup.setAlpha(0.5f);
                } else {
                    btnSignup.setAlpha(1.0f);
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

        etLastName.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s.toString().trim().length()==0){
                    btnSignup.setAlpha(0.5f);
                } else {
                    btnSignup.setAlpha(1.0f);
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

        etEmail.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s.toString().trim().length()==0){
                    btnSignup.setAlpha(0.5f);
                } else {
                    btnSignup.setAlpha(1.0f);
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

        etMobile.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s.toString().trim().length()==0){
                    btnSignup.setAlpha(0.5f);
                } else {
                    btnSignup.setAlpha(1.0f);
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

        etPassword.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s.toString().trim().length()==0){
                    btnSignup.setAlpha(0.5f);
                } else {
                    btnSignup.setAlpha(1.0f);
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

        etConfirmPassword.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s.toString().trim().length()==0){
                    btnSignup.setAlpha(0.5f);
                } else {
                    btnSignup.setAlpha(1.0f);
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
