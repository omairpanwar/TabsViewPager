package com.umairpanwar.tabsviewpager.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.umairpanwar.tabsviewpager.R;

import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentThree extends Fragment {


    public FragmentThree() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_three, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

}
