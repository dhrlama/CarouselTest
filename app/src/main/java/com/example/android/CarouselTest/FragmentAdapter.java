package com.example.android.CarouselTest;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.viewpagerindicator.IconPagerAdapter;

public class FragmentAdapter extends FragmentStatePagerAdapter implements IconPagerAdapter{

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }

    @Override

    public int getIconResId(int index) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override

    public Fragment getItem(int position)
    {
        // TODO Auto-generated method stub
        Fragment fragment = new Carousel_first();
        switch(position){
            case 0:
                fragment = new Carousel_first();
                break;
            case 1:
                fragment = new Carousel_second();
                break;
            case 2:
                fragment = new Carousel_third();
                break;
        }
        return fragment;
    }

    @Override

    public int getCount() {
        // TODO Auto-generated method stub
        return 3;
    }

    @Override

    public CharSequence getPageTitle(int position){
        String title = "";
        switch(position){
            case 0:
                title = "First";
                break;
            case 1:
                title = "Second";
                break;
            case 2:
                title = "Third";
                break;
        }
        return title;
    }

}