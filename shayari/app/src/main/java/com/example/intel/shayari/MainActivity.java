package com.example.intel.shayari;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import android.widget.BaseAdapter;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.squareup.picasso.Picasso;

import static com.example.intel.shayari.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    ssInterstitialAd interstitialAd;
    android.support.v7.app.ActionBar ab;
    String a[] = {"Bewafa Shayari", "Birthday Shayari", "Diwali Shayari", "Dosti Shayari", "Funny Shayari", "Love Shayari", "Patriotic Shayari", "Sharabi Shayari", "Romantic Shayari", "Mohabbat Shayari", "Prem Shayari", "Pyaar Shayari", "Ishq Shayari", "Gham Shayari"};
    int images[]={R.drawable.bewafa,R.drawable.cake,R.drawable.diwali,R.drawable.dosti,R.drawable.funny,R.drawable.love,R.drawable.patriotic,R.drawable.sharabi,R.drawable.romantic,R.drawable.mohabbat,R.drawable.prem,R.drawable.pyaar,R.drawable.ishq,R.drawable.sad};
    String numbers[]={"45","32","28","21","58","34","31","52","29","30","45","62","28","36"};
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        ab=getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C19A6B")));

        interstitialAd=new InterstitialAd(MainActivity.this);
        interstitialAd.setAdUnitId("ca-app-pub-4612668368413938/4795133863");
        AdRequest adr1=new AdRequest.Builder().setRequestAgent("ca-app-pub-4612668368413938/4795133863").build();
        interstitialAd.loadAd(adr1);

        ListView lv = (ListView) findViewById(R.id.listview);
        CustomAdapter adapter = new CustomAdapter();
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        switch (i) {
                            case 0:
                                interstitialAd.show();
                                startActivity(new Intent(MainActivity.this, bewafa.class));
                                break;
                            case 1:
                                interstitialAd.show();
                                startActivity(new Intent(MainActivity.this, birthday.class));
                                break;
                            case 2:
                                startActivity(new Intent(MainActivity.this, diwali.class));
                                interstitialAd.show();
                                break;
                            case 3:
                                startActivity(new Intent(MainActivity.this, dosti.class));
                                interstitialAd.show();
                                break;
                            case 4:
                                startActivity(new Intent(MainActivity.this, funny.class));
                                interstitialAd.show();
                                break;
                            case 5:
                                startActivity(new Intent(MainActivity.this, love.class));
                                interstitialAd.show();
                                break;
                            case 6:
                                startActivity(new Intent(MainActivity.this, patriotic.class));
                                interstitialAd.show();
                                break;
                            case 7:
                                startActivity(new Intent(MainActivity.this, sharabi.class));
                                interstitialAd.show();
                                break;
                            case 8:
                                startActivity(new Intent(MainActivity.this, romantic.class));
                                interstitialAd.show();
                                break;
                            case 9:
                                startActivity(new Intent(MainActivity.this, mohabbat.class));
                                interstitialAd.show();
                                break;
                            case 10:
                                startActivity(new Intent(MainActivity.this, prem.class));
                                interstitialAd.show();
                                break;
                            case 11:
                                startActivity(new Intent(MainActivity.this, pyaar.class));
                                interstitialAd.show();
                                break;
                            case 12:
                                startActivity(new Intent(MainActivity.this, ishq.class));
                                interstitialAd.show();
                                break;
                            case 13:
                                startActivity(new Intent(MainActivity.this, gham.class));
                                interstitialAd.show();
                                break;
                        }
                    }
                }
        );


    }

    public class CustomAdapter extends BaseAdapter
    {
        @Override
        public int getCount() {
            return a.length;
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int position, View view1, ViewGroup viewGroup) {
            LayoutInflater lf=getLayoutInflater();
            view1=lf.inflate(R.layout.view,null);
            TextView t1=(TextView)view1.findViewById(R.id.textview1);
            TextView t2=(TextView)view1.findViewById(R.id.textview2);
            ImageView i1=(ImageView)view1.findViewById(R.id.imgview);
            Picasso.with(MainActivity.this)
                    .load(images[position])
                    .resize(100,75)
                    .into(i1);
            t1.setText(a[position]);
            t2.setText(numbers[position]);
            return view1;

        }
    }

}