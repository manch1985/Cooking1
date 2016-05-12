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

public class SoupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soup);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void soup1(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Tomato Soup"))
        {
            Intent intent = new Intent(this, TomatoSoupActivity.class);
            startActivity(intent);
        }
    }
    public void soup2(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Veg Hot And Sour Soup"))
        {
            Intent intent = new Intent(this, VegHotSourSoupActivity.class);
            startActivity(intent);
        }
    }
    public void soup3(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Veg Manchow Soup"))
        {
            Intent intent = new Intent(this, VegManchowSoupActivity.class);
            startActivity(intent);
        }
    }
    public void soup4(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Spinach Soup"))
        {
            Intent intent = new Intent(this, SpinachSoupActivity.class);
            startActivity(intent);
        }
    }
    public void soup5(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Cream Celery Soup"))
        {
            Intent intent = new Intent(this,CreamCelerySoupActivity.class);
            startActivity(intent);
        }
    }
    public void soup6(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Naragi Shorba"))
        {
            Intent intent = new Intent(this, NarangiShorbaActivity.class);
            startActivity(intent);
        }
    }
    public void soup7(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Green Corn Soup"))
        {
            Intent intent = new Intent(this, GreenCornSoupActivity.class);
            startActivity(intent);
        }
    }
    public void soup8(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Chicken Soup"))
        {
            Intent intent = new Intent(this, ChickenSoupActivity.class);
            startActivity(intent);
        }
    }
    public void soup9(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Sweet Corn Soup"))
        {
            Intent intent = new Intent(this, SweetCornSoupActivity.class);
            startActivity(intent);
        }
    }
    public void soup10(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Veg Soup"))
        {
            Intent intent = new Intent(this, VegSoupActivity.class);
            startActivity(intent);
        }
    }
}
