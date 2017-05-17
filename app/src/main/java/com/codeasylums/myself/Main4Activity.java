package com.codeasylums.myself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Main4Activity extends AppCompatActivity {
        Button share;
        EditText shareWhat;
        ImageView imageView;
      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        share=(Button) findViewById(R.id.share);
          shareWhat=(EditText)findViewById(R.id.editText);
          imageView=(ImageView) findViewById(R.id.imageView2);
          if(getSupportActionBar()!=null){
              getSupportActionBar().setDisplayHomeAsUpEnabled(true);
              getSupportActionBar().setDisplayShowHomeEnabled(true);
          }
          imageView.setImageResource(R.drawable.sharelogo);
          share.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Intent i =new Intent(Intent.ACTION_SEND);
                  i.setData(Uri.parse("email"));
                  String[] s={"rjrox.21@gmail.com"};
                  i.putExtra(Intent.EXTRA_EMAIL,s);
                  //i.putExtra(Intent.EXTRA_SUBJECT,"This is a subject");
                  i.putExtra(Intent.EXTRA_TEXT,shareWhat.getText());
                  i.setType("message/rfc822");
                  Intent chooser = Intent.createChooser(i,"Share");
                  startActivity(chooser);
              }
          });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==android.R.id.home) finish();
        return super.onOptionsItemSelected(item);
    }
}
