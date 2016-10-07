package com.anubhi.ck1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MapActivity extends AppCompatActivity {
//Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        TouchImageView img = new TouchImageView(this);
        img.setImageResource(R.drawable.map);
        img.setMaxZoom(4f);
        setContentView(img);
    }
    public void goBack(View v)
    {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
