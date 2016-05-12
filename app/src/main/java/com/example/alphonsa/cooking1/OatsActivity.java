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

public class OatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oats);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void oats1(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("Oats Ladoo"))
        {
            Intent intent=new Intent(this,OatsLadooActivity.class);
            startActivity(intent);
        }
    }
    public void oats2(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("Masala Oats Upma"))
        {
            Intent intent=new Intent(this,MasalaOatsUpmaActivity.class);
            startActivity(intent);
        }
    }
    public void oats3(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("Oatmeal Pancakes"))
        {
            Intent intent=new Intent(this,OatmealPancakeActivity.class);
            startActivity(intent);
        }
    }
    public void oats4(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("Oats Uthapam"))
        {
            Intent intent=new Intent(this,OatsUthapamActivity.class);
            startActivity(intent);
        }
    }
    public void oats5(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("Sambar Oats"))
        {
            Intent intent=new Intent(this,SambarOatsActivity.class);
            startActivity(intent);
        }
    }
    
    public void oats7(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("Oats Khichdi"))
        {
            Intent intent=new Intent(this,OatsKhichdiActivity.class);
            startActivity(intent);
        }
    }
    public void oats8(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("Oats Dry Fruits Ladoo"))
        {
            Intent intent=new Intent(this,OatsDryFruitsLadooActivity.class);
            startActivity(intent);
        }
    }
    public void oats9(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("Oats Roti"))
        {
            Intent intent=new Intent(this,OatsRotiActivity.class);
            startActivity(intent);
        }
    }
    public void oats10(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("Oats Pongal"))
        {
            Intent intent=new Intent(this,OatsPongalActivity.class);
            startActivity(intent);
        }
    }

    public void oats12(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("Oats Porridge"))
        {
            Intent intent=new Intent(this,OatsPorridgeActivity.class);
            startActivity(intent);
        }
    }
    public void oats13(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("Oats Upma"))
        {
            Intent intent=new Intent(this,OatsUpmaActivity.class);
            startActivity(intent);
        }
    }

}
