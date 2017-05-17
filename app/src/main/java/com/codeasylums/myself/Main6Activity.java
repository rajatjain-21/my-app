package com.codeasylums.myself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.*;
import android.content.*;

public class Main6Activity extends AppCompatActivity {
    TextView myself;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        myself=(TextView) findViewById(R.id.myself);

        String me="<p>Hello people, this is me, Rajat Jain.</p><p>I am from Bihar and I am currently pursuing my undergrad in Computer Science and Engineering from BIT Mesra, Ranchi. You may find me a bit shy initially, but once you know me you will get to know that I am a very fun-loving guy.</p>";
        myself.setText(Html.fromHtml(me));

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==android.R.id.home) finish();
        return super.onOptionsItemSelected(item);
    }
}
