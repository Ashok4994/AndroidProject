package com.example.rufflez.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.mToolbar);
        setSupportActionBar(toolbar);

        final ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        ab.setDisplayHomeAsUpEnabled(true);

        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);

        NavigationView navView = (NavigationView) findViewById(R.id.navigation_view);
        if (navView != null){
            setupDrawerContent(navView);
        }

        viewPager = (ViewPager)findViewById(R.id.tab_viewpager);
        if (viewPager != null){
            setupViewPager(viewPager);
        }


        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    private void setupViewPager(ViewPager viewPager){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new About_history(), "History");
        adapter.addFrag(new About_intro(), "Introduction");
        adapter.addFrag(new About_courses(), "Courses");
            adapter.addFrag(new About_Location(), "Location");
        adapter.addFrag(new About_Library(),"Library");
        adapter.addFrag(new About_rschcenters(),"Research centers");
        adapter.addFrag(new Abour_charts(),"Functional Charts");

        viewPager.setAdapter(adapter);
    }

    private void setupDrawerContent(NavigationView navigationView){
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                menuItem.setChecked(true);

                switch (menuItem.getItemId()) {
                    case R.id.drawer_labels:

                       // viewPager.setCurrentItem(4);
                       // drawerLayout.closeDrawer(GravityCompat.START);
                        Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                        startActivity(intent);

                        break;
                    case R.id.gal:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        Intent intent7 = new Intent(MainActivity.this, Galleryclass.class);
                        startActivity(intent7);
                        break;

                    case R.id.prf: drawerLayout.closeDrawer(GravityCompat.START);
                        Intent intent6 = new Intent(MainActivity.this, Btech.class);
                        startActivity(intent6);
                        break;
                    case R.id.cse: drawerLayout.closeDrawer(GravityCompat.START);
                        Intent intent1 = new Intent(MainActivity.this, B_Cse.class);
                        startActivity(intent1);
                        break;
                    case R.id.ece: drawerLayout.closeDrawer(GravityCompat.START);
                        Intent intent2 = new Intent(MainActivity.this, B_Ece.class);
                        startActivity(intent2);
                        break;
                    case R.id.civil: drawerLayout.closeDrawer(GravityCompat.START);
                        Intent intent3 = new Intent(MainActivity.this, B_Cvl.class);
                        startActivity(intent3);
                        break;
                    case R.id.eee
                            : drawerLayout.closeDrawer(GravityCompat.START);
                        Intent intent4 = new Intent(MainActivity.this, B_Eee.class);
                        startActivity(intent4);
                        break;
                    case R.id.mech: drawerLayout.closeDrawer(GravityCompat.START);
                        Intent intent5 = new Intent(MainActivity.this, B_Mech.class);
                        startActivity(intent5);
                        break;
                    case R.id.stlgn: drawerLayout.closeDrawer(GravityCompat.START);
                        Intent intent8 = new Intent(MainActivity.this, Db_main.class);
                        startActivity(intent8);
                        break;
                }

                drawerLayout.closeDrawers();
                return true;
            }
        });
    }

    static class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager){
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title){
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position){
            return mFragmentTitleList.get(position);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        switch (id){
            case android.R.id.home:
                if (drawerLayout.isDrawerOpen(GravityCompat.START)){
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else {
                    drawerLayout.openDrawer(GravityCompat.START);
                }

                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
