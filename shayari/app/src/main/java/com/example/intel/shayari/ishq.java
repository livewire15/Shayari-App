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

public class ishq extends AppCompatActivity {

    String ishq[]={"Agar ishq gunah hai to gunahagar hai khuda,\n" +
            "Jisane banaya dil kisi par aane ke liye","Agar ho jaye ishk,\n" +
            "To hamse saajha kar lena.\n" +
            "Kuchh ham rakh lenge,\n" +
            "Kuchh tum rakh lena.","Tere honthon ki lali aaj mujhe behka rahi hain,\n" +
            "Tere badan ki khushboo mujhe mehka rahi hain.\n" +
            "Teri jaan tujhe valentine’s day mubaarak ho,\n" +
            "Aaja kareeb tujhe chhoone ki bechaini badh rahi hai.","Wo Kehne Lagi…\n" +
            "NaQab Me Bhi Pehchan Lete Ho Hazaron K Beech Mai,\n" +
            "Mene Muskura K Kaha,\n" +
            "Teri Ankhon Se To Shuru Hua Tha ISHQ,\n" +
            "Hazaaron k Beech Mein.","Zamane Ki Har Jannat Tere Naam Kar Dunga,\n" +
            "Yeh Asmaan Yeh Jameen  Tere Naam Kar Dunga,\n" +
            "Mujhse Kehna Bhi Nahi Padega Tujhe,\n" +
            "Aur Mere Hisse Ki Har Khushi Tere Naam Kar Dunga.","Tumhein dekhakar main khud ko bhool jaata hoon,\n" +
            "Tanhaee mein aksar gazal gunagunaata hoon,\n" +
            "Ishq ho gaya hai ya koi aur bala hai,\n" +
            "Be-wajah yun har ghadi ab muskuraata hoon.","Koi teri aashiqi ko tarase,\n" +
            "Toh koi teri dosti ko,\n" +
            "Aur koi teri maujudgi ko tarse,\n" +
            "Ban ja sabki rehnuman tu,\n" +
            "Sab per tera karam barse.","Sawal Kuch Bhi Ho,\n" +
            "\n" +
            "Jawab Tum Hi Ho\n" +
            "\n" +
            "Rasta Koi Bhi Ho,\n" +
            "\n" +
            "Manzil Tum Hi Ho\n" +
            "\n" +
            "Dukh Kitna Hi Ho,\n" +
            "\n" +
            "Khushi Tum Hi Ho\n" +
            "\n" +
            "Arman Kitne Bhi Ho,\n" +
            "\n" +
            "Aarzoo Tum Hi Ho\n" +
            "\n" +
            "Gussa Kitna Bhi Ho,\n" +
            "\n" +
            "Pyar Tum Hi Ho\n" +
            "\n" +
            "Khawab Koi Bhi Ho,\n" +
            "\n" +
            "Us Mein Tum Hi Ho,\n" +
            "\n" +
            "kyunki TUM HI HO…!!!\n" +
            "\n" +
            "Ab tum hi ho\n" +
            "\n" +
            "meri ashiqi ab tum hi ho:!♥","Maine apni har ek saans tumhari gulaam kar rakhi hai,\n" +
            "Logon mai ye zindagi badnaam kar rakhi hai,\n" +
            "Ab ye aaina bhi kya kaam ka mere,\n" +
            "Maine to apni parchayi bhi tumhare naam kar rakhi hai.","Chale bhi aao ki hum tumse pyar karte hain,\n" +
            "Ye wo gunah hai jo hum baar-baar karte hain,\n" +
            "Log maut tak hi dildaar ki raah takte hain,\n" +
            "Hum hai ki kabar mai bhi tera intezaar karte hain.","Chehre me tere sirf mera hi noor hoga,\n" +
            "Uske baad phir tu na kabhi mujhse door hoga,\n" +
            "Jara soch ke dekh kya khushi milegi,\n" +
            "Jis pal teri maang main mere naam ka sindoor hoga.","Chupa loon is tarah tujhe apni baahon me,\n" +
            "Ki hawa bhi guzarne ki izaajat maange,\n" +
            "Ho jau itna madhosh tere pyaar me,\n" +
            "Ki hosh bhi aane ki izaajat mange.","Bhar aayi meri aankhen jab uska naam aaya,\n" +
            "Ishq nakam sahi phir bhi bahut kaam aaya,\n" +
            "Humne mohabbat mai aisi bhi guzari raatein,\n" +
            "Jab tak aansu na bahe dil ko na aaram aya.","Tujhe chahte hain Be-Intehan,\n" +
            "Par chahna nahi aata.\n" +
            ".\n" +
            "Ye kaisi mohobbat hai,\n" +
            "Ki hume kehna nahi aata.\n" +
            ".\n" +
            "Zindagi main aa jao hamari zindagi ban kar,\n" +
            "Ke tere bin humain zinda rehna nahi aata.\n" +
            ".\n" +
            "Har pal bas tujhe hi dua’on main mangte hain,\n" +
            "Kya kare ke tumhare siwa kuch mangna nahi aata.","Kabhi tum mujhe kareeb se aa kar dekhna,\n" +
            "Aise nahi jara aur paas aa kar dekhna,\n" +
            "Main tum se kitna pyaar karta hoon,\n" +
            "Mujhe kabhi seene se laga kar dekhna.♡"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ishq);
        ActionBar ab=getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C19A6B")));
        ListView lv = (ListView) findViewById(R.id.lv);
        ishq.CustomAdapter cm = new ishq.CustomAdapter();
        lv.setAdapter(cm);
        // Button b1=(Button)findViewById(R.id.btn1);
        // Button b2=(Button)findViewById(R.id.btn2);
    }

    public void btn1(int id) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(android.content.Intent.EXTRA_TEXT, ishq[id]);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "Send via"));
    }


    public class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return ishq.length;
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
            t1.setText(ishq[position]);
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
                    //startActivity(new Intent(ishq.this, share_pic.class));
                    setContentView(R.layout.activity_share_pic);
                    ActionBar ab = getSupportActionBar();
                    ab.hide();
                    TextView t3 = (TextView) findViewById(R.id.text);
                    t3.setText(ishq[position]);

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
