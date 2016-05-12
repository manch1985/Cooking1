package com.example.alphonsa.cooking1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class FestivalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festival);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void festival1(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Christmas Spl"))
        {
            Intent intent = new Intent(this, ChristmasActivity.class);
            startActivity(intent);
        }
    }
    public void festival2(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Diwali Spl"))
        {
            Intent intent = new Intent(this,DiwaliActivity.class);
            startActivity(intent);
        }
    }
    public void festival3(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Onam Spl"))
        {
            Intent intent = new Intent(this, OnamActivity.class);
            startActivity(intent);
        }
    }
    public void festival4(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Ganesh Chathurthi Spl"))
        {
            Intent intent = new Intent(this, GaneshChathurthiActivity.class);
            startActivity(intent);
        }
    }
}
