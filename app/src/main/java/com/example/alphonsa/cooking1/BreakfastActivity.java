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

public class BreakfastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void breakfast1(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Idli"))
        {
            Intent intent = new Intent(this, IdliActivity.class);
            startActivity(intent);
        }
    }
    public void breakfast2(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Steam Cake"))
        {
            Intent intent = new Intent(this, SteamCakeActivity.class);
            startActivity(intent);
        }
    }
    public void breakfast3(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Idiyappam"))
        {
            Intent intent = new Intent(this, IdiyappamActivity.class);
            startActivity(intent);
        }
    }
    public void breakfast4(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Pallapam"))
        {
            Intent intent = new Intent(this, PalappamActivity.class);
            startActivity(intent);
        }
    }
    public void breakfast5(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Rava Upma"))
        {
            Intent intent = new Intent(this, RavaUpmaActivity.class);
            startActivity(intent);
        }
    }
    public void breakfast6(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Dosa"))
        {
            Intent intent = new Intent(this, DosaActivity.class);
            startActivity(intent);
        }
    }
    public void breakfast7(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Vattayapam"))
        {
            Intent intent = new Intent(this, VattayappambrkActivity.class);
            startActivity(intent);
        }
    }
    public void breakfast8(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Aval Velayichadu"))
        {
            Intent intent = new Intent(this, AvalVelayichathuActivity.class);
            startActivity(intent);
        }
    }
    public void breakfast9(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Avalos Podi"))
        {
            Intent intent = new Intent(this, AvalosPodiActivity.class);
            startActivity(intent);
        }
    }
    public void breakfast10(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Paal Pidi"))
        {
            Intent intent = new Intent(this, PaalPidiActivity.class);
            startActivity(intent);
        }
    }
    public void breakfast11(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Godhambu Ada"))
        {
            Intent intent = new Intent(this, GodhambuAdaActivity.class);
            startActivity(intent);
        }
    }
    public void breakfast12(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Mutta Kozhalappam"))
        {
            Intent intent = new Intent(this, MuttaKozhalappamActivity.class);
            startActivity(intent);
        }
    }
    public void breakfast13(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Ven Pongal"))
        {
            Intent intent = new Intent(this, VenPongalActivity.class);
            startActivity(intent);
        }
    }
    public void breakfast14(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Onion Uthappam"))
        {
            Intent intent = new Intent(this, OnionUtappamActivity.class);
            startActivity(intent);
        }
    }
    public void breakfast15(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Kuzhi Paniyaram"))
        {
            Intent intent = new Intent(this, KuzhiPaniyaramActivity.class);
            startActivity(intent);
        }
    }
    public void breakfast16(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Masala Dosa"))
        {
            Intent intent = new Intent(this, MasalaDosaActivity.class);
            startActivity(intent);
        }
    }
    public void breakfast17(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Kothu Parotta"))
        {
            Intent intent = new Intent(this, KottuParottaActivity.class);
            startActivity(intent);
        }
    }
    public void breakfast18(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Puli Pongal"))
        {
            Intent intent = new Intent(this, PulliPongalActivity.class);
            startActivity(intent);
        }
    }
    public void breakfast19(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Ragi Sevai"))
        {
            Intent intent = new Intent(this, RagiSevaiActivity.class);
            startActivity(intent);
        }
    }
    public void breakfast20(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Paal Pongal"))
        {
            Intent intent = new Intent(this, PaalPongalActivity.class);
            startActivity(intent);
        }
    }
}
