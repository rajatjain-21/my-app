package com.codeasylums.myself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.*;

import android.view.DragEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class Main3Activity extends AppCompatActivity {
    int[] myImageList = new int[]{R.drawable.rajat, R.drawable.tarun, R.drawable.newey, R.drawable.goal};
    Button changePicture,back;
    ImageView imageView;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        imageView=(ImageView)findViewById(R.id.imageView);
        changePicture=(Button) findViewById(R.id.seemore);
        back=(Button) findViewById(R.id.back);
        changePicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=i+1;
                if(i<myImageList.length)
                imageView.setImageResource(myImageList[i]);
                if(i>=myImageList.length)Toast.makeText(Main3Activity.this,"Sorry, no more photos",Toast.LENGTH_SHORT).show();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=i-1;
                if(i>=0)
                imageView.setImageResource(myImageList[i]);
                if(i<0)Toast.makeText(Main3Activity.this,"Sorry you should click the other button",Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==android.R.id.home) finish();
        return super.onOptionsItemSelected(item);
    }
}
