package com.example.ebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    public ImageView Journal;
    public ImageView Book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Journal = (ImageView) findViewById(R.id.btnjournal);
        Journal.setOnClickListener(this);
        Book = (ImageView) findViewById(R.id.btnbook);
        Book.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch(id) {
            case R.id.btnjournal:
                Intent inn1=getIntent();
                inn1=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(inn1);
                break;
            case R.id.btnbook:
                Intent inn2=getIntent();
                inn2=new Intent(MainActivity.this,BookActivity.class);
                startActivity(inn2);
                break;
        }
    }
}