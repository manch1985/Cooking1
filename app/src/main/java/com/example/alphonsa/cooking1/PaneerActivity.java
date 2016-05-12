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

public class PaneerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paneer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void paneer1(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Paneer 65"))
        {
            Intent intent = new Intent(this,Paneer65Activity.class);
            startActivity(intent);
        }
    }
    public void paneer2(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Paneer Lababdar"))
        {
            Intent intent = new Intent(this,PaneerLababdarActivity.class);
            startActivity(intent);
        }
    }
    public void paneer3(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Paneer Pasanda"))
        {
            Intent intent = new Intent(this,PaneerPasandaActivity.class);
            startActivity(intent);
        }
    }
    public void paneer4(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Achari Paneer"))
        {
            Intent intent = new Intent(this,AchariPaneerActivity.class);
            startActivity(intent);
        }
    }
}
