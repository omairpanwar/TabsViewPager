package com.umairpanwar.tabsviewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

import com.umairpanwar.tabsviewpager.adapter.FragmentPageAdapter;
import com.umairpanwar.tabsviewpager.fragments.FragmentOne;
import com.umairpanwar.tabsviewpager.fragments.FragmentThree;
import com.umairpanwar.tabsviewpager.fragments.FragmentTwo;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_view_pager)
    ViewPager viewPager;
    @BindView(R.id.main_tab_layout)
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        FragmentPageAdapter pageAdapter = new FragmentPageAdapter(getSupportFragmentManager(),getApplicationContext());
        pageAdapter.addFragment(new FragmentOne(), "Tab1");
        pageAdapter.addFragment(new FragmentTwo(), "Tab2");
        pageAdapter.addFragment(new FragmentThree(), "Tab3");
        viewPager.setAdapter(pageAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
