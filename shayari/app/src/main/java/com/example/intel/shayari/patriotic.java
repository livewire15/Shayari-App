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

public class patriotic extends AppCompatActivity {

    String patriotic[]={"Bas Yeh Baat Hawaao Ko Bataye Rakhna,\n" +
            "Roshni Hogi Chirago Ko Jalaye Rakhna,\n" +
            "Lahu Dekar Jiski Hifazat Ki Shaheedon Ne,\n" +
            "Uss Tirange Ko Sada Dil Me Basaye Rakhna.","De Salami Iss Tirange Ko,\n" +
            "Jis Se Teri Shaan Hai,\n" +
            "Sar Hamesha Uncha Rakhna Iska,\n" +
            "Jab Tak Tujh Mein Jaan Hai.","Na Sar Jhuka Hai Kabhi,\n" +
            "Aur Na Jhukayenge Kabhi,\n" +
            "Jo Apne Dum Pe Jiye,\n" +
            "Sach Mein Zindgi Hai Wahi.","Kaale Gore Ka Bhed Nahin\n" +
            "Har Dil Se Hamara Naata Hai,\n" +
            "Kuchh Aur Na Aata Ho Humko\n" +
            "Hamein Pyar Nibhana Aata Hai.\n" +
            "\n" +
            "Happy Independence Day.","Main Muslim Hoon, Tu Hindu Hai, Hain Dono Insaan,\n" +
            "Laa Main Teri Geeta Parh Lun, Tu Parh Le Quraan,\n" +
            "Apne Toh Dil Mein Hai Dost Bas Ek Hi Armaan,\n" +
            "Ek Thali Mein Khana Khaye Saara Hindustan.","Sanskar Aur Sanskriti Ki Shaan Mile Aise,\n" +
            "Hindu Muslim Aur Hindusthan Mile Aise,\n" +
            "Hum Mil-Jul Kar Rahein Aise Ki,\n" +
            "Mandir Mein Allah Aur Masjid Main Raam Basein Jaise.","Aaj Fir Mujhe Iss Baat Ka Gumaan Ho,\n" +
            "Masjid Me Bhajan Mandir Me Azaan Ho,\n" +
            "Khoon Ka Rang Phir Ek Jaisa Ho,\n" +
            "Tum Manaao Diwali Mere Ghar Ramzan Ho","Dostana Itna BarKarar Rako Ki,\n" +
            "Majhab Beech Mein Na Aaye Kabhi,\n" +
            "Tum Usey Mandir Tak Chhod Do,\n" +
            "Woh Tumhein Masjid Chhod Jaye Kabhi.","Bade Anmol Hai Ye Khoon Ke Rishte,\n" +
            "Inko Tu Bekaar Na Kar,\n" +
            "Mera Hissa Bhi Tu Lele Bhai,\n" +
            "Ghar Ke Aangan Me Diwaar Na Kar.","Ek Sainik Ne Kya Khoob Kaha Hai...\n" +
            "Kisi Gajare Ki Khushbu Ko Mehakta Chhod Aaya Hu,\n" +
            "Meri Nanhi Si Chidiya Ko Chahakta Chhod Aaya Hu,\n" +
            "Mujhe Chhati Se Apni Tu Laga Lena Aye Bharat Maa,\n" +
            "Main Apni Maa Ki Baahon Ko Tarasta Chhod Aaya Hu.\n" +
            "Jai Hind.","Kuchh Haath Se Mere Nikal Gaya,\n" +
            "Woh Palak Jhapak Ke Chhip Gaya,\n" +
            "Fir Laash Bichh Gayi Lakhon Ki,\n" +
            "Sab Palak Jhapak Ke Badal Gaya.","Jab Rishte Raakh Mein Badal Gaye,\n" +
            "Insaniyat Ka Dil Dahal Gaya,\n" +
            "Main Poochh Poochh Ke Haar Gaya,\n" +
            "Kyon Mera Bhaarat Badal Gaya?","Naa Poochho Jamane Ko,\n" +
            "Kya Hamari Kahani Hain,\n" +
            "Hamari Pehchaan To Sirf Ye Hai\n" +
            "Ki Hum Sirf Hindustani Hain.","Bhara Nahin Jo Bhavon Se,\n" +
            "Behti Jis Me Ras Dhar Nahi\n" +
            "Wo Hriday Nahin Hai Patthar Hai\n" +
            "Jis Mein Swadesh Ka Pyaar Nahin.","Ishq Toh Karta Hai Har Koyi,\n" +
            "Mehboob Pe Marta Hai Har Koyi,\n" +
            "Kabhi Watan Ko Mehboob Bana Kar Dekho,\n" +
            "Fir Tujh Pe Marega Har Koyi.","Khushnaseeb Hain Wo Jo\n" +
            "Watan Pe Mit Jaate Hai,\n" +
            "Mar Kar Bhi Wo Log\n" +
            "Amar Ho Jaate Hai,\n" +
            "Karta Hoon Tumhe Saalam\n" +
            "Ai Watan Pe Mitne Walo\n" +
            "Tumhari Har Saans Mein Basna\n" +
            "Tirange Ka Naseeb Hai."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patriotic);
        ActionBar ab=getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C19A6B")));
        ListView lv = (ListView) findViewById(R.id.lv);
        patriotic.CustomAdapter cm = new patriotic.CustomAdapter();
        lv.setAdapter(cm);
        // Button b1=(Button)findViewById(R.id.btn1);
        // Button b2=(Button)findViewById(R.id.btn2);
    }

    public void btn1(int id) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(android.content.Intent.EXTRA_TEXT, patriotic[id]);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "Send via"));
    }


    public class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return patriotic.length;
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
            t1.setText(patriotic[position]);
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
                    //startActivity(new Intent(patriotic.this, share_pic.class));
                    setContentView(R.layout.activity_share_pic);
                    ActionBar ab = getSupportActionBar();
                    ab.hide();
                    TextView t3 = (TextView) findViewById(R.id.text);
                    t3.setText(patriotic[position]);

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
