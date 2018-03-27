package com.example.intel.shayari;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class diwali extends AppCompatActivity {

    String diwali[]={"Ki aap chillar pane ko tarse.\n" +
            "HAPPY DHANTERAS !!\n" +
            "Deepak ki roshni, Mithaiyo ki mithas,\n" +
            "Patakho ki bochar, Dhan ki barsaat,\n" +
            "Har pal Har din Aapke liye laye Dhanteras ka tyohar.\n" +
            "Happy Dhanteras!!!","Dear All ,\n" +
            "May the lamps of joy, illuminate your life and fill your days with the bright sparkles of peace, mirth and goodwill. I wish you & your family a very happy deepawali !!! May god bless you!!!\n" +
            "Wishing you happy diwali and prosperous New Year!!!\n" +
            "With affection\n" +
            "Rahul :)","\n" +
            "Iss diwali pe hamari dua hai ki,\n" +
            "Apka har sapnna pura ho,\n" +
            "Duniya ke unche mukam apke ho,\n" +
            "Shoharat ki bulandiyon par naam apka ho!\n" +
            "Wish U a very Happy Diwali!","Deep jalte jagmagate rahe,\n" +
            "Hum aapko aap hame yaad aate rahe,\n" +
            "Jab tak zindagi hai,\n" +
            "Dua hai hamari,\n" +
            "Aap chand ki tarah zagmagate rahe.\n" +
            "“Happy Diwali”","Safalta kadam chumti rahe,\n" +
            "Khushi aaspas ghumti rahe,\n" +
            "Yash itna faile ki KASTURI sharma jaye,\n" +
            "Laxmi ki kripa itni ho ki BALAJI bhi dekhte rah jaye.\n" +
            "“Happy Diwali”","Pal pal sunhare phool khile,\n" +
            "Kabhi na ho kaanto ka saamna,\n" +
            "Jindagi aapki khushiyo se bhari rahe,\n" +
            "Dipawali par humaari yahi shubhkaamna…","Ek Dua Mangte hain hum apne Bhagwan se,\n" +
            "Chahte hai Aapki Khushi Pure imaan se,\n" +
            "Sab Hasratein Puri Ho Aapki,\n" +
            "Aur Aap Muskarayen Dil-o-Jaan se!!\n" +
            "Happy Diwali that leads you on the road of Success…","Diyon ki roshni se jhilmilata aangan ho..\n" +
            "patakhon ki goonjo se aasman roshan ho..\n" +
            "aisi aaye jhum ke yeh diwali..\n" +
            "har taraf kushiyon ka mausam ho..\n" +
            "HAPPY DIWALI TO ALL FRIENDS..","Diyon ki roshni se jhilmilata aangan ho..\n" +
            "patakhon ki goonjo se aasman roshan ho..\n" +
            "aisi aaye jhum ke yeh diwali..\n" +
            "har taraf kushiyon ka mausam ho..","Tamaan jahaan jagmagaya,\n" +
            "Fir seTyohar Roshni ka aaya,\n" +
            "Koi tumhe hamnse pehle\n" +
            "Na dede badhayian,\n" +
            "Isliye,\n" +
            "ye paigam e mubarak\n" +
            "sabse pehle humne bhijwaya\n" +
            "“Diwali Mubarak“","Muskarte hanste deep tum jalana,\n" +
            "Jivan main nai khushiyon ko lana,\n" +
            "Dukh dard apne bhool kar,\n" +
            "Sabko gale lagna, sabko gale lagna…\n" +
            "Appko is diwali ki shubhkamnaye…"," Let this diwali burn all your bad times and enter you in good times.\n",
            "o The truth is that existence wants your life to become a festival…because when you are unhappy, you also throw unhappiness all around.\n",
            "o Ram! The light of lights, the self-luminous inner light of the Self is ever shining steadily in the chamber of your heart. Sit quietly. Close your eyes. Withdraw the senses. Fix the mind on this supreme light and enjoy the real Deepavali, by attaining illumination of the soul.\n",
            "o He who Himself sees all but whom no one beholds, who illumines the intellect, the sun, the moon and the stars and the whole universe but whom they cannot illumine, He indeed is Brahman, He is the inner Self. Celebrate the real Deepavali by living in Brahman, and enjoy the eternal bliss of the soul.\n",
            "o The sun does not shine there, nor do the moon and the stars, nor do lightning shine? All the lights of the world cannot be compared even to a ray of the inner light of the Self. Merge yourself in this light of lights and enjoy the supreme Deepavali.\n",
            "o Many Deepavali festivals have come and gone. Yet the hearts of the vast majority are as dark as the night of the new moon. The house is lit with lamps, but the heart is full of the darkness of ignorance. O man! wake up from the slumber of ignorance. Realize the constant and eternal light of the Soul which neither rises nor sets, through meditation and deep enquiry.\n",
            "o May you all attain full inner illumination! May the supreme light of lights enlighten your understanding! May you all attain the inexhaustible spiritual wealth of the Self! May you all prosper gloriously on the material as well as spiritual planes\n","Puja ki Thali, Rasoi me PAKWAAN.\n",
            "Aangan me Diya, Khushiya ho TAMAAM.\n" +
            "Haathon me fuljhariya, Roshan ho JAHAAN.\n" +
            "Mubarak ho aapko DIWALI Meri JAAN…\n" +
            "Laxmi devi ka nur aap par barse,\n" +
            "Har koi aapse loan lene ko tarse,\n" +
            "Bhagwan aapko de itne paise,\n" +
            "Ki aap chillar pane ko tarse.\n" +
            "HAPPY DHANTERAS !!","Deepak ki roshni, Mithaiyo ki mithas,\n" +
            "Patakho ki bochar, Dhan ki barsaat,\n" +
            "Har pal Har din Aapke liye laye Dhanteras ka tyohar.\n" +
            "Happy Dhanteras!!!"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diwali);
        ActionBar ab=getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C19A6B")));
        ListView lv = (ListView) findViewById(R.id.lv);
        diwali.CustomAdapter cm = new diwali.CustomAdapter();
        lv.setAdapter(cm);
        // Button b1=(Button)findViewById(R.id.btn1);
        // Button b2=(Button)findViewById(R.id.btn2);
    }

    public void btn1(int id) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(android.content.Intent.EXTRA_TEXT, diwali[id]);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "Send via"));
    }


    public class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return diwali.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            LayoutInflater lf = getLayoutInflater();
            convertView = lf.inflate(R.layout.shayari, null);

            TextView t1 = (TextView) convertView.findViewById(R.id.textview1);
            Button b1 = (Button) convertView.findViewById(R.id.btn1);
            b1.setId(position);
            t1.setText(diwali[position]);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    btn1(position);

                }
            });

            Button b2 = (Button) convertView.findViewById(R.id.btn2);
            b2.setId(position);
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //startActivity(new Intent(bewafa.this, share_pic.class));
                    setContentView(R.layout.activity_share_pic);
                    ActionBar ab = getSupportActionBar();
                    ab.hide();
                    TextView t3 = (TextView) findViewById(R.id.text);
                    t3.setText(diwali[position]);

                    Button share=(Button)findViewById(R.id.share);
                    share.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Bitmap bitmap =takeScreenshot();
                            // saveBitmap(bitmap);
                            Intent intent=new Intent(Intent.ACTION_SEND);
                            intent.setType("image/jpeg");
                            ByteArrayOutputStream bytes=new ByteArrayOutputStream();
                            bitmap.compress(Bitmap.CompressFormat.JPEG,100,bytes);
                            File f = new File(Environment.getExternalStorageDirectory() +File.separator+ "/screenshot.jpg");
                            try {
                                f.createNewFile();
                                FileOutputStream fos = new FileOutputStream(f);
                                fos.write(bytes.toByteArray());
                            }catch (IOException e)
                            {
                                e.printStackTrace();
                            }
                            intent.putExtra(Intent.EXTRA_STREAM, Uri.parse("file:///sdcard/screenshot.jpg"));
                            startActivity(Intent.createChooser(intent,"Share Image"));
                        }
                    });
                }
                public Bitmap takeScreenshot() {
                    ActionBar ab = getSupportActionBar();
                    ab.hide();
                    View rootView = findViewById(android.R.id.content).getRootView();
                    rootView.setDrawingCacheEnabled(true);
                    return rootView.getDrawingCache();
                }
            });
            return convertView;

        }
    }
}

