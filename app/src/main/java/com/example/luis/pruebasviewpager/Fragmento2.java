package com.example.luis.pruebasviewpager;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by luis on 21/11/2017.
 */
//Probando commit de ViewPager

public class Fragmento2 extends Fragment {
    public View.OnClickListener oyente=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.v("Desde ",this.getClass().toString());
        }
    };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragmento_2, container, false);
        Button b=(Button)v.findViewById(R.id.btn_listar);
        b.setOnClickListener(oyente);
        return v;
    }
}
