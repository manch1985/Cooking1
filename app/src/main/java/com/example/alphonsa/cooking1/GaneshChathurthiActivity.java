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

public class GaneshChathurthiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganesh_chathurthi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void gan1(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Coconut Kozhukatai"))
        {
            Intent intent = new Intent(this, CoconutKozhukattaActivity.class);
            startActivity(intent);
        }
    }
    public void gan2(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Chickpea Sundal"))
        {
            Intent intent = new Intent(this,ChickpeaSundalActivity .class);
            startActivity(intent);
        }
    }
    public void gan3(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Konkani Sweet"))
        {
            Intent intent = new Intent(this,KonganiSweetActivity .class);
            startActivity(intent);
        }
    }
    public void gan4(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Karanji Recipe"))
        {
            Intent intent = new Intent(this, KaranjiRecipeActivity.class);
            startActivity(intent);
        }
    }
    public void gan5(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Steamed Rice Balls"))
        {
            Intent intent = new Intent(this, SteamedRiceBallsActivity.class);
            startActivity(intent);
        }
    } public void gan6(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Alu Vadi"))
        {
            Intent intent = new Intent(this,AluVadiActivity .class);
            startActivity(intent);
        }
    } public void gan7(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Spiced Peanut Burfi"))
        {
            Intent intent = new Intent(this,SpicedBurfiActivity .class);
            startActivity(intent);
        }
    } public void gan8(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Wheat Ladoo"))
        {
            Intent intent = new Intent(this,WheatLadooActivity .class);
            startActivity(intent);
        }
    } public void gan9(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Coriander Fritters"))
        {
            Intent intent = new Intent(this, CoriandeFrittersActivity.class);
            startActivity(intent);
        }
    } public void gan10(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Puran Poli"))
        {
            Intent intent = new Intent(this, PuranPoliActivity.class);
            startActivity(intent);
        }
    }
}
