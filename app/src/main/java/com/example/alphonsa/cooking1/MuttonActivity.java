package com.example.alphonsa.cooking1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MuttonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mutton);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void mutton1(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("MUTTON ROAST"))
        {
            Intent intent = new Intent(this, MuttonRoastActivity.class);
            startActivity(intent);
        }
    }
    public void mutton2(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("MUTTON SEMI GRAVY"))
        {
            Intent intent = new Intent(this, MuttonSemiGravyActivity.class);
            startActivity(intent);
        }
    }
    public void mutton3(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("MUTTON GRAVY"))
        {
            Intent intent = new Intent(this,MuttonGravyActivity.class);
            startActivity(intent);
        }
    }
    public void mutton4(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("MUTTON CURRY"))
        {
            Intent intent = new Intent(this, MuttonCurryActivity.class);
            startActivity(intent);
        }
    }
}
