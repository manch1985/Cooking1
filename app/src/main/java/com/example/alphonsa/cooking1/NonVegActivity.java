package com.example.alphonsa.cooking1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class NonVegActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_veg);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void beef(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("BEEF RECIPES"))
        {
            Intent intent = new Intent(this, BeefRecipeActivity.class);
            startActivity(intent);
        }
    }
    public void chicken(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("CHICKEN RECIPES"))
        {
            Intent intent = new Intent(this, ChickenActivity.class);
            startActivity(intent);
        }
    }
    public void egg(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("EGG RECIPES"))
        {
            Intent intent = new Intent(this, EggActivity.class);
            startActivity(intent);
        }
    }
    public void pork(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("PORK RECIPES"))
        {
            Intent intent = new Intent(this, PorkActivity.class);
            startActivity(intent);
        }
    }
    public void mutton(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("MUTTON RECIPES"))
        {
            Intent intent = new Intent(this, MuttonActivity.class);
            startActivity(intent);
        }
    }
    public void fish(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("FISH RECIPES"))
        {
            Intent intent = new Intent(this,FishActivity.class);
            startActivity(intent);
        }
    }
}
