package com.example.alphonsa.cooking1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class FishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void fish1(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Crab Masala"))
        {
            Intent intent = new Intent(this, CrabMasalaActivity.class);
            startActivity(intent);
        }
    }
    public void fish2(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Prawns Pepper Roast"))
        {
            Intent intent = new Intent(this, PrawnsPepperRoastActivity.class);
            startActivity(intent);
        }
    }

    public void fish3(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Spicy Cray Fish"))
        {
            Intent intent = new Intent(this,SpicyCrayFishActivity.class);
            startActivity(intent);
        }
    }

    public void fish4(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Fish Dry"))
        {
            Intent intent = new Intent(this, FishDryActivity.class);
            startActivity(intent);
        }
    }

    public void fish5(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Fish Mappas"))
        {
            Intent intent = new Intent(this, FishMappasActivity.class);
            startActivity(intent);
        }
    }

    public void fish6(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Fish Finger"))
        {
            Intent intent = new Intent(this, FishFingerActivity.class);
            startActivity(intent);
        }
    }
    public void fish7(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Mussel Fry"))
        {
            Intent intent = new Intent(this, MusselFryActivity.class);
            startActivity(intent);
        }
    }
    public void fish8(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Prawns Tomato Roast"))
        {
            Intent intent = new Intent(this, PrawnsTomatoRoastActivity.class);
            startActivity(intent);
        }
    }
    public void fish9(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Fish Fry"))
        {
            Intent intent = new Intent(this, FishFryActivity.class);
            startActivity(intent);
        }
    }
    public void fish10(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Fish with Tomato Gravy"))
        {
            Intent intent = new Intent(this, FishWithTomatoGravyActivity.class);
            startActivity(intent);
        }
    }
    public void fish11(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Fish Gravy"))
        {
            Intent intent = new Intent(this, FishGravyActivity.class);
            startActivity(intent);
        }
    }
    public void fish12(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Prawns Roast"))
        {
            Intent intent = new Intent(this, PrawnsRoastActivity.class);
            startActivity(intent);
        }
    }
    public void fish13(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Prawns Fry"))
        {
            Intent intent = new Intent(this, PrawnsFryActivity.class);
            startActivity(intent);
        }
    }
    public void fish14(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Pepper Fish"))
        {
            Intent intent = new Intent(this, PepperFishActivity.class);
            startActivity(intent);
        }
    }
    public void fish15(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Prawns Curry"))
        {
            Intent intent = new Intent(this, PrawnsCurryActivity.class);
            startActivity(intent);
        }
    }
    public void fish16(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Prawns with roasted coconut"))
        {
            Intent intent = new Intent(this,PrawnsWithRoastedCoconutActivity.class);
            startActivity(intent);
        }
    }
    public void fish17(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Prawns Gravy"))
        {
            Intent intent = new Intent(this, PrawnsCurryActivity.class);
            startActivity(intent);
        }
    }
    public void fish18(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Nadan Fish Curry"))
        {
            Intent intent = new Intent(this, NadanFishCurryActivity.class);
            startActivity(intent);
        }
    }
    public void fish19(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Prawns Stir Fry"))
        {
            Intent intent = new Intent(this, PrawnsStirFryActivity.class);
            startActivity(intent);
        }
    }
    public void fish20(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Fish Curry with coconut Gravy"))
        {
            Intent intent = new Intent(this, FishCurryWithCoconutGravyActivity.class);
            startActivity(intent);
        }
    }
    public void fish21(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Fish Masala"))
        {
            Intent intent = new Intent(this, FishMasalaActivity.class);
            startActivity(intent);
        }
    } public void fish22(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Fish Molly"))
        {
            Intent intent = new Intent(this, FishMollyActivity.class);
            startActivity(intent);
        }
    } public void fish23(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Fish Cutlet"))
        {
            Intent intent = new Intent(this,FishCutletActivity.class);
            startActivity(intent);
        }
    }public void fish24(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Fish Kebab"))
        {
            Intent intent = new Intent(this, FishKebabActivity.class);
            startActivity(intent);
        }
    } public void fish25(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Squid Fry"))
        {
            Intent intent = new Intent(this, SquidFryActivity.class);
            startActivity(intent);
        }
    }
    public void fish26(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Dried Prawns Chutney powder"))
        {
            Intent intent = new Intent(this,DryPrawnsChutneyPowderActivity.class);
            startActivity(intent);
        }
    }
}
