package com.example.tugasfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class StaticFragment extends Fragment {


    public StaticFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup
            container, Bundle savedInstanceState) {
        final View rootview = inflater.inflate(R.layout.fragment_static, container, false);
        return rootview;
    }
}