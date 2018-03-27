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

public class dosti extends AppCompatActivity {

    String dosti[]={"Maine socha ham bhi kar le dosti, Dost hi nahi mila waisa to kya kare dosti.\n" +
            "\n" +
            "Pee Lete Hain Dost Ki Jhooti Bottle Ka Paani…. Dosti Mazhab Ki Mohtaaj Nhi Hoti.. #FriendsForLife\n" +
            "\n" +
            "Waqt ki Yaari to Har Koi Karta Hai,,,Maza to Tab aata hai,, Jab Waqt Badal Jaaye Magar Yaar na Badle.\n" +
            "\n" +
            "Short line :Jab Ap Apni reputation Khone Ke Dar Se Dost Ka Sath ya Dosti Tod Dete Ho To Ap kabhi Ache Dost Nahi Ban Sakte.\n" +
            "\n" +
            "Real? love to vo tha jab mere friend ne mujhe hug kar ke kaha daulat h shohrat h aur izzat? bhi h but tere bina ye sab bekar? hai.","KucH FRIEND SIRF\n" +
            "FRIEND NaHI HoTe…!!\n" +
            "FAMILY HoTe He..!!!","\n" +
            "Hum dosti dikhane ke liye nahi nibhane ke liye karte hai…\n" +
            "\n" +
            "Woh glass hi kya jisme drink chhoot jaye.?\n" +
            "Aur woh “yaari” hi kya jo ek ladki ki wajah se tut jaye..","Dosti Buri Ho Ya Achhi..!!\n" +
            "Par Honi ChaHiye Sachhi..!!\n","Aap jahan bhi jao log aapka exploit karenge sabse jyada exploitation toh dosti ke naam pe hote haibut I’m serious\n" +
            "\n" +
            "Sab pe bhari he hmari yari, tabhi to no.1 khitab pe hmari hi bari he.\n","Ab to raha hi nahi yaqeen kuch pyaar me,\n" +
            "Ae dost, Jab se tuj sa koi paa liya he!!","Gaadi maang kar le jane wale dost petrol dalwaye ya na dalwaye, lekin gyan jarur dekar jayenge:-Bhai Gaadi Service maang rahi hai.","Jahan mohabbat dhoka deti hai\n" +
            "Wahan dosti sahara banti hai…","Jab Dost Tarakki Kare To Fakhar Se Kaho ki Wo Mera Dost Hai…..\n" +
            "Aur Jab Dost Musibat Me Ho To Fakhar Se Kaho Ki Mai Us Ka Dost Hu.","\n" +
            "Jab ladki POPAT bana kar jaaye to dost hi kaam aate hai…","Jinke boyfriend/girlfriend nahi hote hai unke BEST FRIENDS hi unke jaanu hote hai…","Ek sacha dost hi apko ye 2 baatein bataega:\n" +
            "1. Anda non-veg nahi hota\n" +
            "2. Beer daaru nahi hoti..","\n" +
            "Kis tarah se teri dosti ki kahani bayan karu\n" +
            "E-dost Tune har mod pe Ek nya zakham Diya hai mujhey..","\n" +
            "Kuch friends to itne ache hote hai,\n" +
            "Jab tak unko gaali na do tab tak msgs ka reply nai krte.","Dost dil ki har baat samajh jaya karte h,\n" +
            "Dukh sukh k har pal mein sath hua karte h\n" +
            "Dost toh mila karte hain taqdeer walo ko,\n" +
            "Mile aisi taqdeer har bar hume dua karte h…","Kal raat maut aayi thi\n" +
            "Gusse mein boli\n" +
            "“Jaan le lungi teri”\n" +
            "Me ne bhi haste huwe keh diya,\n" +
            "Jism le jaao , jaan toh meri doston ke paas hai…","Ae dost zindagi bhar mujhse dosti nibhaana,\n" +
            "dil ki koi bhi baat humse kabhi na chupaana,\n" +
            "sath chalna mere tum dukh sukh mein\n" +
            "bhatak jau mein jo kabhi sahi raasta dikhlaana.","Phool hai gulab ka toda nahi jata….\n" +
            "Phool hai gulab ka toda nahi jata….\n" +
            "Aap jaise dosto ko chooda nahi jata.","Kabhi kabhi mere dost kehte hai\n" +
            "Ki dost aisa ho to dushman kise chahiye\n" +
            "Main kehta hoon\n" +
            "Ek hee hona chahiye\n" +
            "Jo dono role achhe se perform kare.","\n" +
            "Ladte h dosto se par jeetna nhi chahte.\n" +
            "Dosto se kabi bichdna nhi chahte.\n" +
            "Haqiqt h ki juda karegi jindgi 1din\n" +
            "Pr haqiqat me hum wo din dekhna nhi chahte.","School Ki Dosti 10th Tak\n" +
            "College Ki Dosti University Tak\n" +
            "University Ki Dosti Office Tak\n" +
            "Office Ki Dosti Love Tak\n" +
            "Lover Ki Dosti Shadi Tak\n" +
            "Humari Apse Dosti 30th February Tak.","Bachpan se 2 hi Cheeze# sabse jyada mili hai,\n" +
            "Dard aur Dost# fark sirf itna hai,\n" +
            "Ki Dard mujhe hasne nahi deta#\n" +
            "aur\n" +
            "DOST Mujhe rone nahi dete..!!","Dost OR lover me bahut bada fark hai ?\n" +
            "“Lover” Kehta hai agar tume\n" +
            "kuch ho gaya toh me jee nai paunga\n" +
            "Jabki”Dost” kehta hai Pagal mere\n" +
            "hote huye tujhe Kuch nai ho Sakta.","\n" +
            "Aap se door ho kar hum jayenge kaha,\n" +
            "Aap jaisa dost ham payenge kaha,\n" +
            "Dil ko kaise bhi sambhal lenge,\n" +
            "Par aankho ke aansu hum chupayege kaha.","Dost vo insaan hai jiske pass problam leke jao ;\n" +
            "To problem solve ho ya na ho,\n" +
            "par jitni der saath raho problem jarur bhula dete h."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosti);
        ActionBar ab=getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#C19A6B")));
        ListView lv = (ListView) findViewById(R.id.lv);
        dosti.CustomAdapter cm = new dosti.CustomAdapter();
        lv.setAdapter(cm);
        // Button b1=(Button)findViewById(R.id.btn1);
        // Button b2=(Button)findViewById(R.id.btn2);
    }

    public void btn1(int id) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(android.content.Intent.EXTRA_TEXT, dosti[id]);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "Send via"));
    }


    public class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return dosti.length;
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
            t1.setText(dosti[position]);
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
                    //startActivity(new Intent(dosti.this, share_pic.class));
                    setContentView(R.layout.activity_share_pic);
                    ActionBar ab = getSupportActionBar();
                    ab.hide();
                    TextView t3 = (TextView) findViewById(R.id.text);
                    t3.setText(dosti[position]);

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

