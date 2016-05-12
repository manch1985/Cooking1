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

public class EggActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egg);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void egg1(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("EGG PARATHA"))
        {
            Intent intent = new Intent(this, EggParathaActivity.class);
            startActivity(intent);
        }
    }
    public void egg2(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("SPICY POTATO EGG CURRY"))
        {
            Intent intent = new Intent(this, SpicyPotatoEggCurryActivity.class);
            startActivity(intent);
        }
    }
    public void egg3(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("NADAN EGG CURRY"))
        {
            Intent intent = new Intent(this, NadanEggCurryActivity.class);
            startActivity(intent);
        }
    }
    public void egg4(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("EGG ROAST"))
        {
            Intent intent = new Intent(this, EggRoastActivity.class);
            startActivity(intent);
        }
    }
    public void egg5(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("CRISPY EGG SNACK"))
        {
            Intent intent = new Intent(this, CrispyEggSnackActivity.class);
            startActivity(intent);
        }
    }
    public void egg6(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("EGG DOSA"))
        {
            Intent intent = new Intent(this,EggDosaActivity.class);
            startActivity(intent);
        }
    }
    public void egg7(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("EGG THORAN"))
        {
            Intent intent = new Intent(this, EggThoranActivity.class);
            startActivity(intent);
        }
    }
    public void egg8(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("STUFFED EGG BUNS"))
        {
            Intent intent = new Intent(this, StuffedEggBunsActivity.class);
            startActivity(intent);
        }
    }
    public void egg9(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("EGG CHOPS"))
        {
            Intent intent = new Intent(this,EggChopsActivity.class);
            startActivity(intent);
        }
    }
}
