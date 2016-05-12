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

public class CakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cake);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void cake1(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Red Wine Choclate Cake"))
        {
            Intent intent = new Intent(this, RedWineChoclateCakeActivity.class);
            startActivity(intent);
        }
    }
    public void cake2(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Flourless Orange Cake"))
        {
            Intent intent = new Intent(this,FlourlessOrangeCakeActivity.class);
            startActivity(intent);
        }
    }
    public void cake3(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Plum Cake"))
        {
            Intent intent = new Intent(this,PlumCakeActivity.class);
            startActivity(intent);
        }
    }
    public void cake4(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Strawberry Tea Cake"))
        {
            Intent intent = new Intent(this,StrawberryTeaCakeActivity.class);
            startActivity(intent);
        }
    }
    public void cake5(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Lemon Poppy Seed Cake"))
        {
            Intent intent = new Intent(this,LemonPoppySeedCakeActivity.class);
            startActivity(intent);
        }
    }
    public void cake6(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Choclate Cake"))
        {
            Intent intent = new Intent(this,ChoclateCakeActivity.class);
            startActivity(intent);
        }
    }
    public void cake7(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Ragi Banana Choclate Cake"))
        {
            Intent intent = new Intent(this,RagiBananaChoclateCakeActivity.class);
            startActivity(intent);
        }
    }
    public void cake8(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Choclate Almond Brownie"))
        {
            Intent intent = new Intent(this,ChoclateAlmondBrownieActivity.class);
            startActivity(intent);
        }
    }
    public void cake9(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Cup Cake"))
        {
            Intent intent = new Intent(this,CupCakeActivity.class);
            startActivity(intent);
        }
    }
    public void cake10(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Eggless Strawberry Cake"))
        {
            Intent intent = new Intent(this,EgglessStrawberryCakeActivity.class);
            startActivity(intent);
        }
    }
}
