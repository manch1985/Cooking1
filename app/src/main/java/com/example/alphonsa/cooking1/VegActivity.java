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

public class VegActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void chapathi(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Spl Dishes For Chapathi"))
        {
            Intent intent = new Intent(this,SplDishesForChapathiActivity.class);
            startActivity(intent);
        }
    }
    public void paneer(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Paneer Recipes"))
        {
            Intent intent = new Intent(this,PaneerActivity.class);
            startActivity(intent);
        }
    }
    public void sambar(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Sambar"))
        {
            Intent intent = new Intent(this,SambarActivity.class);
            startActivity(intent);
        }
    }
    public void aviyal(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Aviyal"))
        {
            Intent intent = new Intent(this,AviyalActivity.class);
            startActivity(intent);
        }
    }
    public void rasam(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Rasam"))
        {
            Intent intent = new Intent(this,TomatoRasamActivity.class);
            startActivity(intent);
        }
    }
    public void parippucurry(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Parippu Curry"))
        {
            Intent intent = new Intent(this,SadyaParippuActivity.class);
            startActivity(intent);
        }
    }
}
