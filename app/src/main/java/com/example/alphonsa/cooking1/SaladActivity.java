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

public class SaladActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void salad1(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Avocado Tomato Salad"))
        {
            Intent intent = new Intent(this, AvocadoTomatoSaladActivity.class);
            startActivity(intent);
        }
    }
    public void salad2(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Green Pappaya Salad"))
        {
            Intent intent = new Intent(this, GreenPappayaSaladActivity.class);
            startActivity(intent);
        }
    }
    public void salad3(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Onion Tomato Curd Salad"))
        {
            Intent intent = new Intent(this,OnionTomatoCurdSaladActivity .class);
            startActivity(intent);
        }
    }
    public void salad4(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Sprout Salad"))
        {
            Intent intent = new Intent(this,SproutSaladActivity .class);
            startActivity(intent);
        }
    }
    public void salad5(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Carrot Salad"))
        {
            Intent intent = new Intent(this,CarrotSaladActivity .class);
            startActivity(intent);
        }
    }
}
