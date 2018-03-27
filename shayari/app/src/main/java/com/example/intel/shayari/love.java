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

public class love extends AppCompatActivity {

    String love[]={"Kashti ke musafir ne samandar nahi dekha.\n" +
            "Ankho me rahe dil me utarkar nahi dekha.\n" +
            "Patthar samjhte hai mere chahne wale mujhe.\n" +
            "Par mom hu main kisi ne chu kar nahi dekha.","Dil Ki Baat Chhupana Aata Nahi,\n" +
            "Kisi Ka Dil Dukhana Aata Nahi,\n" +
            "Aap Sochte He Hum Bhul Gaye Aapko,\n" +
            "Par Kuchh Achhe Dosto Ko Bhulana Humko Aata Nahi.","Kitna Dur Nikal Gaye Riste Nibhate Nibate,\n" +
            "Khud Ko Kho Diya Humne Apno Ko Pate Pate,\n" +
            "Log Kahte Hai Dard Hai Mere Dil Me,\n" +
            "Aur Hum Thak Gye Muskurate Muskurate.","Zindgi se apna har dard chupa lena,\n" +
            "Khushi na sahi gam gale laga lena,\n" +
            "Koi agar kahe mohabbat aasan hai,\n" +
            "To use mera toota hua dil dikha dena.","Dil ke sagar me lehre uthaya na karo,\n" +
            "khwab bankar neend churaya na karo,\n" +
            "bahot chot lagti hai mere dil ko,\n" +
            "tum khwabo mein aa kar yu tadpaya na karo..","Kabhi Kabher hi sahi, milne k bahane chahiye,\n" +
            "Ise dil ko yaado k aashiyane chahiye,\n" +
            "Jinse ho jaati hai zindagi janat meri,\n" +
            "Nigaho ko bs wo thikana chahiye.","Pyaar koi diya nahi, jab chaaha jala diya bujha diya,\n" +
            "Ye baalu ka mahal nahi,jab chaaha bana liya mita diya,\n" +
            "Ye rass hai jo dil ki gaharaiyon se nikalata hai,\n" +
            "Ye bachho ka khel nahi, jise chaaha hara diya jita diya.","Paas aa zara dil ki baat btaun tujhko,\n" +
            "Kese dharkta ha dil awaz sunao tujhko,\n" +
            "Aakar tu dekh le dil pe likha h naam tera\n" +
            "Agr kahe to dil cheer ke dikhaun tujko.","Chupake se aakar is dil mein utar jaate ho,\n" +
            "Saanson mein meee khushabu ban ke bikhar jate ho,\n" +
            "kuchh yoon chala hai tere ishk ka jaadu,\n" +
            "Sote-jaagate tum hi tum nazar aate ho.","Tujhe dekhe bina teri tasvir bana sakta hoon,\n" +
            "Tujhse mile bina tera haal bata sakta hoon,\n" +
            "Hai meri dosti mein itna dum,\n" +
            "Apni aankh ka aansoo teri aankh se gira sakta hoon.","Tujhe chaha bhi to ijahaar na kar sake,\n" +
            "Kat gai umar kisi se pyaar na kar sake,\n" +
            "Tune maanga bhi to apani judai maangi,\n" +
            "Aur ham the ki inkaar na kar sake.\n" +
            "\n","Jab se dekha hai teri aankhon mein jhank kar,\n" +
            "koi bhi aaina acha nahin lagta,\n" +
            "teri mohabbat mein aise hue hai deewane,\n" +
            "tumhe koi aur dekhe toh acha nahin lagta.","Ye Dil Kisi ko pana chahta hai,\n" +
            "Aur ushe apna bnana chahta hai..\n" +
            "Khud to chahta hai khusi se dhadkna,\n" +
            "Uska dil bhi dhadkana chahta hai..\n" +
            "Jo hasi kho gayi thi barso pehle kahin,\n" +
            "Fir ushe labo pe sajana chahta hai..\n" +
            "Tayyar hai pyar me sath chalne ke liye,\n" +
            "Uske har gum ko apnana chahta hai..\n" +
            "Mohabbat to ho hi gayi hai ab to, pr,\n" +
            "Ab ushi se hi chhipana chahta hai..\n" +
            "Ye dil ab kisi ko pana chahta hai,\n" +
            "Aur ushe sirf apna bnana chahta hai.","Jab khamosh aankho se baat hoti hai.\n" +
            "Aise hi mohabbat ki shurwat hoti hai.\n" +
            "Tumhare hi khyalo mein khoye rehte hai.\n" +
            "Pata nahi kab din kab raat hoti hai ?","Tere libas se mohabbat ki hai,\n" +
            "tere ehsas se mohabbat ki hai,\n" +
            "tu mere paas nahi fir bhi,\n" +
            "maine teri yaad se mohabbat ki hai,\n" +
            "kabhi tune bhi mujhe yaad kiya hoga,\n" +
            "maine un lamho se mohabbat ki hai,\n" +
            "jinme ho sirf teri aur meri baatein,\n" +
            "maine un alfaaz se mohabbat ki hai,\n" +
            "jo mahkate ho teri mohabbat se,\n" +
            "maine un jazbat se mohabbat ki hai,\n" +
            "aaoge kab wapis meri jaan,\n" +
            "maine tere intezaar se mohabbat ki hai!","Ham juda hue the phir milane ke liye,\n" +
            "zindagi ki raahon mein sang chalane ke liye,\n" +
            "tere pyaar ki kashish dil mein basi hai kuchh is qadar,\n" +
            "dua hai tera sath mile zara sambhalane ke liye","Hasrat hai sirf tumhe pane ki,\n" +
            "aur koi khawahish nahi is dewane ki,\n" +
            "shikwa mujhe tumse nahi khuda se hai,\n" +
            "kya zarurat thi tumhe itna khubsurat banane ki?","Jab jab yaad karogi apani tanhaiyo ko,\n" +
            "ek jalata charaag sa nazar aauga main\n" +
            "raah se rahaguzar ban ke bhi gujar jaogi,\n" +
            "ek mil ka patthar sa khada nazar aauga main..","Muskurate palko pe sanam chale aate hein,\n" +
            "Aap kya jaano kahan se hamare ghum aate hain,\n" +
            "Aaj bhi us mod par khade hain,\n" +
            "Jaha kisi ne kaha tha ke theron hum abhi aate hain.","Dil ka dard ek raaz banke reh gaya,\n" +
            "Mera bharosa mazak banke reh gaya,\n" +
            "Dilo ke saudagar se dillagi kar bethe,\n" +
            "Shayad is liye mera pyaar mazak ban ke reh gaya.","Maine apni har ek saans tumhari gulaam kar rakhi hai,\n" +
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
        setContentView(R.layout.activity_love);
        ActionBar ab=getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C19A6B")));
        ListView lv = (ListView) findViewById(R.id.lv);
        love.CustomAdapter cm = new love.CustomAdapter();
        lv.setAdapter(cm);
        // Button b1=(Button)findViewById(R.id.btn1);
        // Button b2=(Button)findViewById(R.id.btn2);
    }

    public void btn1(int id) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(android.content.Intent.EXTRA_TEXT, love[id]);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "Send via"));
    }


    public class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return love.length;
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
            t1.setText(love[position]);
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
                    //startActivity(new Intent(love.this, share_pic.class));
                    setContentView(R.layout.activity_share_pic);
                    ActionBar ab = getSupportActionBar();
                    ab.hide();
                    TextView t3 = (TextView) findViewById(R.id.text);
                    t3.setText(love[position]);

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
