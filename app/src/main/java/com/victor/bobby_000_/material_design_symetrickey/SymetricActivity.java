package com.victor.bobby_000_.material_design_symetrickey;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;

public class SymetricActivity extends AppCompatActivity {
// class should take in encryption key and take in txt for encyption and display txt for decryption
    // imn the model view archictecture this is the view class


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symetric);
        setToolbar();

    }
    void setToolbar(){
        // setting the toolbar
        Toolbar tb=(Toolbar) findViewById(R.id.symtoolbar);
        setSupportActionBar(tb);
        ActionBar ab =getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // display back button
        tb.setTitleTextColor(Color.WHITE);
        ab.setDisplayHomeAsUpEnabled(true);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // list all the other menu icons
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void finish(){
        super.finish(); //kills activity once left

    }



}
