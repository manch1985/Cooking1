package com.example.alphonsa.cooking1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
       // getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem item = (MenuItem) menu.findItem(R.id.action_share);
        ShareActionProvider shareAction = (ShareActionProvider) MenuItemCompat.getActionProvider(item);
        Intent shareIntent = new Intent(Intent.ACTION_SEND)
                .putExtra(Intent.EXTRA_TEXT, "Best Scientists Inventions and quotes can read in offline\"Scientists Inventions and Quotes\" " + "http://play.google.com/store/apps/details?id=" + getPackageName())
                .putExtra(Intent.EXTRA_SUBJECT, "Know Inventions from\"Scientists Inventions and Quotes\"")
                .setType("text/plain");

        shareAction.setShareIntent(shareIntent);

        return true;
    }
    public void veg(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("VEGETARIAN"))
        {
            Intent intent=new Intent(this,VegActivity.class);
            startActivity(intent);
        }
    }

public void nonveg(View view)
{
    String button_text;
    button_text = ((Button) view).getText().toString();
    if(button_text.equals("NON VEGETERAIN"))
    {
        Intent intent=new Intent(this,NonVegActivity.class);
        startActivity(intent);
    }
}
    public void pickle(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("PICKLE"))
        {
            Intent intent=new Intent(this,PicklesActivity.class);
            startActivity(intent);
        }
    }
    public void snack(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("SNACKS"))
        {
            Intent intent=new Intent(this,SnacksActivity.class);
            startActivity(intent);
        }
    }
    public void breakfast(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("BREAKFAST SPL"))
        {
            Intent intent=new Intent(this,BreakfastActivity.class);
            startActivity(intent);
        }
    }
    public void cake(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("CAKE RECIPES"))
        {
            Intent intent=new Intent(this,CakeActivity.class);
            startActivity(intent);
        }
    }
    public void oats(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("OATS RECIPES"))
        {
            Intent intent=new Intent(this,OatsActivity.class);
            startActivity(intent);
        }
    }
    public void soup(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("SOUP"))
        {
            Intent intent=new Intent(this,SoupActivity.class);
            startActivity(intent);
        }
    }
    public void salad(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("SALADS"))
        {
            Intent intent=new Intent(this,SaladActivity.class);
            startActivity(intent);
        }
    }
    public void festival(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("FESTIVAL RECIPES"))
        {
            Intent intent=new Intent(this,FestivalActivity.class);
            startActivity(intent);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
      /*  if (id == R.id.action_share) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }
}
