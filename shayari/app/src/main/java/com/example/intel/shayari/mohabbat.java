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

public class mohabbat extends AppCompatActivity {

    String mohabbat[]={"Kisi Ke Pyaar Ko Pa Lena Hi Mohabbat Nahi Hoti \n" +
            "Kisi Ke Door Rahane Par Usako Pal Pal Yaad Karana Bhi Mohabbat Hoti Hai ","Bas Rishta Hi To Toota Hai Mohabbat To Aaj Bhi Hame Unase Hi Hai ","Jahar Se Adhik Khataranaak Hain Yah Pyaar \n" +
            "Jo Bhi Chakh Le Mar Mar Ke Jeeta Hen","Mohabbat Kaisi Bhi Ho Kasam Se\n" +
            "Sajada Karana Sikha Deti Hai","Pyaar Mohabbat Aashiqi.Ye Bas Alphaaj The.\n" +
            "Magar.Jab Tum Mile Tab In Alphaajo Ko Maayane Mile","Na Jaane Muhabbat Mein Kitane Aphasaane Ban Jaate Hai\n" +
            "Shamaan Jisako Bhee Jalaati Hai Vo Paravaane Ban Jaate Hai\n" +
            "Kuchh Haasil Karana Hee Ishk Ki Manjil Nahee Hotee\n" +
            "Kisi Ko Khokar Bhi Kuchh Log Divaane Ban Jaate Hai","Mohabbat Ki Aajamaish De De Kar Thak Gaya Hoon Ai Khuda.\n" +
            "Kismat Men Koy Aisa Likh De.Jo Maut Tak Wafa Kare.","Vado Se Bandhi Janzeer Thi Jo Tod Di Mainne\n" +
            "Ab Se Jaldi Soya Karenge , Mohabbat Chhod Di Mainne","Wo Jis Din Karega Yaad Meri Mohabbat Ko\n" +
            "Royega Bahut Khud Ko Bewfa Kah Kar","Utar Jaate Hai Dil Me Kuchh Log Es Kadar\n" +
            "Unako Nikaalo To Jaan Nikal Jaati Hai","Pyaar ek Ehsaas hai,\n" +
            "Jo dil ke bada paas hai.\n" +
            "Saaree duniya lagatee hai begaanee,\n" +
            "Wahee lagata hai pyaara jisaka dil me vaas hai..","Suno..Waise to “tum” meree “pehlee” pasand ho..\n" +
            "Magar maine “chahaa” hai tumhe apnee “aakharee” mohabbat kee tarah..","Meri fikr mein khud ko bhool jaati ho\n" +
            "Aur bekhabar ho mujh ko ye jatati ho.\n" +
            "\n" +
            "Hone lagti ho jis pal door mujhse\n" +
            "Kasam se us pal bahut yaad aati ho.\n" +
            "\n" +
            "Chaahatee ho kitna, poochhoo jab kabhee to\n" +
            "Aankhon hee aankhon mein sab kuchh batati ho.\n" +
            "\n" +
            "Mohabbat mein meree khud ko bhulae baithee ho\n" +
            "Aur dil mein apane jazbaat chhupaati ho.","Saath tera jo mila to dil mein sukoon sa lagane laga,\n" +
            "Tera na chhodenge saath kabhee har pal khwaab sajane laga.\n" +
            "\n" +
            "Nahin pata tha zindagee kya hotee hain tujhase milane se pahale,\n" +
            "Tum aaye zindagee mein mere to soye aramaan machalane laga.\n" +
            "\n" +
            "Tum hee se to judee hain ab har khushiya meree jaaneman,\n" +
            "Tumhaaree chuan se mera har lamha ab mahakane laga.\n" +
            "\n" +
            "Pata na chala kab kaun see dor teree or khinch laayee,\n" +
            "Tera saath paakar mera har lamha khoobasoorat banane laga.","Muskura jaata hoon aksar gusse mein bhee tera naam sun kar,\n" +
            "Tere naam se itnee mohabbat hai to soch tujhse kitnee hogee…","“Hamein kahan maaloom tha ki ishq hota kya hai..!\n" +
            "Bas, ek tum mile aur zindagee…muhabbat ban gaee!.!”","Aisa nahin hai ki din nahin dhalata…..ya raat nahin hotee,\n" +
            "Sab adhoora sa lagata hai….jab tumase baat nahin hotee…!!","Jab unhone sine se lagaya to esa laga,\n" +
            "Jaise jamee ko aasma mil gya,\n" +
            "Yu to band thi najare hamari,\n" +
            "Lekin band aankho se bhi jannat ka najara dikh gya,\n" +
            "Sochta rha me ki kat jaye baki jindagi isi tarah,\n" +
            "Or band najro se asko ka najrana nikal gya,\n" +
            "Kya btau yaro kesa ehesas tha wo,\n" +
            "Jaise mar ke jeene ka ehsas mil gya","Meri subah hoti hai tere naam se,\n" +
            "Har pal mehakta hai teri yaadon se,\n" +
            "Raat guzar jaati hai teri tasveer se,\n" +
            "Ab baaki zindagi guzare tumhari baahon mein.\n" +
            "Love you, sweet heart.","Soch Kar Rakhna Hamari Saltanat Main Kadam,\n" +
            "Hamari ”Mohabbat” Ki Qaid Mein Zamanat Nahi Hoti.","Jazbaat Mere Kahin Kuch Khoye Huye Se Hain,\n" +
            "Kahun Kaise Wo Tumse Thoda Sharmaye Huye Se Hain,\n" +
            "Par Aaj Na Rok Sakunga Jazbato Ko Main Apne,\n" +
            "Karte Hain Pyar Hum Tumhi Se Par Ghabraye Se Huye Hai.","Chhod Do Tanhai Mein Mujhko Yaaron,\n" +
            "Saath Mere Rehkar Kya Paaoge,\n" +
            "Agar Ho Gayi Aapko Bhi Mohabbat Kabhi,\n" +
            "Meri Tarah Tum Bhi Pachtaoge.","Kasoor na unka hai na hamara,\n" +
            "Hum dono bas rishto ki rasmein hi nibhate rahe,\n" +
            "Dosti ka ehsaas wo jatate rahe,\n" +
            "Aur hum is mohabbat ko bas dil main hi chipate rahe.","Kyun Koi Chah Kar Mohabbat Nibha Nahi Pata,\n" +
            "Kyun Koi Chah Kar Rishta Bana Nahi Pata,\n" +
            "Kyun Leti Hai Zindagi Aisi Karwat,\n" +
            "Ki Koi chah Kar Bhi Pyar Jata Nhi Pata…!!!","Pyaar me Maut se darta kaun hai?\n" +
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
        setContentView(R.layout.activity_mohabbat);
        ActionBar ab = getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C19A6B")));
        ListView lv = (ListView) findViewById(R.id.lv);

        mohabbat.CustomAdapter cm = new mohabbat.CustomAdapter();
        lv.setAdapter(cm);
        // Button b1=(Button)findViewById(R.id.btn1);
        // Button b2=(Button)findViewById(R.id.btn2);
                }

    public void btn1(int id) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(android.content.Intent.EXTRA_TEXT, mohabbat[id]);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "Send via"));
    }


    public class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return mohabbat.length;
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
            t1.setText(mohabbat[position]);
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
                    //startActivity(new Intent(mohabbat.this, share_pic.class));
                    setContentView(R.layout.activity_share_pic);
                    ActionBar ab = getSupportActionBar();
                    ab.hide();
                    TextView t3 = (TextView) findViewById(R.id.text);
                    t3.setText(mohabbat[position]);

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
