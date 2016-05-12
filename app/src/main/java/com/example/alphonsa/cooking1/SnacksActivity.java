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

public class SnacksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void snack1(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("PARIPPU VADA"))
        {
            Intent intent = new Intent(this, ParrippuVadaActivity.class);
            startActivity(intent);
        }
    }
    public void snack2(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("ONION VADA"))
        {
            Intent intent = new Intent(this, OnionVadaActivity.class);
            startActivity(intent);
        }
    }
    public void snack3(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("SWEET CORN AND POTATO CUTLETS"))
        {
            Intent intent = new Intent(this, SweetcornPotatoCutletsActivity.class);
            startActivity(intent);
        }
    }
    public void snack4(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Vattayappam"))
        {
            Intent intent = new Intent(this, VattayappamActivity.class);
            startActivity(intent);
        }
    }
    public void snack5(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Veg Pizza"))
        {
            Intent intent = new Intent(this, VegPizzaActivity.class);
            startActivity(intent);
        }
    }
    public void snack6(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Chilly Bajji"))
        {
            Intent intent = new Intent(this, ChillyBajjiActivity.class);
            startActivity(intent);
        }
    }
    public void snack7(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Banana Fry"))
        {
            Intent intent = new Intent(this, BananaFryActivity.class);
            startActivity(intent);
        }
    }
}
