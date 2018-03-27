package com.example.intel.shayari;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.os.Environment;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class share_pic extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_pic);
        android.app.ActionBar ab = getActionBar();
        ab.hide();
           /* Button share=(Button)findViewById(R.id.share);
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
        View rootView = findViewById(android.R.id.content).getRootView();
        rootView.setDrawingCacheEnabled(true);
        return rootView.getDrawingCache();
    }*/
    }
}
