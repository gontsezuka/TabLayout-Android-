package com.zukalover.tablayoutdesign;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * AFTER CREATING THE TABLAYOUT, VIEWPAGER AND VIEW ADAPTER
         * Evrything will work then you can choose to add icons or not
         */
        tabLayout = findViewById(R.id.main_tab_layout);
        viewPager = findViewById(R.id.view_pager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());


        viewPagerAdapter.addFragment(new FragmentCall(),"Call ");
        viewPagerAdapter.addFragment(new FragmentContact(),"Contact ");
        viewPagerAdapter.addFragment(new FragmentFavourite(),"Favourites ");


        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        /**
         *  TO SET THE DRAWABLE ICONS
         */
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_contacts);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_favourites);


        /**
         * TO REMOVE THE SHADOW BETWEEN ACTION BAR AND THE TAB-LAYOUT
         */
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);
    }
}