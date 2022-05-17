package com.example.appanimales;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.appanimales.fragmentos.Fragmento1;
import com.example.appanimales.fragmentos.Fragmento10;
import com.example.appanimales.fragmentos.Fragmento2;
import com.example.appanimales.fragmentos.Fragmento3;
import com.example.appanimales.fragmentos.Fragmento4;
import com.example.appanimales.fragmentos.Fragmento5;
import com.example.appanimales.fragmentos.Fragmento6;
import com.example.appanimales.fragmentos.Fragmento7;
import com.example.appanimales.fragmentos.Fragmento8;
import com.example.appanimales.fragmentos.Fragmento9;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPagerAdapter mAdapter;
    ViewPager2 viewPager2;

    ArrayList<Fragment> fragmentArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enlazarVista();
        configurarViewPager();
    }

    private void enlazarVista(){
        tabLayout = findViewById(R.id.tabLayout);
        viewPager2 = findViewById(R.id.vistaPaginas);
    }

    private void rellenarLista(){
        fragmentArrayList = new ArrayList<>();
        fragmentArrayList.add(new Fragmento1());
        fragmentArrayList.add(new Fragmento2());
        fragmentArrayList.add(new Fragmento3());
        fragmentArrayList.add(new Fragmento4());
        fragmentArrayList.add(new Fragmento5());
        fragmentArrayList.add(new Fragmento6());
        fragmentArrayList.add(new Fragmento7());
        fragmentArrayList.add(new Fragmento8());
        fragmentArrayList.add(new Fragmento9());
        fragmentArrayList.add(new Fragmento10());

        //fragmentArrayList.add(new Fragmento1());

    }

    private void configurarViewPager(){
        rellenarLista();

        mAdapter = new ViewPagerAdapter(getSupportFragmentManager(), getLifecycle(), fragmentArrayList);
        viewPager2.setAdapter(mAdapter);

        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0: tab.setText("P1");
                        break;
                    case 1: tab.setText("P2");
                        break;
                    case 2: tab.setText("P3");
                        break;
                    case 3: tab.setText("P4");
                        break;
                    case 4: tab.setText("G1");
                        break;
                    case 5: tab.setText("G2");
                        break;
                    case 6: tab.setText("G3");
                        break;
                    case 7: tab.setText("G4");
                        break;
                    case 8: tab.setText("C1");
                        break;
                    case 9: tab.setText("A1");
                        break;
                }
            }
        }).attach();
    }



}