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

public class OnamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onam);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
    public void onam1(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Idichakka Thoran"))
        {
            Intent intent = new Intent(this, IdichakkaThoranActivity.class);
            startActivity(intent);
        }
    }

    public void onam2(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Cabage Thoran"))
        {
            Intent intent = new Intent(this, CabbageThoranActivity.class);
            startActivity(intent);
        }
    }
    public void onam3(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Ladys Finger Thoran"))
        {
            Intent intent = new Intent(this, LadysFingerThoranActivity.class);
            startActivity(intent);
        }
    }
    public void onam4(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Kootu Curry"))
        {
            Intent intent = new Intent(this, KootuCurryActivity.class);
            startActivity(intent);
        }
    }
    public void onam5(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Tomato Rasam"))
        {
            Intent intent = new Intent(this,TomatoRasamActivity .class);
            startActivity(intent);
        }
    }
    public void onam6(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Kaalan"))
        {
            Intent intent = new Intent(this, KaalanActivity.class);
            startActivity(intent);
        }
    }
    public void onam7(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Manga Pachadi"))
        {
            Intent intent = new Intent(this, MangaPachadiActivity.class);
            startActivity(intent);
        }
    }
    public void onam8(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Sadya Parippu"))
        {
            Intent intent = new Intent(this, SadyaParippuActivity.class);
            startActivity(intent);
        }
    }
    public void onam9(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Mango Chutney"))
        {
            Intent intent = new Intent(this, MangoChutneyActivity.class);
            startActivity(intent);
        }
    }
    public void onam10(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Steamed Rice"))
        {
            Intent intent = new Intent(this,SteamedCakeActivity .class);
            startActivity(intent);
        }
    }
    public void onam11(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Semiya Payasam"))
        {
            Intent intent = new Intent(this, SemiyaPayasaActivity.class);
            startActivity(intent);
        }
    }
    public void onam12(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Paruppu Payasam"))
        {
            Intent intent = new Intent(this, ParippuPayasamActivity.class);
            startActivity(intent);
        }
    }
    public void onam13(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Paal Payasam"))
        {
            Intent intent = new Intent(this, PaalPayasamActivity.class);
            startActivity(intent);
        }
    }
}
