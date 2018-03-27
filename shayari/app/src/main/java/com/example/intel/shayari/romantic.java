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

public class romantic extends AppCompatActivity {

    String romantic[]={"Gile shikwe na dil se \n" +
            "Laga lena..!\n" +
            "Kabhi maan jana to \n" +
            "Kabhi manaa lena..!\n" +
            "Kal ka kya pata \"hum ho na ho\"\n" +
            "Jab mauka mile thoda \n" +
            "Hass lena aur hasaa dena","Isi Karz Ko Ada Krne K Wasty Hum Saari Raat Nahi Sote K \n" +
            "\n" +
            "Shayad Koi Jaag Raha Ho Is Duniya Main Mere Liye !!!!!","Parwah kar uski jo teri parwah kare,\n" +
            "Zindagi mein jo kabi na tanha kare,\n" +
            "Jaan ban ke utar jaa uski ruh mein,\n" +
            "Jo jaan se bhi jyada tujhse wafa kare.","ab chhoti chhoti baaton mein,\n" +
            "hum haste they , rote they ,\n" +
            "TAB SE TUMSE PYAAR KIYA\n" +
            "Jab bin mausam barsaato mein,\n" +
            "hum jhoom jhoom ke gaate they ,\n" +
            "TAB SE TUMSE PYAAR KIYA\n" +
            "Jab chup chup ke aadhi raaton mein,\n" +
            "chhat pe taare ginte they ,\n" +
            "TAB SE TUMSE PYAAR KIYA\n" +
            "Ab toh khud bhi bhool chuka hu,\n" +
            "ki kabse tumse pyaar kiya,\n" +
            "bas itna he keh sakta hu, ki SIRF TUMSE,\n" +
            "TUMHI SE PYAAR KIYA ..","Kalam thi hath mai likhna sikhaya apne,\n" +
            "Takat thi hath mai hosla dilaya apne,\n" +
            "Manzil thi samne rasta dikhaya apne,\n" +
            "Hum to sirf dost they,\n" +
            "AASHIQ BANAYA Aap ne","Zindagi ka pehla pyaar kaun bhulata hai,\n" +
            "Ye pehli baar hota hai jab koi kisi ko\n" +
            "khud se badh kar chahta hai… Uski pasand, uski khwahish\n" +
            "mein khud ko bhool jata hai,\n" +
            "Akele mein uska naam likh likh kar mitata hai…\n" +
            "Baat karne se pehle sochta hai.. kya kehna hai,\n" +
            "Baat hone ke baad phir kuch kehna reh jata hai....","Jaante Ho Mahobbat Kise Kehte Hain ??\"\n" +
            "Kisi ko Sochna, Soch kar Muskurana,,\n" +
            "Phir Aansoo Baha kar So Jana....\n" +
            "Usey mohabbat kehte hain.","Pyaar me Maut se darta kaun hai?\n" +
            "Pyar ho jata hai karta kaun hai?\n" +
            "Hum to kardein Pyaar me Jaan bhi Kurban..\n" +
            "Lekin Pata to chale ki hum se Pyaar karta kaun hai?","Kismat par naaz hai toh wajah teri rehmat,\n" +
            "Khushiyan jo paas hai toh wajah teri rehmat,\n" +
            "Mere apne mere sath hai toh wajah teri rehmat,\n" +
            "Mai tujhse mohabbat ki talab kaise na karun,\n" +
            "Chalti jo ye saans hai toh wajah teri rehmat.","Jane Ko Toh Dur Ham Bhi Ja Sakte Hain Ek Pal Mai Tumse,\n" +
            "Par Tumhara Sath Isliye Nahi Chodte,\n" +
            "Kyuki Tumhe Akela Dekhkar,\n" +
            "Mujhe Bhi Apna Dard Najar Aaya Tha.","Sirf Isharoon Mai Hoti Mohabbat Agar,\n" +
            "In Alfazoon Ko Khoobsurati Kaun Deta?\n" +
            "Bas Patthar Ban Ke Reh Jata “Taj Mahal”,\n" +
            "Agar Ishq Isey Apni Pehchan Na Deta."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romantic);
        ActionBar ab=getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C19A6B")));
        ListView lv = (ListView) findViewById(R.id.lv);
        romantic.CustomAdapter cm = new romantic.CustomAdapter();
        lv.setAdapter(cm);
        // Button b1=(Button)findViewById(R.id.btn1);
        // Button b2=(Button)findViewById(R.id.btn2);
    }

    public void btn1(int id) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(android.content.Intent.EXTRA_TEXT, romantic[id]);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "Send via"));
    }


    public class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return romantic.length;
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
            t1.setText(romantic[position]);
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
                    //startActivity(new Intent(romantic.this, share_pic.class));
                    setContentView(R.layout.activity_share_pic);
                    ActionBar ab = getSupportActionBar();
                    ab.hide();
                    TextView t3 = (TextView) findViewById(R.id.text);
                    t3.setText(romantic[position]);

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
