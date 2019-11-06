package com.technostorms.vegetablethela.activities;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.technostorms.vegetablethela.R;
import com.technostorms.vegetablethela.adapter.LoginSignupPagerAdapter;
import com.technostorms.vegetablethela.fragments.LoginFragment;
import com.technostorms.vegetablethela.fragments.SignUpFragment;

public class LoginSignupActivity extends BaseActivity {

    private ViewPager viewPager;
    private LoginFragment loginFragment;
    private SignUpFragment signUpFragment;
    private LinearLayout linearLogin, linearSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initData();

        initui();
    }

    @Override
    protected void initData() {
        super.initData();
    }

    @Override
    protected void initui() {
        super.initui();

        viewPager = findViewById(R.id.view_pager_login_signup);
        linearLogin = findViewById(R.id.linear_login);
        linearSignup = findViewById(R.id.linear_signup);

        linearLogin.setVisibility(View.VISIBLE);
        linearSignup.setVisibility(View.GONE);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                if (position == 0)
                {
                    linearLogin.setVisibility(View.VISIBLE);
                    linearSignup.setVisibility(View.GONE);
                }
                else if (position == 1)
                {
                    linearLogin.setVisibility(View.GONE);
                    linearSignup.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        setupViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        LoginSignupPagerAdapter loginSignupPagerAdapter = new LoginSignupPagerAdapter(getSupportFragmentManager());
        loginFragment = new LoginFragment();
        signUpFragment = new SignUpFragment();

        loginSignupPagerAdapter.add(loginFragment);
        loginSignupPagerAdapter.add(signUpFragment);

        viewPager.setAdapter(loginSignupPagerAdapter);
    }
}
