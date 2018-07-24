package com.siveco.fg.tasksuplimentarfragmente;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ContractInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();

        Fragment top = new FragmentTop();
        Fragment bottom = new FragmentBottom();

        fm.beginTransaction().add(R.id.topFrameLayout, top).commit();
        fm.beginTransaction().add(R.id.bottomFrameLayout, bottom).commit();
    }

    @Override
    public void setInfo(String name, String surname) {

        FragmentManager fm = getSupportFragmentManager();

        FragmentBottom bottomFragment = (FragmentBottom) fm.findFragmentById(R.id.bottomFrameLayout);

        if(bottomFragment != null) {
            bottomFragment.setInfo(name, surname);
        }

    }
}
