package com.fa.viewpager;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class simpleFragment2 extends Fragment {
    private ArrayAdapter<Items> AdapterMenu;
    private ArrayList<Items.Makanan>items;
    private ListView lvItem;



    public simpleFragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_simple_fragment2, container, false);

        View rootView = inflater.inflate(R.layout.fragment_simple_fragment2, container, false);
        AdapterMenu = new ArrayAdapter<Items>(getContext(),R.layout., items)
        lvItem.setAdapter(AdapterMenu);
        return rootView;
    }

}
