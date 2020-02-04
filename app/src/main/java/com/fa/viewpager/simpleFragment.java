package com.fa.viewpager;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class simpleFragment extends Fragment {

    public static simpleFragment newInstance(String data) {
        simpleFragment sp = new simpleFragment();
        Bundle args = new Bundle();
        args.putString("text",data);
        sp.setArguments(args);
        return sp;
    }


    public simpleFragment() {
        // Required empty public constructor
    }

    private TextView textData;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_simple, container, false);

        textData = rootView.findViewById(R.id.tvData);
        textData.setText(getArguments().getString("text"));

        return rootView;
    }

}
