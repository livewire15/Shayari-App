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

public class sharabi extends AppCompatActivity {

    String sharabi[]={"Sharab Sareer Ko Khatam Krti Hai\n" +
            "Sharab Samaj Ko Khatam Krti Hai,\n" +
            "Aao Aaj Is Sharab Ko Khatam Krte Hain,\n" +
            "Ek Bottle Tum Khtam Kro, Ek Bottle Hum Khatam Krte Hai..","Ishq-a-bewafai ne daal di hai aadat buri,\n" +
            "Main bhi sharif hua karta tha is zamane mein,\n" +
            "Pehle din shuru karta tha masjid mein namaaz se,\n" +
            "Ab dhalti hai shaam sharab ke sath mehkhane mein.","Madhhosh hum hardam raha karte hain,\n" +
            "Aur ilzaam sharaab ko diya karte hain,\n" +
            "Kasoor sharaab ka nahi unka hai yaron,\n" +
            "Jinka chehra hum har jaam mein talaash kiya karte hain.","Aashikon ko mohabbat ke alava agar kuchh kaam hota,\n" +
            "Toh maikhane jake har roz yun badnam na hota,\n" +
            "Mil jaati chahne wali usse bhi kahin raah mein koi,\n" +
            "Agar kadmon mein nasha aur hath mein jaam na hota.","Pee ke raat ko hum unko bhulane lage,\n" +
            "Sharab mein gham ko milane lage,\n" +
            "Daru bhi bewafa nikali yaron,\n" +
            "Nashe mein to woh aur bhi yaad aane lage.","Raat chup hai magar chand khamosh nahi,\n" +
            "Kaise kahoon aaj phir hosh nahi,\n" +
            "Is tarah dooba hoon teri mohabbat ki gahrai mein,\n" +
            "Hath mein jaam hai aur peena ka hosh nahi.","Rok do mere janaze ko zaalimon,\n" +
            "Mujh mein jaan aa gayi hai,\n" +
            "Peeche mud ke dekho kameeno,\n" +
            "Daru ki dukan aa gayi hai…\n" +
            "CHEERS !!","Ek jaam ulfat ke naam,\n" +
            "Ek jaam mohabat ke naam.\n" +
            "Ek jaam wafa k naam,\n" +
            "Puri botal bewafa ke naam,\n" +
            "Aur pura theka doston ke naam.","Teri aankhon ke ye jo pyale hain,\n" +
            "Meri andheri raaton ke ujale hain,\n" +
            "Peeta hoon jaam par jaam tere naam ka,\n" +
            "Hum to sharabi be-sharab wale hain..!!","Pee hai sharab har gali har dukan se,\n" +
            "Ek dosti si ho gai hai sharab ke jaam se,\n" +
            "Guzre hain hum ishq mein kuchh aise mukam se,\n" +
            "Ke nafrat si ho gai hai mohabbat ke naam se.","Gham is kadar mila ki ghabra ke pee gaye,\n" +
            "Khushi thodi si mili to mila ke pee gaye,\n" +
            "Yun to naa thi janam se peene ki aadat,\n" +
            "Sharab ko tanha dekha to taras khaa ke pee gaye.\n" +
            "\n","Nasha hum karte hain,\n" +
            "ilzaam sharaab ko diya jaata hai,\n" +
            "magar ilzaam sharab ka nahi unka hai,\n" +
            "jinka chehra hume har jaam me nazar aata hai.","Log Peete Hai Sharab Mehkhane Ja-Ja Kar,\n" +
            "\n" +
            "Jo Do Pal Mein Utar Jayegi,\n" +
            "\n" +
            "Humne To Pee Hai Apne Mehboob Ki Aankho Se,\n" +
            "\n" +
            "Jo Umar Bhar Naa Utar Payegi.","Kuch Log Peete Hain Gam Bhoolane Ko,\n" +
            "\n" +
            "Kuch Log Peete Hain Koi Aur Gam Bhoolaane Ko,\n" +
            "\n" +
            "Par Ai Dost Ye Kya,\n" +
            "\n" +
            "Hum To Mahoal Na Milane Ke Gam Mein Peete Hain.","Ek Jahan Maanga Tha Jisme Bahot Saara Pyar Mile,\n" +
            "\n" +
            "Magar De Diya Mehkhana Jahan Bahot Saari Sharab Thi\n" +
            "\n" +
            "Ek Kandha Maanga Tha Jiska Mujhe Sahara Mile,\n" +
            "\n" +
            "Magar De Di Zindagi Jahan Duniya Bhar Ki Tanhai Thi.","Dard Ki Mehfil Me Ek Sher Hum Bhi Arz Kiya Karte Hai,\n" +
            "\n" +
            "Na Kisi Se Marham Na Duaon Ki Ummed Kiya Karte Hai,\n" +
            "\n" +
            "Kayi Chehre Lekar Log Yaha Jiya Karte Hai,\n" +
            "\n" +
            "Hum In Aasunao Ko Ek Chehre Ke Liye Peeya Karte Hai.","Dil Pe Jab Se Sharab Ka Pehra Lag Gaya,\n" +
            "\n" +
            "Gam Ka Andar Aane Ka Raasta Band Ho Gaya,\n" +
            "\n" +
            "Zubaan Ne Jab Se Sharab Ko Choo Liya,\n" +
            "\n" +
            "Uska Naam Hamesha Ke Liye Bhool Gaya.","Gham Is Kadar Mila Ki Ghabra Ke Pee Gaye,\n" +
            "\n" +
            "Khushi Thodi Si Mili To Mila Ke Pee Gaye,\n" +
            "\n" +
            "Yun To Naa Thi Janam Se Peene Ki Aadat,\n" +
            "\n" +
            "Sharab Ko Tanha Dekha To Taras Khaa Ke Pee Gaye.","Raat Chup Hai Magar Chand Khamosh Nahi,\n" +
            "\n" +
            "Kaise Kahoon Aaj Phir Hosh Nahin,\n" +
            "\n" +
            "Is Tarah Dooba Hoon Teri Mohabbat Ki Gahrai Mein,\n" +
            "\n" +
            "Hath Mein Jaam Hai Aur Peena Ka Hosh Nahin.","Yaaron Ki Mehfil Aise Jamai Jati Hai,\n" +
            "\n" +
            "Khulne Se Pehle Botal Hilaayi Jati Hai,\n" +
            "\n" +
            "Fir Awaz Lagayi Jati Hai Aa Jao Tute Dil Walo,\n" +
            "\n" +
            "Yeh Dard-E-Dil Ki Dawa Pilayi Jati Hai.","Hamesha Yad Ati Hai Unki,\n" +
            "\n" +
            "Aur Mood Ho Jata Hai Kharab,\n" +
            "\n" +
            "Tab Hamesha Lekar Baithe Hai Hum,\n" +
            "\n" +
            "Ek Hath Me Kalam Aur Ek Hath Me Sharab.","Dil Pe Jab Se Sharab Ka Pehra Lag Gaya,\n" +
            "\n" +
            "Gam Ka Andar Aane Ka Raasta Band Ho Gaya\n" +
            "\n" +
            "Zubaan Ne Jab Se Sharab Ko Chhu Liya,\n" +
            "\n" +
            "Uska Naam Hamesha Ke Liye Bhool Gaya."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharabi);
        ActionBar ab=getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C19A6B")));
        ListView lv = (ListView) findViewById(R.id.lv);
        sharabi.CustomAdapter cm = new sharabi.CustomAdapter();
        lv.setAdapter(cm);
        // Button b1=(Button)findViewById(R.id.btn1);
        // Button b2=(Button)findViewById(R.id.btn2);
    }

    public void btn1(int id) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(android.content.Intent.EXTRA_TEXT, sharabi[id]);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "Send via"));
    }


    public class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return sharabi.length;
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
            t1.setText(sharabi[position]);
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
                    //startActivity(new Intent(sharabi.this, share_pic.class));
                    setContentView(R.layout.activity_share_pic);
                    ActionBar ab = getSupportActionBar();
                    ab.hide();
                    TextView t3 = (TextView) findViewById(R.id.text);
                    t3.setText(sharabi[position]);

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
