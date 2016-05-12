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

public class ChickenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void chicken1(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("NADAN CHICKEN CURRY"))
        {
            Intent intent = new Intent(this, NadanChickenCurryActivity.class);
            startActivity(intent);
        }
    }
    public void chicken2(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("CHICKEN GRAVY"))
        {
            Intent intent = new Intent(this, ChickenGravyActivity.class);
            startActivity(intent);
        }
    }
    public void chicken3(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("CHICKEN ROAST"))
        {
            Intent intent = new Intent(this, ChickenRoastActivity.class);
            startActivity(intent);
        }
    }
    public void chicken4(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("CHILLI CHICKEN"))
        {
            Intent intent = new Intent(this, ChilliChickenGravyActivity.class);
            startActivity(intent);
        }
    }
    public void chicken5(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("SPICY CHICKEN FRY"))
        {
            Intent intent = new Intent(this, SpicyChickenFryActivity.class);
            startActivity(intent);
        }
    }
    public void chicken6(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("CHICKEN CUTLET"))
        {
            Intent intent = new Intent(this, ChickenCutletActivity.class);
            startActivity(intent);
        }
    }
    public void chicken7(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("CHICKEN CROQUETTES"))
        {
            Intent intent = new Intent(this, ChickenCrpquettesActivity.class);
            startActivity(intent);
        }
    }
    public void chicken8(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("KADAI CHICKEN"))
        {
            Intent intent = new Intent(this,KadaiChickenActivity .class);
            startActivity(intent);
        }
    }
    public void chicken9(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("CHICKEN LOLLIPOPS"))
        {
            Intent intent = new Intent(this, ChickenLollipopsActivity.class);
            startActivity(intent);
        }
    }
    public void chicken10(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("CHICKEN ROAST(NO ONION)"))
        {
            Intent intent = new Intent(this, ChickenRoast_no_onionActivity.class);
            startActivity(intent);
        }
    }
    public void chicken11(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("CHICKEN 65"))
        {
            Intent intent = new Intent(this, Chicken65Activity.class);
            startActivity(intent);
        }
    }
    public void chicken12(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("CHICKEN STEW"))
        {
            Intent intent = new Intent(this,ChickenStewActivity .class);
            startActivity(intent);
        }
    }public void chicken13(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("LEMON_HONEY GLAZED CHICKEN"))
        {
            Intent intent = new Intent(this, LemonHoneyGlazedChickenActivity.class);
            startActivity(intent);
        }
    }public void chicken14(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("CHICKEN BEZULE"))
        {
            Intent intent = new Intent(this, ChickenBezuleActivity.class);
            startActivity(intent);
        }
    }
    }






