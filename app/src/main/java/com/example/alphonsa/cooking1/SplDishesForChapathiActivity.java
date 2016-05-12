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

public class SplDishesForChapathiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spl_dishes_for_chapathi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void chapathi1(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Rajma Tomato Gravy"))
        {
            Intent intent = new Intent(this,RajmaTomatoGravyActivity.class);
            startActivity(intent);
        }
    }
    public void chapathi2(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Potato Creamy Yogurt Sauce"))
        {
            Intent intent = new Intent(this,PotatoCreamyYogurtSauceActivity.class);
            startActivity(intent);
        }
    }
    public void chapathi3(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Vegetable Korma"))
        {
            Intent intent = new Intent(this,VegKormaActivity.class);
            startActivity(intent);
        }
    }
    public void chapathi4(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Aloo Peas Curry"))
        {
            Intent intent = new Intent(this,AlooPeasCurryActivity.class);
            startActivity(intent);
        }
    }
    public void chapathi5(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Butter Paneer Masala"))
        {
            Intent intent = new Intent(this,ButterPaneerMasalaActivity.class);
            startActivity(intent);
        }
    }
    public void chapathi6(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Kerala Potato Stew"))
        {
            Intent intent = new Intent(this,PotatoStewActivity.class);
            startActivity(intent);
        }
    }
    public void chapathi7(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Capsicum Gravy"))
        {
            Intent intent = new Intent(this,CapsicumGravyActivity.class);
            startActivity(intent);
        }
    }
    public void chapathi8(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Ridge Gourd Gravy"))
        {
            Intent intent = new Intent(this,RidgeGuardGravyActivity.class);
            startActivity(intent);
        }
    }
    public void chapathi9(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Spinach Mushroom Curry"))
        {
            Intent intent = new Intent(this,PalakMushroomCurryActivity.class);
            startActivity(intent);
        }
    } public void chapathi10(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Dal Fry Recipe"))
        {
            Intent intent = new Intent(this,DalFryRecipeActivity.class);
            startActivity(intent);
        }
    } public void chapathi11(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Sweet Corn Gravy"))
        {
            Intent intent = new Intent(this,SweetCornGravyActivity.class);
            startActivity(intent);
        }
    }
    public void chapathi12(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Mixed Dal Recipe"))
        {
            Intent intent = new Intent(this,MixedDalActivity.class);
            startActivity(intent);
        }
    }
    public void chapathi13(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Paneer Kofta Curry"))
        {
            Intent intent = new Intent(this,PaneerKofthaActivity.class);
            startActivity(intent);
        }
    }
    public void chapathi14(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Mushroom Matar Paneer Gravy"))
        {
            Intent intent = new Intent(this,MushroomMutturPaneerActivity.class);
            startActivity(intent);
        }
    }
    public void chapathi15(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Baby Corn Masala"))
        {
            Intent intent = new Intent(this,BabyCornMasalaActivity.class);
            startActivity(intent);
        }
    } public void chapathi16(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Soya Chunks Kurma Recipe"))
        {
            Intent intent = new Intent(this,SoyaChunksKurmaActivity.class);
            startActivity(intent);
        }
    } public void chapathi17(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Rajma Masala Recipe"))
        {
            Intent intent = new Intent(this,RajmaMasalaActivity.class);
            startActivity(intent);
        }
    } public void chapathi18(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Brinjal Tomato Gravy"))
        {
            Intent intent = new Intent(this,BrinjalTomatoGravyActivity.class);
            startActivity(intent);
        }
    } public void chapathi19(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Black Eyed Pea Gravy"))
        {
            Intent intent = new Intent(this,BlackEyedPeaGravyActivity.class);
            startActivity(intent);
        }
    } public void chapathi20(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Radish Channa Gravy"))
        {
            Intent intent = new Intent(this,RadishChannaGravyActivity.class);
            startActivity(intent);
        }
    } public void chapathi21(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Mixed Beans Gravy"))
        {
            Intent intent = new Intent(this,MixedBeansGravyActivity.class);
            startActivity(intent);
        }
    } public void chapathi22(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Potato Gravy"))
        {
            Intent intent = new Intent(this,PotatoGravyActivity.class);
            startActivity(intent);
        }
    } public void chapathi23(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Aloo Mutter Gravy"))
        {
            Intent intent = new Intent(this,AlooMutterGravyActivity.class);
            startActivity(intent);
        }
    } public void chapathi24(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Onion Tomato Gravy"))
        {
            Intent intent = new Intent(this,OnionTomatoGravyActivity.class);
            startActivity(intent);
        }
    } public void chapathi25(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Navratan Korma"))
        {
            Intent intent = new Intent(this,NavrathanKurmaActivity.class);
            startActivity(intent);
        }
    } public void chapathi26(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Paneer Butter Masala"))
        {
            Intent intent = new Intent(this,PaneerButterMasalaActivity.class);
            startActivity(intent);
        }
    }
    public void chapathi27(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Mushroom Korma"))
        {
            Intent intent = new Intent(this,MushroomKormaActivity.class);
            startActivity(intent);
        }
    }
    public void chapathi28(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Dal Makhani Recipe"))
        {
            Intent intent = new Intent(this,DalMakhaniActivity.class);
            startActivity(intent);
        }
    } public void chapathi29(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Mirchi ka salan recipe"))
        {
            Intent intent = new Intent(this,MirchiKaSalanActivity.class);
            startActivity(intent);
        }
    } public void chapathi30(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Vegetable Korma"))
        {
            Intent intent = new Intent(this,VegKormaActivity.class);
            startActivity(intent);
        }
    } public void chapathi31(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Dhansak-Dhansak"))
        {
            Intent intent = new Intent(this,DhansakActivity.class);
            startActivity(intent);
        }
    } public void chapathi32(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Aloo Gobi masala"))
        {
            Intent intent = new Intent(this,AlooGobiMasalaActivity.class);
            startActivity(intent);
        }
    } public void chapathi33(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Chow Chow Kootu recipe"))
        {
            Intent intent = new Intent(this,ChayoteKootuActivity.class);
            startActivity(intent);
        }
    } public void chapathi34(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Paneer Bhurji Recipe"))
        {
            Intent intent = new Intent(this,PaneerBhurjiActivity.class);
            startActivity(intent);
        }
    } public void chapathi35(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Channa Masala"))
        {
            Intent intent = new Intent(this,ChannaMasalaActivity.class);
            startActivity(intent);
        }
    } public void chapathi36(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Rajma Chawal"))
        {
            Intent intent = new Intent(this,RajmaChawalActivity.class);
            startActivity(intent);
        }
    } public void chapathi37(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Dum Aloo"))
        {
            Intent intent = new Intent(this,DumAlooActivity.class);
            startActivity(intent);
        }
    } public void chapathi38(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("White Pumpkin Kootu"))
        {
            Intent intent = new Intent(this,WhitePumpkinKottuActivity.class);
            startActivity(intent);
        }
    } public void chapathi39(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Masoor Dal Tadka"))
        {
            Intent intent = new Intent(this,MasoorDalTadkaActivity.class);
            startActivity(intent);
        }
    }
    public void chapathi40(View view)
    {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Vegetable Makhani"))
        {
            Intent intent = new Intent(this,VegMakhaniActivity.class);
            startActivity(intent);
        }
    }




}
