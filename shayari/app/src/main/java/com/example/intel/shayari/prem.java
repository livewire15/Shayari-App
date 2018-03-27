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

public class prem extends AppCompatActivity {

    String prem[]={"Humdum To Sath Sath Chalte Hain,\n" +
            "Raaste To Bewafa Badalte Hain,Tera Chehra\n" +
            "Hai Jab Se Aankhon Mein,\n" +
            "Meri Aankhon Se Log Jalte Hain.","Khushboo Bankar Teri Saanso Mein Sama Jayenge,\n" +
            "Sukun Bankar Tere Dil Mein Utar Jayenge,\n" +
            "Mehsus Karne Ki Koshish To Kijiye,\n" +
            "Dur Rahte Hue Bhi Pass Najar Aayenge.","Tera Intezaar Mujhe Har Pal Rehta Hai,\n" +
            "Har Lamha Mujhe Tera Ehsaas Rehta Hai,\n" +
            "Tujh Bin Dhadkane Rukk Si Jaati Hai,\n" +
            "Ki Tu Mere Dil Me Meri Dhadkan Banke Rehta Hai.","Apne Aasman Se Meri Zameen Dekh Lo,\n" +
            "Tum Khwab Aaj Koyi Haseen Dekh Lo,\n" +
            "Agar Aazmana Hain Aitbar Ko Mere To,\n" +
            "Ek Juth Tum Bolo Or Mera Yakeen Dekh Lo.","Udaas Hoon Par Tujhse Naaraz Nahi\n" +
            "Tere Dil Mein Hoon Par Tere Pass Nahi\n" +
            "Jhoot Kahun To Sab Kuch Hai Mere Pass\n" +
            "Aur Sach Kahun To Ek Tere Siwa Kuch Bhi Khaas Nahi.","Nazare Mile to Pyar ho Jata Hai,\n" +
            "Palke Uthe to Izhaar Ho Jata Hai,\n" +
            "Na Jane Kya Kashish Hai Chahat Me,\n" +
            "Kei Koyi Anjaan Bhi Hamari\n" +
            "Zindagi Ka Haqdaar Ho Jata Hai.","Yaadon Me Humari Aap Bhi Khoye Honge,\n" +
            "Khuli Aankho Se Kbhi Aap Bhi Soye Honge,\n" +
            "Mana Hasna Hain Adaa Gam Chhupane Ki,\n" +
            "Par Haste Haste Kabhi Aap Bhi Roye Honge.","आज मुझे ये बताने की इजाज़त दे दो,\n" +
            "आज मुझे ये शाम सजाने की इजाज़त दे दो,\n" +
            "अपने इश्क़ मे मुझे क़ैद कर लो,\n" +
            "आज जान तुम पर लूटाने की इजाज़त दे दो.","Is Benaam Se Rishte Ko Nibha Jao\n" +
            "Kisi Din, Jo Mil Jaye Fursat To\n" +
            "Paas Aao Kisi Din, Milta Hai Sabhi\n" +
            "Ko Sab Kuch Ye Suna Hai, Mujhe\n" +
            "To Faqat Tum Hi Mil Jao Kisi Din.","Kuch Sochu To Apka Khayal Aa Jata He,\n" +
            "Kuch Bolu To Apka Naam Aa Jata He,\n" +
            "Kab Tak Chupau Dil Ki Baat,\n" +
            "Apki Har Ada Par Humko Pyar Aa Jata He.","Hum Mohabbat Ki Kabhi Numaish Nahi Karte,\n" +
            "Hum Lafzon Ki Bhi Pamaish Nahi Karte,\n" +
            "Jise Chahte Hai Ham Toot Ke Chahte Hai,\n" +
            "Badle Mein Pyar Ki Khawaish Tak Nahi Karte","Khubsurat Sa Ek Pal Kissa Banjata Hai,\n" +
            "Jane Kab Kaun Zindagi Ka Hissa Banjata Hai,\n" +
            "Kuchh Log Zindagi Mein Milte Hai Aise,\n" +
            "Jinse Kabhi Na Tutnewala Rishta Banjata Hai.","Rasto Mein Pathron Ki Kami Nahi Hoti,\n" +
            "Dil Mein Khwabo Ki Kami Nahi Hoti,\n" +
            "Hum Chahte Hai Unko Apna Banana,\n" +
            "Par Unke Paas Apno Ki Kami Nahi Hoti.","\"Jab khamosh aankho se baat hoti hai.\\n\" +\n" +
            "            \"Aise hi mohabbat ki shurwat hoti hai.\\n\" +\n" +
            "            \"Tumhare hi khyalo mein khoye rehte hai.\\n\" +\n" +
            "            \"Pata nahi kab din kab raat hoti hai ?\",\"Tere libas se mohabbat ki hai,\\n\" +\n" +
            "            \"tere ehsas se mohabbat ki hai,\\n\" +\n" +
            "            \"tu mere paas nahi fir bhi,\\n\" +\n" +
            "            \"maine teri yaad se mohabbat ki hai,\\n\" +\n" +
            "            \"kabhi tune bhi mujhe yaad kiya hoga,\\n\" +\n" +
            "            \"maine un lamho se mohabbat ki hai,\\n\" +\n" +
            "            \"jinme ho sirf teri aur meri baatein,\\n\" +\n" +
            "            \"maine un alfaaz se mohabbat ki hai,\\n\" +\n" +
            "            \"jo mahkate ho teri mohabbat se,\\n\" +\n" +
            "            \"maine un jazbat se mohabbat ki hai,\\n\" +\n" +
            "            \"aaoge kab wapis meri jaan,\\n\" +\n" +
            "            \"maine tere intezaar se mohabbat ki hai!\",\"Ham juda hue the phir milane ke liye,\\n\" +\n" +
            "            \"zindagi ki raahon mein sang chalane ke liye,\\n\" +\n" +
            "            \"tere pyaar ki kashish dil mein basi hai kuchh is qadar,\\n\" +\n" +
            "            \"dua hai tera sath mile zara sambhalane ke liye\",\"Hasrat hai sirf tumhe pane ki,\\n\" +\n" +
            "            \"aur koi khawahish nahi is dewane ki,\\n\" +\n" +
            "            \"shikwa mujhe tumse nahi khuda se hai,\\n\" +\n" +
            "            \"kya zarurat thi tumhe itna khubsurat banane ki?\",\"Jab jab yaad karogi apani tanhaiyo ko,\\n\" +\n" +
            "            \"ek jalata charaag sa nazar aauga main\\n\" +\n" +
            "            \"raah se rahaguzar ban ke bhi gujar jaogi,\\n\" +\n" +
            "            \"ek mil ka patthar sa khada nazar aauga main..\",\"Muskurate palko pe sanam chale aate hein,\\n\" +\n" +
            "            \"Aap kya jaano kahan se hamare ghum aate hain,\\n\" +\n" +
            "            \"Aaj bhi us mod par khade hain,\\n\" +\n" +
            "            \"Jaha kisi ne kaha tha ke theron hum abhi aate hain.\",\"Dil ka dard ek raaz banke reh gaya,\\n\" +\n" +
            "            \"Mera bharosa mazak banke reh gaya,\\n\" +\n" +
            "            \"Dilo ke saudagar se dillagi kar bethe,\\n\" +\n" +
            "            \"Shayad is liye mera pyaar mazak ban ke reh gaya.\""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prem);
        ActionBar ab=getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C19A6B")));
        ListView lv = (ListView) findViewById(R.id.lv);
        prem.CustomAdapter cm = new prem.CustomAdapter();
        lv.setAdapter(cm);
        // Button b1=(Button)findViewById(R.id.btn1);
        // Button b2=(Button)findViewById(R.id.btn2);
    }

    public void btn1(int id) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(android.content.Intent.EXTRA_TEXT, prem[id]);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "Send via"));
    }


    public class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return prem.length;
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
            t1.setText(prem[position]);
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
                    //startActivity(new Intent(prem.this, share_pic.class));
                    setContentView(R.layout.activity_share_pic);
                    ActionBar ab = getSupportActionBar();
                    ab.hide();
                    TextView t3 = (TextView) findViewById(R.id.text);
                    t3.setText(prem[position]);

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
