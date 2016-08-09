package com.lanlengran.osclearn;

import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private FragmentTabHost fragmentTabHost= (FragmentTabHost) findViewById(android.R.id.tabhost);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        fragmentTabHost.setup(this,getSupportFragmentManager());
        fragmentTabHost.getTabWidget().setShowDividers(0);
    }
}
