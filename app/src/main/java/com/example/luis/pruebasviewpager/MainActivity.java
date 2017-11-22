package com.example.luis.pruebasviewpager;


import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp=(ViewPager)findViewById(R.id.view_pager);
        AdaptadorPage a=new AdaptadorPage(getSupportFragmentManager());
        vp.setAdapter(a);
    }
}
