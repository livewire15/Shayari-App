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

public class birthday extends AppCompatActivity {

    String birthday[]={"Aap wo phool ho jo gulshan mein nahin khilte,\n" +
            "Par jis pe aasmaan ke farishte bhi fakr hai karte,\n" +
            "Aap ki zindagi hadd se zyada kimti hain,\n" +
            "Janam din aap hamesha mnaye yu hi hanste hanste.\n" +
            "Janamdin Mubarak","Janm Din Ke Yeh Khaas Lamhe Mubarak,\n" +
            "Aankho Mein Base Naye Khwab Mubarak,\n" +
            "Zindgi Jo Lekar Aayi Hai Aapke Liye Aaj..\n" +
            "Woh Tamaam Khushiyo Ki Haseen Saugat Mubarak.\n" +
            "Happy Birthday!","Thofa Mai Tujhe Aaj Mera Dil Hi Deta Hu,\n" +
            "Yeh Hasin Mauka Gawana Nahi Chata Hu,\n" +
            "Apne Dil Ki Baat Tumhare Samne Batlata Hu,\n" +
            "Aur Tumhare Janam Din Ki Shubh Kamnae Deta Hu.\n" +
            "HAPPY BIRTHDAY","Main likh du tumhari umar chand sitaaro se,\n" +
            "Janamdin manau main phoolo se baharo se,\n" +
            "Har ek khoobsurti duniya se main lekar aau,\n" +
            "Mehfil ye sajaau main har haseen najaro se.\n" +
            "\n" +
            "Happy Birthday My Dear","Life का हर Goal रहे आपका Clear,\n" +
            "तुम Success पाओ Without any Fear\n" +
            "हर पल जियो Without any Tear,\n" +
            "Enjoy your day my Dear,\n" +
            "HAPPY BIRTHDAY","On these Beautiful Birthday,\n" +
            "भगवान करे आप Enjoyment से\n" +
            "भरपूर और Smile से अपना आज\n" +
            "का दिन Celebrate करो, और\n" +
            "बहुत सारी Surprises पाओ,,,\n" +
            "HAPPY BIRTHDAY","Har disha jine ki ek nayi aas de apko,\u2028Har lamha har pal kuch khaas de apko,\n" +
            "Ugta huya suraj\uD83C\uDF1E, khiltaa huya phoool\uD83C\uDF37\u2028Har din taazgi bhara ehsaas de apko\n" +
            "Zindagi me kabi koi chiz ki kami na ho,\u2028Jo maango rab se wo sab kuch de apko\n" +
            "Wish u a very Happy Birthday","Tohfa-e-dil de doon ya de doon chand taare,\n" +
            "Janam din pe tujhe kya du ye puche mujhse saare,\n" +
            "Zindagi tere naam kar doon toh bhi kam hain,\n" +
            "Daman me bhar du har pal khushiya main tumhare.\n" +
            "\n" +
            "Wish u a very Happy Birthday","Main likh du tumhari umar chand sitaaro se,\n" +
            "Janamdin manau main phoolo se baharo se,\n" +
            "Har ek khoobsurti duniya se main lekar aau,\n" +
            "Mehfil ye sajaun main har haseen najaro se.\n" +
            "\n" +
            "Happy Birthday My Dear","Birthday ki toh party honi chahiye,\n" +
            "wish to morning ki bhi hoti hai.","Tohfa-e-dil de doon ya de doon chand taare,\n" +
            "Janam din pe tuje kya du ye puche mujhse saare\n" +
            "Zindagi tere naam kar doon toh bhi kam hain,\n" +
            "Daman me bhar du har pal khushiya me tumhare","Main likh du tumhari umar chand sitaaro se,\n" +
            "Janamdin manau main phoolo se baharo se\n" +
            "Har ek khoobsurti duniya se main lekar aau,\n" +
            "Mehfil ye sajaau main har haseen najaro se","Zaroor tumko kisine dil se pukara hoga,\n" +
            "Ek baar to chand ne bhi tumko nihara hoga,\n" +
            "Mayus hue honge sitare bhi us din,\n" +
            "Khuda ne jab Zamin par tumko utara hoga.\n" +
            "Janmadin Mubarak!","Har lamha apke hothon pe muskan rahe,\n" +
            "Har ghum se aap anjaan rahen,\n" +
            "Jiske sath mehak uthe aapki zindgi,\n" +
            "Hamsha aapke pass woh insan rahe.\n" +
            "Happy Birthday","Har raah aasan ho,\n" +
            "Har raah pe khushiya ho,\n" +
            "Har din khubsoorat ho,\n" +
            "Aisa hi poora jivan ho,\n" +
            "Yahi har din meri dua ho,\n" +
            "Aisa hi tumhara har janamdin ho!!!","Ae Khuda Mere Yaar Ka Daman Khusiyon Se Saza De,\n" +
            "Uske Janamdin Par Usi Ki Koi Raza De,\n" +
            "Dar Par Tere Aunga Har Saal,\n" +
            "Ki Usko Gile Ki Na Koi Wajah De","Tamnnaon se bhari ho jindgi,\n" +
            "Kwahisho se bhara ho har pal,\n" +
            "Daaman bhi chhota lagne lage,\n" +
            "Itani khushiya de aapko aane wala kal!!\n" +
            "Happy Birth Day","Dua hai Ki Kamyabi ke har sikhar per aap ka naam hoga,\n" +
            "Aapke har kadam per duniya ka salaam hoga,\n" +
            "Himmat se mushkilon ka saamna karna,\n" +
            "Hamari dua hai ki waqt bhi ek din aapka gulam hoga.","Dur hai to kya hoa aaj ka din to hame yaad hai,\n" +
            "Tum na sahi par tumhara saya to hamare sath hai,\n" +
            "Tumhe lagta hai hum sab bhul jate hai\n" +
            "Par dekhlo tumhara janamdin to hame yaad hai."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
        ActionBar ab = getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C19A6B")));
        ListView lv = (ListView) findViewById(R.id.lv);
        birthday.CustomAdapter cm = new birthday.CustomAdapter();
        lv.setAdapter(cm);
        // Button b1=(Button)findViewById(R.id.btn1);
        // Button b2=(Button)findViewById(R.id.btn2);
    }

    public void btn1(int id) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(android.content.Intent.EXTRA_TEXT, birthday[id]);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "Send via"));
    }


    public class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return birthday.length;
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
            t1.setText(birthday[position]);
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
                    //startActivity(new Intent(birthday.this, share_pic.class));
                    setContentView(R.layout.activity_share_pic);
                    ActionBar ab = getSupportActionBar();
                    ab.hide();
                    TextView t3 = (TextView) findViewById(R.id.text);
                    t3.setText(birthday[position]);

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