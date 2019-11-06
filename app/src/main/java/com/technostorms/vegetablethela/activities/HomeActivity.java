package com.technostorms.vegetablethela.activities;

import android.os.Bundle;

import com.technostorms.vegetablethela.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
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
    }
}
