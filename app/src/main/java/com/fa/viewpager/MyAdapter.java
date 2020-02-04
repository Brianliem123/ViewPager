package com.fa.viewpager;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class MyAdapter extends FragmentStatePagerAdapter {

    private static ArrayList<String> myTittle;
    private static ArrayList<String> myData;
    private static ArrayList<Items> myItems;

    private static int numOfItems;


    public static MyAdapter newInstance(FragmentManager fragmentManager, ArrayList<String> tittles,ArrayList<String> data){
        MyAdapter myAdapter = new MyAdapter(fragmentManager);
        myTittle = tittles;
        myData = data;
        numOfItems = data.size();
        return myAdapter;
    }

    public static MyAdapter newInstance(FragmentManager fragmentManager, ArrayList<Items> data){
        MyAdapter myAdapter = new MyAdapter(fragmentManager);
        myItems = data;
        numOfItems = data.size();
        return myAdapter;
    }

    public MyAdapter(FragmentManager fragmentManager){
        super(fragmentManager);

    }

    @Override
    public Fragment getItem(int position) {
        ArrayList<Items.Makanan> listMakanan = myItems.get(position).getData();

        //String text = myData.get(position);
        //simpleFragment sp = simpleFragment.newInstance(text);
        simpleFragment2 sp = simpleFragment2.new
        return sp;

    }

    @Override
    public int getCount() {
        return numOfItems;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        //String title = myTittle.get(position);
        String title = myItems.get(position).getNamaMenu();

        return title;
    }
}