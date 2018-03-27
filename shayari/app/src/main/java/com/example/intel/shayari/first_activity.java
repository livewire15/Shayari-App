package com.example.intel.shayari;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class first_activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_activity);
        //ActionBar ab=getSupportActionBar();
        //ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C19A6B")));
        //Button bookmark=(Button)findViewById(R.id.bookmark1);
        Button categories=(Button)findViewById(R.id.categories);
        categories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(first_activity.this,MainActivity.class));


            }
        });
        //bookmark.setOnClickListener(new View.OnClickListener() {
           // @Override
           // public void onClick(View v) {
              //  startActivity(new Intent(first_activity.this,Bookmark.class));
          //  }
        //});

        AdView adview=(AdView)findViewById(R.id.adview);
        AdRequest adr=new AdRequest.Builder().setRequestAgent("ca-app-pub-4612668368413938/2825692058").build();
        adview.loadAd(adr);
    }


}
