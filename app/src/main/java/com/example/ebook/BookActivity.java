package com.example.ebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BookActivity extends AppCompatActivity implements View.OnClickListener {
    public ImageView B1;
    public ImageView B2;
    public ImageView B3;
    public ImageView B4;
    public ImageView B5;
    public ImageView B6;
    public ImageView B7;
    public ImageView B8;
    public ImageView B9;
    public ImageView B10;
    public ImageView B11;
    public ImageView B12;
    public ImageView B13;
    public ImageView B14;
    public ImageView B15;
    public ImageView B16;
    public ImageView B17;
    public ImageView B18;
    public ImageView B19;
    public ImageView B20;
    public ImageView B21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        B1 = (ImageView) findViewById(R.id.btnb1);
        B1.setOnClickListener(this);
        B2 = (ImageView) findViewById(R.id.btnb2);
        B2.setOnClickListener(this);
        B3 = (ImageView) findViewById(R.id.btnb3);
        B3.setOnClickListener(this);
        B4 = (ImageView) findViewById(R.id.btnb4);
        B4.setOnClickListener(this);
        B5 = (ImageView) findViewById(R.id.btnb5);
        B5.setOnClickListener(this);
        B6 = (ImageView) findViewById(R.id.btnb6);
        B6.setOnClickListener(this);
        B7 = (ImageView) findViewById(R.id.btnb7);
        B7.setOnClickListener(this);
        B8 = (ImageView) findViewById(R.id.btnb8);
        B8.setOnClickListener(this);
        B9 = (ImageView) findViewById(R.id.btnb9);
        B9.setOnClickListener(this);
        B10 = (ImageView) findViewById(R.id.btnb10);
        B10.setOnClickListener(this);
        B11 = (ImageView) findViewById(R.id.btnb11);
        B11.setOnClickListener(this);
        B12 = (ImageView) findViewById(R.id.btnb12);
        B12.setOnClickListener(this);
        B13 = (ImageView) findViewById(R.id.btnb13);
        B13.setOnClickListener(this);
        B14 = (ImageView) findViewById(R.id.btnb14);
        B14.setOnClickListener(this);
        B15 = (ImageView) findViewById(R.id.btnb15);
        B15.setOnClickListener(this);
        B16 = (ImageView) findViewById(R.id.btnb16);
        B16.setOnClickListener(this);
        B17 = (ImageView) findViewById(R.id.btnb17);
        B17.setOnClickListener(this);
        B18 = (ImageView) findViewById(R.id.btnb18);
        B18.setOnClickListener(this);
        B19 = (ImageView) findViewById(R.id.btnb19);
        B19.setOnClickListener(this);
        B20 = (ImageView) findViewById(R.id.btnb20);
        B20.setOnClickListener(this);
        B21 = (ImageView) findViewById(R.id.btnb21);
        B21.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch(id) {
            case R.id.btnb1:
                String url1 = "https://oce.ovid.com/book?SerialCode=01260173";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url1)));
                break;
            case R.id.btnb2:
                String url2 = "https://oce.ovid.com/book?SerialCode=01260174";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url2)));
                break;
            case R.id.btnb3:
                String url3 = "https://oce.ovid.com/book?SerialCode=01817265";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url3)));
                break;
            case R.id.btnb4:
                String url4 = "https://oce.ovid.com/book?SerialCode=02070853";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url4)));
                break;
            case R.id.btnb5:
                String url5 = "https://oce.ovid.com/book?SerialCode=02070806";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url5)));
                break;
            case R.id.btnb6:
                String url6 = "https://oce.ovid.com/book?SerialCode=02070807";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url6)));
                break;
            case R.id.btnb7:
                String url7 = "https://oce.ovid.com/book?SerialCode=02070808";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url7)));
                break;
            case R.id.btnb8:
                String url8 = "https://oce.ovid.com/book?SerialCode=02070809";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url8)));
                break;
            case R.id.btnb9:
                String url9 = "https://oce.ovid.com/book?SerialCode=02070810";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url9)));
                break;
            case R.id.btnb10:
                String url10 = "https://oce.ovid.com/book?SerialCode=02070830";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url10)));
                break;
            case R.id.btnb11:
                String url11 = "https://oce.ovid.com/book?SerialCode=02070829";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url11)));
                break;
            case R.id.btnb12:
                String url12 = "https://oce.ovid.com/book?SerialCode=01436869";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url12)));
                break;
            case R.id.btnb13:
                String url13 = "https://oce.ovid.com/book?SerialCode=01256964";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url13)));
                break;
            case R.id.btnb14:
                String url14 = "https://oce.ovid.com/book?SerialCode=01781587";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url14)));
                break;
            case R.id.btnb15:
                String url15 = "https://oce.ovid.com/book?SerialCode=01884421";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url15)));
                break;
            case R.id.btnb16:
                String url16 = "https://oce.ovid.com/book?SerialCode=01762475";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url16)));
                break;
            case R.id.btnb17:
                String url17 = "https://oce.ovid.com/book?SerialCode=01735163";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url17)));
                break;
            case R.id.btnb18:
                String url18 = "https://oce.ovid.com/book?SerialCode=01787339";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url18)));
                break;
            case R.id.btnb19:
                String url19 = "https://oce.ovid.com/book?SerialCode=01436876";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url19)));
                break;
            case R.id.btnb20:
                String url20 = "https://oce.ovid.com/book?SerialCode=01996163";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url20)));
                break;
            case R.id.btnb21:
                String url21 = "https://eyeplanet.info/e-books-details/1";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url21)));
                break;
        }
    }
}