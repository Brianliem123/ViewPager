package com.fa.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager view_Pager;
    private MyAdapter myadapter;

    private TabLayout tabMenu;

    ArrayList<String> menuTitleData = new ArrayList<>();
    ArrayList<String> data = new ArrayList<>();

    ArrayList<Items> listItems = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateTitle();
        generateData();

        view_Pager = findViewById(R.id.viewPager);
        //myadapter = new MyAdapter(getSupportFragmentManager());
        //myadapter = MyAdapter.newInstance(getSupportFragmentManager(),menuTitleData, data);
        myadapter = MyAdapter.newInstance(getSupportFragmentManager(),listItems);

        view_Pager.setAdapter(myadapter);

        tabMenu = findViewById(R.id.tabMenu);
        tabMenu.setupWithViewPager(view_Pager);
    }

    private void generateTitle(){
        menuTitleData.add("promo");
        menuTitleData.add("A La Carte");
        menuTitleData.add("Paket Hemat");
        menuTitleData.add("Ayam");
        menuTitleData.add("Makanan");
        menuTitleData.add("Minuman");
    }

    private void generateData(){
        data.add("Data 1");
        data.add("Data 2");
        data.add("Data 3");
        data.add("Data 4");
        data.add("Data 5");
        data.add("Data 6");
    }

    private void generateItems(){
        ArrayList<Items.Makanan> menuAyam = new ArrayList<>();
        menuAyam.add(new Items.Makanan("Ayam goreng","20000"));
        menuAyam.add(new Items.Makanan("Ayam goreng","20000"));
        menuAyam.add(new Items.Makanan("Ayam goreng","20000"));

        ArrayList<Items.Makanan> menuNasi = new ArrayList<>();
        menuNasi.add(new Items.Makanan("Nasi goreng","20000"));
        menuNasi.add(new Items.Makanan("Nasi goreng","20000"));
        menuNasi.add(new Items.Makanan("Ayam goreng","20000"));

        listItems.add(new Items("Ayam",menuAyam));
        listItems.add(new Items("Makanan",menuNasi));
    }
}
