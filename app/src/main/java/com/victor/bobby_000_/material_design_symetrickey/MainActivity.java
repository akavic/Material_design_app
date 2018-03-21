package com.victor.bobby_000_.material_design_symetrickey;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.widget.ImageButton;

// concerned with display play button and linking to next page
public class MainActivity extends AppCompatActivity {

    private ImageButton mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (ImageButton) findViewById(R.id.play_btn);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSymetric_act();
            }
        });
        setToolbar();
    }

    void startSymetric_act(){
        // starting the second activity
        Intent intent = new Intent(this, SymetricActivity.class);
        startActivity(intent);
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
