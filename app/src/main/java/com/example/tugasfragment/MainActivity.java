package com.example.tugasfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private Boolean isFragmentDisplayed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.SpecButton);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        StaticFragment staticFragment = new StaticFragment();
        fragmentTransaction.add(R.id.fragment_container,staticFragment).commit();
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isFragmentDisplayed){
                    displayFragment();
                }
                else {
                    changeFragment();
                }
            }
        });
    }
    private void displayFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        DynamicFragment dynamicFragment = DynamicFragment.newInstance();

        fragmentTransaction.replace(R.id.fragment_container, dynamicFragment).addToBackStack(null).commit();

        isFragmentDisplayed = true;
        mButton.setText("Deskripsi");
    }

    private void changeFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        DynamicFragment simpleFragment = (DynamicFragment) fragmentManager.findFragmentById(R.id.fragment_container);

        if (simpleFragment != null) {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new StaticFragment()).commit();
        }

        mButton.setText("Spesifikasi");
        isFragmentDisplayed = false;

    }
}