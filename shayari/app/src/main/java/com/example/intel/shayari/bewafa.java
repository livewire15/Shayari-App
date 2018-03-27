package com.example.intel.shayari;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bewafa extends AppCompatActivity {

    String bewafa[] = {"Pyaar karne ka hunar hamein nahi aata,\n" +
            "Isliye pyaar ki baazi hum haar gaye,\n" +
            "Hamari zindagi se unhe bahot pyaar tha,\n" +
            "Shayad isiliye wo hamein zinda hi maar gaye..", "Aaj hum unhe bewafa bata kar aaye hai,\n" +
            "Unke khaton ko pani mein bahakar aaye hai,\n" +
            "Koi nikal kar paadh na le unhe,\n" +
            "Isliye pani mein bhi aag lagake aaye hai.", "Woh bewafa hamara imtihaan kya legi,\n" +
            "Milengi nazron se nazar toh nazar jhuka legi,\n" +
            "Use meri kabar p diya jalane ko math kehna,\n" +
            "Woh nadaan hain doston apna haath jala legi!", "Meri barbadi par tu koi malal na karna,\n" +
            "bhul jana mera khyal na karna,\n" +
            "hum teri khusi k liye kafan odh lenge,\n" +
            "pr tu meri laash se koi sawal na karna.","Kisee aur ki baahon mein rehkar,\n" +
            "Woh hamse wafa kee baat karte hain..\n" +
            "Ye kaisee chaahat he yaaron…?\n" +
            "Wo bewafa hain jaanakar bhee ham unhi se hee pyaar karte hain..\n" +
            "\n","Bichhad ke tumse tumhe bewafa to keh diya maine,\n" +
            "Hakiqat to ye hai ke har aaine me hum bus khud hi ko gunahgaar pate hai.\n" +
            "\n","Naseeb mera kyu mujhse khafa ho jata hai,\n" +
            "Apna jisko bhi mano bewafa ho jata hai,\n" +
            "Kyu na ho shikayat meri nazro ko raat se,\n" +
            "khwab pura hota nhi or sawera ho jata hai.","Bhale Door Tum Raho Hum Zinda Reh Lenge,\n" +
            "Dukh Zindagi Ke Sare Hum Seh Lenge,\n" +
            "Tum Khush Raho Geron Ke Sang,\n" +
            "Hum Khud Ko Bewafa Keh Lenge.","Apno ne Zehar ka jaam de diya,\n" +
            "Gairon ne Bewafa naam de diya,\n" +
            "Wo jo kehte the bhul na jana hume,\n" +
            "Aaj unhone hi bhari MEHFIL me ANJAAN keh diya..","Kash aisi mohabbat hoti meri,\n" +
            "Jis mohobbat mai tanhai na hoti,\n" +
            "Lakhon ki bheed hoti par kisi ki parchain na hoti,\n" +
            "Sath wo bhi deti mera zindagi bhar,\n" +
            "Agar uske dil me bewafai na hoti.","Humein aapki yaad na aaye to hum bewafa,\n" +
            "Aap humein bulaein aur hum na aaye to hum bewafa,\n" +
            "Humein zeher dene ki kya zarurat hai,\n" +
            "Aap chehra modh le aur hum na marein to hum bewafa.","Gehrayi Pyaar Mai Ho To Bewafai Nahi Hoti,\n" +
            "Sache Pyaar Mai Kabhi Tanhai Nahi Hoti,\n" +
            "Pyaar Zara Sambhal Ke Karna,\n" +
            "Pyaar Ke Zakhm Ki Koyi Dawai Nahi Hoti..!!","Teri bewafai ka kissa jab jab yaad aayega,\n" +
            "Mere tan badan mein ek aag si bharkayega,\n" +
            "Jo tune kiya koi dushman bhi nahi aisa karta,\n" +
            "Dekh lena ek din tu bhi bohat pachtaayega.","Haseeno ne haseen bankar gunaah kiya,\n" +
            "Auron ko to kya humko bhi tabaah kiya,\n" +
            "Pesh kiya jab gazalon mein humne unki bewafai ko,\n" +
            "Auron ne to kya unhone bhi waah-waah kiya.","Ek Bewafa Se Ek Mulaqat Bohat Hai,\n" +
            "Jitna Diya Humne Tera Saath Bohat Hai…\n" +
            "\n" +
            "Duniya Ko Dil Ke Daag Dikhaun To Kis Tarah,\n" +
            "Aye Zindagi Yeh Raaz Chupaon To Kis Tarah…\n" +
            "\n" +
            "Apni Tabahiyon Me Mera Haath Bohat Hai,\n" +
            "Jitna Bhi Diya Humne Tera Saath Bohat Hai…\n" +
            "\n" +
            "Toota Jo Dil Ka Aaina Toote Sabhi Bharam,\n" +
            "Hoti Hai Umar Pyaar Ki Jeene Ke Liye Kam…\n" +
            "\n" +
            "Marne Ke Liye Dard Ki Raat Bohat Hai,\n" +
            "Jitna Bhi Diya Humne Tera Saath Bohat Hai….\n" +
            "\n" +
            "Ek Bewafa Se Ek Mulaqat Bohat Hai,\n" +
            "Jitna Bhi Diya Humne Tera Saath Bohat Hai….!!","Mausam ki misaal dun ya tumhari,\n" +
            "Koi puch betha hai badalna kisko kehte hain.\n" +
            "\n" +
            "Mat puchh kaise guzar rahi hai zindagi,\n" +
            "Us daur se guzar rahi hu jo guzarta hi nahi.\n" +
            "\n" +
            "Hum na pa sake tuje muddato se chahne ke baad aur,\n" +
            "Kisi ne apna bana liya tuje chand rasmein nibhane ke baad.","Kaisi ajeeb ye tujhse Judai thi,\n" +
            "Ki tujhe alvida bhi na keh saka,\n" +
            "Teri saadgi mai itna fareb tha,\n" +
            "Ki tujhe bewafa bhi na keh sake.","Hum kitne bewafa hain,\n" +
            "Ek dum unke dil se nikal gaye….\n" +
            "\n" +
            "Unme kitni wafa thi,\n" +
            "Aaj tak hamare dil se nahi nikle…","Phir Kab Milenge Yeh Unhone Pucha Nahi,\n" +
            "Kyu Ho Rahe Hain Juda Yeh Humne Bataya Nahi,\n" +
            "Kab Unke Aansuo Ne Humko Bewafa Kaha,\n" +
            "Pata Hi Nahi Bus Woh Waqt Hi Kuch Aisa Tha,\n" +
            "Jisko Humne Pehchana Nahi.","Humne Apni Sanso Par Unka Naam Likh Liya,\n" +
            "Nahi Jante The Ki Humne Kuch Galat Kiya,\n" +
            "Wo Pyaar Ka Wada Humse Karke Mukar Gaye,\n" +
            "Khair Unki Bewafai Se Kuch To Sabak Liya.","Bewafa Se Dil Lagane Chale,\n" +
            "Patthar Se Dil Ko Hum Piglane Chale,\n" +
            "Toot Kar Bikhar Gaye Hum Tukdo Main,\n" +
            "Pattharo Ke Shehar Main Kaanch Ka Ashiyana Jo Banane Chale.","Bewafa To Use Kahte Hai Jo Wafa Nahi Karte,\n" +
            "Agar Tumse Pyar Na Hota To Tumhe Bewafa Kaise Kahte,\n" +
            "Fir Bhi Tumne Mere Pyar Ka Aisa Sila Diya Hai,\n" +
            "Ki Tumhe Bewafa Kahna Bhi Bewafai Ki Tauhin Hoti Hai.","Chaha Tha Humne Jise Use Bhulaya Na Gaya,\n" +
            "Zakhm Dil Ke Logo Se Chupaya Na Gaya,\n" +
            "Bewafai Ke Baad Bhi Itna Pyar Karta Hu Ki,\n" +
            "Bewafa Ka Ilzam Bhi Us Par Lagaya Na Gaya.\n" +
            "\n","Kuch iss tarah se meri zindagi ko maine aasaan kar liya,\n" +
            "\n" +
            "Bhulkar teri bewafai, meri tanhai se maine pyar kar liya.\n" +
            "\n","Sanam mera bada dildaar hai,\n" +
            "Use humse bahut pyaar hai,\n" +
            "Kisi aur ki baahon me hokar bhi,\n" +
            "Dil me uske humara naam hai,\n" +
            "Isi ek wajah se iss jahan mein,\n" +
            "Bewafai ke aage wafa badnaam hai.","Kabhi kisi musafir se pyar na karna,\n" +
            "Unka thikana bohat door hota hain.\n" +
            "Woh kabhi bewafa toh nahi hote,\n" +
            "Magar unka jaana jaroor hota hain.","Chaha Tha Humne Jise Use Bhulaya Na Gaya,\n" +
            "Zakhm Dil Ke Logo Se Chupaya Na Gaya,\n" +
            "Bewafai Ke Baad Bhi Itna Pyar Karta Hu Ki,\n" +
            "Bewafa Ka Ilzam Bhi Us Par Lagaya Na Gaya.","Kuch iss tarah se meri zindagi ko maine aasaan kar liya,\n" +
            "\n" +
            "Bhulkar teri bewafai, meri tanhai se maine pyar kar liya.","Sanam mera bada dildaar hai,\n" +
            "Use humse bahut pyaar hai,\n" +
            "Kisi aur ki baahon me hokar bhi,\n" +
            "Dil me uske humara naam hai,\n" +
            "Isi ek wajah se iss jahan mein,\n" +
            "Bewafai ke aage wafa badnaam hai.","Kabhi kisi musafir se pyar na karna,\n" +
            "Unka thikana bohat door hota hain.\n" +
            "Woh kabhi bewafa toh nahi hote,\n" +
            "Magar unka jaana jaroor hota hain.\n" +
            "\n" +
            " ","Woh bewafa humara imtehaan kya legi,\n" +
            "Milegi nazron se nazar to nazar jhuka degi,\n" +
            "Use meri kabr pe dia jalaane ko mat kehna,\n" +
            "Woh nadaan hai, kahin apna haath jala legi.","Dil ke karib hokar wo jab door ho gaye,\n" +
            "Haseen khwab mere choor-choor ho gye,\n" +
            "Hamne wafa Nibhai to ruswaiyan mili,\n" +
            "Wo bewafa hokar bhi mashoor ho gye.\n" +
            "\n","CHOT LAGI DIL PE JAB WO HUMSE KHAFA HUYE,\n" +
            "MEHSOOS TAB HUA JAB WO HUMSE JUDA HUYE,\n" +
            "WAFAA NIBHA KE WO HUME KUCH DE NA SAKE,\n" +
            "PAR BAHUT KUCH DE GYE JAB WO BEWAFA HUYE.","JAAN KAR BHI WOH MUJHE JAAN NA PAAYE,\n" +
            "AAJ TAK WOH MUJHE PEHCHAAN NA PAAYE,\n" +
            "KHUD HI KAR LI BEWAFAI HUMNE,\n" +
            "TAAKI UNPAR KOI ILZAAM NA AAYE.","WOH BEWAFA HUMARA IMTIHAAN KYA LEGI,\n" +
            "MILEGI NAZRON SE NAZAR TO NAZAR JHUKA DEGI,\n" +
            "USE MERI KABAR PE DIYA JALAANE KO MAT KEHNA,\n" +
            "WOH NADAAN HAI KAHIN APNA HAATH JALA LEGI.","USKI ANKHON ME IS KADAR NOOR HAI KI,\n" +
            "\n" +
            "UNKI YAAD ME RONA BHI MANZOOR HAI,\n" +
            "\n" +
            "BEWAFA BHI NHI KEH SAKTE USE KYUKI,\n" +
            "\n" +
            "PYAR HUMNE KIYA WOH TOH BEKASOOR HAI.\n" +
            "\n","BEWAFAI UNHONE KI, SAJA HUME MILI,\n" +
            "PYAR HUMNE KIYA, GUNAH UNSE HUYE,\n" +
            "CHOT USSE LAGI TOH, DARD MUJHE HUA,\n" +
            "GHAAV TO USKE BHAR GYE,\n" +
            "PAR NISSAAN MERE BAAKI REH GYE.","JANE LAGE TERE SHEHER SE TO TUJHE ALVIDA B NA KEH SAKE.\n" +
            "TERI SADHGI ITNI HASEEN THI K TUJHE BEWAFA B NA KEH SAKE.\n" +
            "\n" +
            "KHUSHI MILI HANS NA SAKE.\n" +
            "GHUM MILA RO NA SAKE.","HAAL DEKH KAR MERA KHUDA BHI TADAP JAYEGA….\n" +
            "\n" +
            "JAB BHI HOGI BEWAFAI KI BAAT MUJHE\n" +
            "\n" +
            "BHI KOI BHOOLA YAAD AAYEGA…!!!\n" +
            "\n" +
            "ARE APNO NE KYA KAMI RAKHI JO AB KOI\n" +
            "\n" +
            "ANJAAN SITAM DHAYEGA ….\n" +
            "\n" +
            "MAT CHU IN PALKON KO HAI ITNA DARD\n" +
            "\n" +
            "INME KI TERA DAAMAN BHEEG JAYEGA…!!!:’(","HUME BHI PYAR KARNE KA KHAYAL AYA,\n" +
            "\n" +
            "JAB BHI AAYA KHUD KO TANHA OR AKELA PAYA,\n" +
            "\n" +
            "DHUNDTE RAHE IS DUNIYA ME HUMSAFAR,\n" +
            "\n" +
            "LEKIN KISI KO MAJBUR TO KISI KO BEWAFA PAYA.\n" +
            "\n","DARD HI SAHI MERE ISHQ KA INAAM TO AAYA,\n" +
            "KHAALI HI SAHI HAATHON MEIN JAAM TO AAYA,\n" +
            "MAIN HOON BEWAFA SABKO BATAAYA USNE,\n" +
            "YUN HI SAHI USKE LABON PE MERA NAAM TO AAYA.","ABHI TO VALENTINE KO 1 RAAT HUI HAI,\n" +
            "BEWAFAI NA JANE KIN KIN K SATH HUI HAI,\n" +
            "TUTE HONGE LAKHO K DIL,\n" +
            "TABHI TO AAJ JAMKAR BARSAT HUI HAI.","MAT PUCH MERE SABRA KI INTAHA KAHA TAK HAI.\n" +
            "TU SITAM KAR LE..TERI HASRAT JAHA TK HAI.\n" +
            "WAFA KI UMEED JINHE HOGI UNHE HOGI,\n" +
            "HAME DEKHNA H TU BEWAFA KHA TK HAI.","HOTA H APNI ANKH KA ANSHOO BHI BEWAFAA,\n" +
            "WO NIKLATA H TO KISI AUR K LIYE………\n" +
            "FIR KISI AUR SE KYUN BAFA K ASHA LIYE DHADKTA H YE DIL………….:-(","AAJ HUM UNHE BEWAFA BATAAKAR AAYE HAI\n" +
            "Bewafa Shayari RRathi\n" +
            "AAJ HUM UNHE BEWAFA BATAAKAR AAYE HAI,\n" +
            "UNKE KHATON KO PAANI MEIN BAHAAKAR AAYE HAI,\n" +
            "KOI PADH NA LE UN KHATON KO PAANI SE NIKAAL KE,\n" +
            "ISLIYE PAANI MEIN BHI AAG LAGAAKAR AAYE HAI."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bewafa);
        ActionBar ab = getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C19A6B")));
        ListView lv = (ListView) findViewById(R.id.lv);
        CustomAdapter cm = new CustomAdapter();
        lv.setAdapter(cm);
        // Button b1=(Button)findViewById(R.id.btn1);
        // Button b2=(Button)findViewById(R.id.btn2);
    }

    public void btn1(int id) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(android.content.Intent.EXTRA_TEXT, bewafa[id]);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "Send via"));
    }


    public class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return bewafa.length;
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
            t1.setText(bewafa[position]);
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
                    t3.setText(bewafa[position]);

                    final Button share=(Button)findViewById(R.id.share);
                    share.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            share.setVisibility(v.INVISIBLE);
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
