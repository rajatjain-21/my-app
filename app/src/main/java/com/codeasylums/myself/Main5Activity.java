package com.codeasylums.myself;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import android.content.Intent;
import android.provider.MediaStore;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    Button call,fbbtn,washare;
    String uristring;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        call=(Button) findViewById(R.id.call);
        fbbtn=(Button) findViewById(R.id.fbbtn);
        washare=(Button) findViewById(R.id.washare);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel : 9771141332"));
                if(ActivityCompat.checkSelfPermission(Main5Activity.this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(Main5Activity.this,"Please first grant the permission to call",Toast.LENGTH_SHORT).show();
                    ActivityCompat.requestPermissions(Main5Activity.this,new String[] {Manifest.permission.CALL_PHONE},1);
                }
                else
                startActivity(i);
            }
        });
        fbbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                uristring="This feels sooooooo good";
                sharingIntent.putExtra(Intent.EXTRA_TEXT,uristring);
                sharingIntent.setPackage("com.facebook.katana");
                startActivity(sharingIntent);
            }
        });

        washare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                uristring="This feels soooooo good";
                sharingIntent.putExtra(Intent.EXTRA_TEXT,uristring);
                sharingIntent.setPackage("com.whatsapp");
                startActivity(sharingIntent);
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==android.R.id.home) finish();
        return super.onOptionsItemSelected(item);
    }
}
