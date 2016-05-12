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

public class BeefRecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beef_recipe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void beef1(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("BEEF FRY"))
        {
            Intent intent = new Intent(this, BeefFryActivity.class);
            startActivity(intent);
        }
    }
    public void beef2(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("BEEF STROGANOFF"))
        {
            Intent intent = new Intent(this, BeefStroganoffActivity.class);
            startActivity(intent);
        }
    }
    public void beef3(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("BEEF PEPPER ROAST"))
        {
            Intent intent = new Intent(this, BeefPepperRoastActivity.class);
            startActivity(intent);
        }
    }
    public void beef4(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("BEEF POTATO ROAST"))
        {
            Intent intent = new Intent(this, BeefPotatoRoastActivity.class);
            startActivity(intent);
        }
    }
    public void beef5(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("BEEF THORAN"))
        {
            Intent intent = new Intent(this, BeefThoranActivity.class);
            startActivity(intent);
        }
    }
    public void beef6(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("BEEF KORMA"))
        {
            Intent intent = new Intent(this, BeefKurmaActivity.class);
            startActivity(intent);
        }
    }
    public void beef7(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("NADAN BEEF CURRY"))
        {
            Intent intent = new Intent(this,NadanBeefCurryActivity.class);
            startActivity(intent);
        }
    }
    public void beef8(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("DRIED BEEF STIR FRY"))
        {
            Intent intent = new Intent(this, DriedBeefStirFryActivity.class);
            startActivity(intent);
        }
    }
    public void beef9(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("SPICY LIVER FRY"))
        {
            Intent intent = new Intent(this, SpicyLiverFryActivity.class);
            startActivity(intent);
        }
    }
    public void beef10(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("BEEF MASALA"))
        {
            Intent intent = new Intent(this, BeefMasalaActivity.class);
            startActivity(intent);
        }
    }
    public void beef11(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("BEEF BANANA STIR FRY"))
        {
            Intent intent = new Intent(this, BeefRawBananaStirFryActivity.class);
            startActivity(intent);
        }
    }
    public void beef12(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("MINCED MEET STIR FRY"))
        {
            Intent intent = new Intent(this, MincedMeatStirFryActivity.class);
            startActivity(intent);
        }
    }
    public void beef13(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("BEEF DRY"))
        {
            Intent intent = new Intent(this, BeefDryActivity.class);
            startActivity(intent);
        }
    }
}


