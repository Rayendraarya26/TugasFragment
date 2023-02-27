package com.example.tugasfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DynamicFragment extends Fragment {

    public DynamicFragment() {
        // Required empty public constructor
    }

    public static DynamicFragment newInstance() {
        return new DynamicFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootview = inflater.inflate(R.layout.fragment_dynamic, container, false);
        return rootview;
    }
}