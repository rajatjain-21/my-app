package com.codeasylums.myself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.Intent;
import android.view.MenuItem;

public class Main2Activity extends AppCompatActivity {
    Button AboutMe,Projects,Expertise,Moments,Goals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        AboutMe=(Button) findViewById(R.id.aboutView);
        Projects=(Button) findViewById(R.id.projectsView);
        Expertise=(Button) findViewById(R.id.expertiseView);
        Moments=(Button) findViewById(R.id.momentsView);
        Goals=(Button) findViewById(R.id.goalView);

        AboutMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,Main6Activity.class);
                startActivity(intent);
            }
        });
        Projects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,Main7Activity.class);
                startActivity(intent);
            }
        });
        Expertise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,Main7Activity.class);
                startActivity(intent);
            }
        });
        Moments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,Main8Activity.class);
                startActivity(intent);
            }
        });
        Goals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,Main8Activity.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==android.R.id.home) finish();
        return super.onOptionsItemSelected(item);
    }
}
