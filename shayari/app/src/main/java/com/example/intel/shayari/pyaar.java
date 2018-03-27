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

public class pyaar extends AppCompatActivity {

    String pyaar[]={"Teri aankhon se pyar karu,\n" +
            "Teri baaton se pyar karu..\n" +
            "\n" +
            "Teri mohabbat me doob,\n" +
            "Tujh pyar mein subha shaam karu.\n" +
            "\n" +
            "Tum rahe na pao humare bina,\n" +
            "Is trha toot kar tujh mein pyar karu.","De do apna hath hatho mein hamare,\n" +
            "Rahna hai dil ko sath tumhare,\n" +
            "Yu hi nhi rahte khoye hue ham\n" +
            "Hame aate hai har pal khyal tumhare.","Batani hai tumhe aaj chahat hamari,\n" +
            "Jatani hai tumhe dil ki khwahish hamari,\n" +
            "Or kuch nhi hai dil mein hamare\n" +
            "Bas hai tasveer tumhari.","Meri Zindagi ki manzil ban gaye ho tum,\n" +
            "Mere hothon ki khushi ban gaye ho tum,\n" +
            "Jeene ke liye ab bas jarurt hai tumhari\n" +
            "Kyoki mere Mohabbat meri jaan ban gaye ho tum.","Chahat hai…Pyar jee bhar ke karne do,\n" +
            "Apni mohabbat ka izhaar jee bhar kar karne do,\n" +
            "Utha ke dekho nazarin hamari taraf\n" +
            "Thoda hame tumhara deedar karne do.","Kara hai tujh se pyar,\n" +
            "Bas teri mohabbat ke liye bekarar hai hum,\n" +
            "Ager lagta hai tumhe mohabbat hai gunha\n" +
            "To ha gunehgaar hai hum.","Jee bhar ke deedar karne do jara,\n" +
            "Kar ke mehsus pyar ka izhar karne do jara,\n" +
            "Kitni chahat hai dil mein hamare\n" +
            "Aaj hame aitbaar karne do jara.","Dil mein basa ke rakhenge tum ko,\n" +
            "Apne seene se laga ke rakhenge tum ko,\n" +
            "Tum qubool kar ke to dekho mohabbat hamari\n" +
            "Jaan se jada apna bana ke rakhenge tumko.","Har pal khayaal bas aata hai tumhara,\n" +
            "Dekh ke tumhe dil diwana ho jata hai hamara,\n" +
            "Kuch itna asar hai mohabbat ka teri mujh per\n" +
            "Ki baato baato mein hothon pe naam aa jata hai tumhara.","Ajnbi rhena pr kisi ka intejar mt krna\n" +
            "kisi k pyar k liye khud ko bekrar mt krna\n" +
            "acha sathi mil jaye to hath tham lena\n" +
            "pr dikhave k liye kisise pyar mt krna\n" +
            "\n","Tujhe paane ki Chahat baar baar karta hu\n" +
            "Pyar se bhi zayada tujhe Pyar karta hu\n" +
            "Sach kahta hu, Tujhe Pyar Main had se Jada karta hu\n" +
            "\n","Anjaan ek saathi ka iss dil ko intejar hain,\n" +
            "Pyasa hain ye aankhen aur dil bekarar hain,\n" +
            "Unke saath mil jaye to har raah aasan ho jayegi\n" +
            "Shayad issi anokhey ehsaas ka naam pyaar hai.","Jb kisi k sapne kisi k arman ban jaye\n" +
            "Jb kisi ki hasi kisi ki muskan ban jaye\n" +
            "Pyar kehtey hain ussey\n" +
            "Jb kisi ki saanse kisi ki jaan ban jaye.","Kbhi alfaaz bhul jau kabhi khayal bhul jaau\n" +
            "Tujhe es kadar chahu k apni saans bhul jau\n" +
            "Uth kar tere paas se jo main chal doon,\n" +
            "Toh jaate huye khud ko tere paas bhul jaau","Saath agar doge toh muskrayenge zarur,\n" +
            "Pyar agar dil se karoge to nibhayenge zarur\n" +
            "Raah me kitne bhi kante kyu na ho,\n" +
            "Awaz agar dil se doge to aayenge zarur.","Do baatein unse ki to dil ka dard kho gaya,\n" +
            "Logo ne hmse pucha aaj tumhe kya ho gya\n" +
            "Hum bekrar aankho se sirf has paaye\n" +
            "Ye bhi na keh paye ki hume pyar ho gaya.","Ye wo gunah hai jo hum baar-baar karte hain,\n" +
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
            "Mujhe kabhi seene se laga kar dekhna.♡","Jab khamosh aankho se baat hoti hai.\n" +
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
            "Shayad is liye mera pyaar mazak ban ke reh gaya."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyaar);
        ActionBar ab=getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C19A6B")));
        ListView lv = (ListView) findViewById(R.id.lv);
        pyaar.CustomAdapter cm = new pyaar.CustomAdapter();
        lv.setAdapter(cm);
        // Button b1=(Button)findViewById(R.id.btn1);
        // Button b2=(Button)findViewById(R.id.btn2);
    }

    public void btn1(int id) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(android.content.Intent.EXTRA_TEXT, pyaar[id]);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "Send via"));
    }


    public class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return pyaar.length;
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
            t1.setText(pyaar[position]);
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
                    //startActivity(new Intent(pyaar.this, share_pic.class));
                    setContentView(R.layout.activity_share_pic);
                    ActionBar ab = getSupportActionBar();
                    ab.hide();
                    TextView t3 = (TextView) findViewById(R.id.text);
                    t3.setText(pyaar[position]);

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
