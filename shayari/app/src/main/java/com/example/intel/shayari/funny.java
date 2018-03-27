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

public class funny extends AppCompatActivity {

    String funny[]={"Julfo me fulo ko saja kar aayi hai,\n" +
            "chehre se dupatta utha kar aayi hai,\n" +
            "kisi ne pucha ki kitni khubsurat lag rahi hai,\n" +
            "Hamne kaha sawad aaj naha kar aayi hai!","\n" +
            "Nakhre aap ke toba-toba,\n" +
            "gajab aapka style hai,\n" +
            "message to aap kabhi karte nahi,\n" +
            "bas halla macha rakha hai ki..\n" +
            "hamare pass bhi mobile hai!!","\n" +
            "Manzil unhi ko milti hai,\n" +
            "jinke hoslo me jaan hoti hai,\n" +
            "aur band bhatti me bhi daaru unhi ko milti hai..\n" +
            "jinki bhatti me pehchaan hoi hai.","Sitam dhane ki had hoti hai,\n" +
            "pas na ane ki roth jane ki hadh hoti hai..\n" +
            "Ek SMS to kar de Zalim,\n" +
            "Paise bachane ki bhi hadh hoti hai..","Kya hua jo usne racha li mehndi,\n" +
            "Hamm bhi ab to sehra sajayenge,\n" +
            "Mujhe pata tha wo apne naseeb main nahi hai,\n" +
            "Ab uski chotti bahen ko fasayenge.","Sharab Sareer Ko Khatam Krti Hai\n" +
            "Sharab Samaj Ko Khatam Krti Hai,\n" +
            "Aao Aaj Is Sharab Ko Khatam Krte Hain,\n" +
            "Ek Bottle Tum Khtam Kro, Ek Bottle Hum Khatam Krte Hai..","Hum dil fek aashiq har kam me kamal kar de.\n" +
            "Jo wada kare use pura har haal me kar de.\n" +
            "Tujhe lipistik lagane ki kya jarurat,\n" +
            "hum hot chum-chum ke lal kar de.","Umar ki raah mein JAZBAAT badal jate hai,\n" +
            "Waqt ki AAndhi me HALLAT badal jaate hai,\n" +
            "Sochta hoon kaam kar kar ke Record tod dun,\n" +
            "Lekin kambhakt salary dekhte he KHAYAAL badal jaate hai..","Bindas muskurao kya gam hai,\n" +
            "Zindgi me tension kisko kam hai,\n" +
            "Yaad karne wale to bahut hai aapko,\n" +
            "Dil se ‘TANG’ karne wale to sirf HUM hai.\n" +
            "Arz hai..","Pink lips are the girls beauty,\n" +
            "Wah Wah\n" +
            "Pink lips are the girls beauty,\n" +
            "Wah Wah\n" +
            "And Kissing them is the Boys duty..","\n" +
            "Chali jati hain wo beauty parlour mein yun,\n" +
            "Unka maksad hain misaal-e-hoor ho jana..\n" +
            "Ab kon samjhaye en ladkiyo (girls) ko\n" +
            "Mumkin nahi kishmish ka fir se angur ho jana. ??","eh jo ladkiyon (girls) ke baal hote hai,\n" +
            "ladkon ko fasane ka jaal hote hai.\n" +
            "Khoon choos keti hai ladkon ka saara,\n" +
            "tabhi to inke honth laal hote hai!\n" +
            "Kasam Se Har Ek Ladki (girl) Bhula Dunga,\n" +
            "Sab hi Ki Tasverain Jala DunGa,\n" +
            "Ek Tum hi Raho Ge Iss Dil Me !\n" +
            "Balance Dalwa Do Bhout Dua Dunga.\n" +
            "Pyar karne ki apni 1 reet hai..\n" +
            "Pyaar ka dusra naam hi to Preet hai…\n" +
            "Isliye Try maro har Ladki (girl) par..\n" +
            ".\n" +
            "Kyunki\n" +
            ".\n" +
            "Darr ke aage Jeet hai.","Na ishq kar mare yaar yeh ladkiya (girls) bahut satati hai,\n" +
            "na karna in par aitbaar yah kharcha bahut karwati hai,\n" +
            "recharge tum karwa ke dete ho aur number mera lagati hai..","Ajib hai nakhre tere,\n" +
            "Ajib hai tera style.\n" +
            "Naak pochhne ki tameez nahin aur haath mein hai mobile!","Cham Cham kar ke aayi,\n" +
            "Cham Cham kar ke chali gayi,\n" +
            "Main Sindoor leke khada raha,\n" +
            "Aur woh rakhi ban ke chali gayi.\n" +
            "Tumhari Saalgirah Pe Jaana Kia Bhejoon,\n" +
            "Apni Jaan Bhejoon Keh Apna Dil Bhejoon,\n" +
            "Phir Soochta Hoon Jaana Kion Na,\n" +
            "Tumhare Liye Kee Hui Shopping Ka Bill Bhejoon. ","tna khubsurat kaise muskura lete ho,\n" +
            "Itna qatil kaise sharma lete ho,\n" +
            "Kitni aasani se jaan le lete ho,\n" +
            "Kisi ne sikhaya hai.. ya bachpan se hi kamine ho? ","\n" +
            "Dhadkan Dil Ki Ruk Jati Hai,\n" +
            "Sanse Aksar Tham Jati Hai,\n" +
            "Bahut Buri Halat Hoti Hai Yaaro,\n" +
            "Jab GF Se Shaadi Karne Ki Naubat Aati Hai! "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funny);
        ActionBar ab=getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C19A6B")));
        ListView lv = (ListView) findViewById(R.id.lv);
        funny.CustomAdapter cm = new funny.CustomAdapter();
        lv.setAdapter(cm);
        // Button b1=(Button)findViewById(R.id.btn1);
        // Button b2=(Button)findViewById(R.id.btn2);
    }

    public void btn1(int id) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(android.content.Intent.EXTRA_TEXT, funny[id]);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "Send via"));
    }


    public class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return funny.length;
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
            t1.setText(funny[position]);
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
                    //startActivity(new Intent(funny.this, share_pic.class));
                    setContentView(R.layout.activity_share_pic);
                    ActionBar ab = getSupportActionBar();
                    ab.hide();
                    TextView t3 = (TextView) findViewById(R.id.text);
                    t3.setText(funny[position]);

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
