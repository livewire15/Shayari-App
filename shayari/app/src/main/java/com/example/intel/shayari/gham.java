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

public class gham extends AppCompatActivity {

    String gham[]={"Ek rishta jo muh bola tha\n" +
            "Uska bhee tumne tiraskaar kiya\n" +
            "Chhod kar dur chale gaye……\n" +
            "Ye kaisa tumhaara pyaar hua…..\n" +
            "\n","Saari umar poojte rahe log,\n" +
            "Apne haath se banaye hue Khuda ko,\n" +
            "Humne Khuda ke haath se bane insaan ko chaha,\n" +
            "Toh gunehgaar ho gaye.","Na Chand Apna Tha Aur Na Tu Apna Tha,\n" +
            "Kaashh Dil Bhi Maan Leta Ki Sab Sapna Tha..!!","Mujhe neend ki ijaazat bhi unki yaadon se leni padti hai,\n" +
            "Jo khud aaraam se soye hain mujhe karwaton mein chhod kar.","Jab tum sath the toh gham bhi has ke seh lete the hum,\n" +
            "Ab jo nhi ho sath toh khushiyan bhi sahi nhi jaa rahi hain.","Dekh ke teree aankhon mein , pal pal jiya hu mein.\n" +
            "Tujhe dekh kisee ke baahon me, har pal mara hu main.\n" +
            "Saath tera jab tak tha, jindagee se wafa main karata tha.\n" +
            "Ab saath nahee jab tera , main wafa maut se karata hoon.","Socha na tha vo shakhs bhee itana jaldee saath chhod jaega, ❣\n" +
            "Jo mujhe udaas dekhakar kehta tha “main hoo na”.","Mat raho door hamase itna ke apne faisle par afsos ho jaaye…\n" +
            "Kal ko shaayad aisee mulaakaat ho hamaaree…\n" +
            "Ke aap hamase lipatakar roye aur ham khaamosh ho jaaye..","Ek din meree aankhon ne bhee thak kar mujhse keh diya,\n" +
            "Khwaab wo dekha karo jo poore ho, roj-roj hamase bhee roya nahee jaata..!!","Waqt badalne se utni takleef nahi hoti,\n" +
            "Jitni kisi apne ke badal jaane se hoti hai.","Aksar jinki hansi khooburat hoti hai,\n" +
            "\n" +
            "Unke zakhm bhi kafi gehre hote hain.","Tere bina tanha ham rehne lage hain,\n" +
            "Dard ke toophano ko sehne lage hain,\n" +
            "Badal gayi hai isakadar meri jindagee,\n" +
            "Ashk banakar palakon se behne lage hain!\n" +
            "~•i miss you~.","Ashq wo bhi girane lage hain,\n" +
            "Paigam unke bhi aane lage hain,\n" +
            "Kareeb aaye bhi wo to aaye us waqt,\n" +
            "Jab unhe laga hum unke bina muskurane lage hai.","Kis Pal Tum Ko Yaad Na Kiya Humne,\n" +
            "Mere Rom Rom Se Puch,\n" +
            "Maine Apne Aap Ko Kahan Nahi Jalaya Mom-Mom Se Puch,\n" +
            "Tujhse Ruth Jane Ke Baad Khud Ko Kahan Nahi Jalaya Yeh Mujhse Puch.","Manzilein Bhi Uski Thi Rasta Bhi Uska Tha,\n" +
            "Main Akela Tha Aur Qafila Bhi Uska Tha,\n" +
            "Sath-Sath Chalne Ki Soch Bhi Uski Thi,\n" +
            "Fir Rasta Badal Lene Ka Faisla Bhi Uska Tha,\n" +
            "Aaj kyun akela hoon Dil sawal karta hai,\n" +
            "Log to uske the Kya KHUDA bhi uska tha ?\n" +
            "\n","Taqdeer ne jaisa chaha dhal gaye hum,\n" +
            "Bahut sambhal ke chale fir Bhi fisal gaye hum,\n" +
            "Hum to kisiko bhula na sake,\n" +
            "Fir Bhi sabko laga ki badal gaye hum."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gham);
        ActionBar ab=getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C19A6B")));
        ListView lv = (ListView) findViewById(R.id.lv);
        gham.CustomAdapter cm = new gham.CustomAdapter();
        lv.setAdapter(cm);
        // Button b1=(Button)findViewById(R.id.btn1);
        // Button b2=(Button)findViewById(R.id.btn2);
    }

    public void btn1(int id) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(android.content.Intent.EXTRA_TEXT, gham[id]);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "Send via"));
    }


    public class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return gham.length;
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
            t1.setText(gham[position]);
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
                    //startActivity(new Intent(gham.this, share_pic.class));
                    setContentView(R.layout.activity_share_pic);
                    ActionBar ab = getSupportActionBar();
                    ab.hide();
                    TextView t3 = (TextView) findViewById(R.id.text);
                    t3.setText(gham[position]);

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
