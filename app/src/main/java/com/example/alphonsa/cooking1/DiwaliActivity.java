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

public class DiwaliActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diwali);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void diwali1(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Kesar Peda"))
        {
            Intent intent = new Intent(this, KesarPedaActivity.class);
            startActivity(intent);
        }
    }
    public void diwali2(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Burfi"))
        {
            Intent intent = new Intent(this, BurfiActivity.class);
            startActivity(intent);
        }
    }
    public void diwali3(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Cocunut Ladoo"))
        {
            Intent intent = new Intent(this, CocunutLadooActivity.class);
            startActivity(intent);
        }
    }
    public void diwali4(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Gulab Sandesh"))
        {
            Intent intent = new Intent(this, GulabSandeshRecipeActivity.class);
            startActivity(intent);
        }
    }
    public void diwali5(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Murukku"))
        {
            Intent intent = new Intent(this, MurukkuActivity.class);
            startActivity(intent);
        }
    }
    public void diwali6(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Crispy Savory Crackers"))
        {
            Intent intent = new Intent(this, SavoryCrackersActivity.class);
            startActivity(intent);
        }
    }
    public void diwali7(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Bhakarwadi"))
        {
            Intent intent = new Intent(this,BhakarwadiActivity .class);
            startActivity(intent);
        }
    }
    public void diwali8(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Samosa"))
        {
            Intent intent = new Intent(this, SamoosaActivity.class);
            startActivity(intent);
        }
    }
    public void diwali9(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Chivda"))
        {
            Intent intent = new Intent(this,BakedChivdaActivity .class);
            startActivity(intent);
        }
    }
    public void diwali10(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Moong Dal Ghugra"))
        {
            Intent intent = new Intent(this, MoongdalGhughraActivity.class);
            startActivity(intent);
        }
    }
    public void diwali11(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Crispy Gram Flour Snack"))
        {
            Intent intent = new Intent(this,CrispyGramFlourSnackActivity .class);
            startActivity(intent);
        }
    }
    public void diwali12(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Diwali Mixture"))
        {
            Intent intent = new Intent(this, DiwaliMixtureActivity.class);
            startActivity(intent);
        }
    }
    public void diwali13(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Ribbon Pakoda"))
        {
            Intent intent = new Intent(this, RibbonPakodaActivity.class);
            startActivity(intent);
        }
    }

}
