package com.example.luis.pruebasviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by luis on 21/11/2017.
 */

public class AdaptadorPage extends FragmentPagerAdapter {

    public AdaptadorPage(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Log.v("posicion", "posicion:"+position);
        Fragment a=null;
        if (position==0)
        {
            a=new Fragmento1();
        }
        else
        {
            a=new Fragmento2();
        }
        return a;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
