package com.victor.bobby_000_.material_design_symetrickey;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setToolbar();
    }

    void setToolbar(){
        // setting the toolbar
        Toolbar tb=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tb);
        ActionBar ab =getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);
        tb.setTitleTextColor(Color.WHITE);
        ab.setDisplayHomeAsUpEnabled(true);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // list all the other menu icons
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
