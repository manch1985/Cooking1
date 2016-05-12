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

public class PicklesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickles);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void pickle1(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("MANGO"))
        {
            Intent intent = new Intent(this, MangoActivity.class);
            startActivity(intent);
        }
    }
    public void pickle2(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("LEMON"))
        {
            Intent intent = new Intent(this, LemonActivity.class);
            startActivity(intent);
        }
    }
    public void pickle3(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("GINGER"))
        {
            Intent intent = new Intent(this, GingerActivity.class);
            startActivity(intent);
        }
    }
    public void pickle4(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("CARROT"))
        {
            Intent intent = new Intent(this, CarrotActivity.class);
            startActivity(intent);
        }
    }
    public void pickle5(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("ONION"))
        {
            Intent intent = new Intent(this, OnionActivity.class);
            startActivity(intent);
        }
    }
    public void pickle6(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("BEEF"))
        {
            Intent intent = new Intent(this, BeefActivity.class);
            startActivity(intent);
        }
    }
    public void pickle7(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("PRAWNS"))
        {
            Intent intent = new Intent(this, PrawnsActivity.class);
            startActivity(intent);
        }
    }
    public void pickle8(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("GOOSEBERRY"))
        {
            Intent intent = new Intent(this, GooseberryActivity.class);
            startActivity(intent);
        }
    }
    public void pickle9(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("FISH"))
        {
            Intent intent = new Intent(this, FishPickleActivity.class);
            startActivity(intent);
        }
    }
}
