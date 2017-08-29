package com.example.nitishsingh.android104;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements ActionBar.TabListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //here we are creating object for the action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.mipmap.ic_launcher);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        actionBar.setNavigationMode(actionBar.NAVIGATION_MODE_TABS);
        //here we are adding tab in the action bar
        actionBar.addTab(actionBar.newTab().setText("AUDIO").setIcon(R.mipmap.ic_launcher)
        .setTabListener(this));

        actionBar.addTab(actionBar.newTab().setText("VIDEO").setIcon(R.mipmap.ic_launcher)
        .setTabListener(this));

    }
        @Override
        public void onTabSelected (ActionBar.Tab tab, FragmentTransaction ft){
            //here we are applying condition for selecting the tab
            int currentTab=tab.getPosition();
            Toast.makeText(this, "Current Tab " + currentTab, Toast.LENGTH_SHORT).show();
            switch (currentTab) {
                case 0:
                    setContentView(R.layout.tab_one);
                    break;
                case 1:
                    setContentView(R.layout.tab_two);
                    break;
            }
        }
        @Override
        public void onTabUnselected (ActionBar.Tab tab, FragmentTransaction ft){
            Toast.makeText(this, tab.getText()+ " is UnSelected", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onTabReselected (ActionBar.Tab tab, FragmentTransaction ft){
            Toast.makeText(this, tab.getText()+ " is Selected", Toast.LENGTH_SHORT).show();


        }
    }

