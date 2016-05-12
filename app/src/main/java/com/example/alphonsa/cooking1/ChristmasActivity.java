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

public class ChristmasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_christmas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void christmas1(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Chicken Cutlets"))
        {
            Intent intent = new Intent(this, ChickenCutletActivity.class);
            startActivity(intent);
        }
    }
    public void christmas2(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Chicken 65"))
        {
            Intent intent = new Intent(this, Chickenn65Activity.class);
            startActivity(intent);
        }
    }public void christmas3(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Chicken Nuggets"))
        {
            Intent intent = new Intent(this, ChickenNuggetsActivity.class);
            startActivity(intent);
        }
    }
    public void christmas4(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Chicken Curry"))
        {
            Intent intent = new Intent(this, NadanChickenCurryActivity.class);
            startActivity(intent);
        }
    }
    public void christmas5(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Chicken Roast"))
        {
            Intent intent = new Intent(this, ChickenRoastActivity.class);
            startActivity(intent);
        }
    }
    public void christmas6(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Chicken Stew"))
        {
            Intent intent = new Intent(this, ChickenStewActivity.class);
            startActivity(intent);
        }
    }
    public void christmas7(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Beef Fry"))
        {
            Intent intent = new Intent(this, BeefFryActivity.class);
            startActivity(intent);
        }
    }
    public void christmas8(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Beef Dry"))
        {
            Intent intent = new Intent(this, BeefDryActivity.class);
            startActivity(intent);
        }
    }
    public void christmas9(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Nadan Fish Curry"))
        {
            Intent intent = new Intent(this, NadanFishCurryActivity.class);
            startActivity(intent);
        }
    }
    public void christmas10(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Prawns Roast"))
        {
            Intent intent = new Intent(this, PrawnsRoastActivity.class);
            startActivity(intent);
        }
    }
    public void christmas11(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Pork Dry"))
        {
            Intent intent = new Intent(this, PorkDryActivity.class);
            startActivity(intent);
        }
    }
}
