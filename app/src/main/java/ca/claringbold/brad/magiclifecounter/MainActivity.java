package ca.claringbold.brad.magiclifecounter;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.TextView;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonhealthplus_you, buttonhealthminus_you, buttoncmddamageplus_you, buttoncmddamageminus_you;
    Button buttonhealthplus_opponent, buttonhealthminus_opponent, buttoncmddamageplus_opponent, buttoncmddamageminus_opponent;

    Integer healthyou, cmddamageyou, healthopponent, cmddamageopponent;

    TextView health_you, cmddamage_you;
    TextView health_opponent, cmddamage_opponent;
    
    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonhealthplus_you=(Button) findViewById(R.id.buttonhealthplus_you);
        buttonhealthminus_you=(Button) findViewById(R.id.buttonhealthminus_you);
        buttoncmddamageplus_you=(Button) findViewById(R.id.buttoncmddamageplus_you);
        buttoncmddamageminus_you=(Button) findViewById(R.id.buttoncmddamageminus_you);
        health_you=(TextView) findViewById(R.id.health_you);
        cmddamage_you=(TextView) findViewById(R.id.cmddamage_you);

        buttonhealthplus_opponent=(Button) findViewById(R.id.buttonhealthplus_oppoenent);
        buttonhealthminus_opponent=(Button) findViewById(R.id.buttonhealthminus_oppoenent);
        buttoncmddamageplus_opponent=(Button) findViewById(R.id.buttoncmddamageplus_oppoenent);
        buttoncmddamageminus_opponent=(Button) findViewById(R.id.buttoncmddamageminus_oppoenent);
        health_opponent=(TextView) findViewById(R.id.health_opponent);
        cmddamage_opponent=(TextView) findViewById(R.id.cmddamage_opponent);


        buttonhealthplus_you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                healthyou = Integer.parseInt(health_you.getText() + "");
                health_you.setText(healthyou+1);
            }
        });

        buttonhealthminus_you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                healthyou = Integer.parseInt(health_you.getText() + "");
                health_you.setText(healthyou-1);
            }
        });

        buttoncmddamageplus_you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cmddamageyou = Integer.parseInt(cmddamage_you.getText() + "");
                cmddamage_you.setText(cmddamageyou+1);
            }
        });

        buttoncmddamageminus_you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cmddamageyou = Integer.parseInt(cmddamage_you.getText() + "");
                cmddamage_you.setText(cmddamageyou-1);
            }
        });


        buttonhealthplus_opponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                healthopponent = Integer.parseInt(health_opponent.getText() + "");
                health_opponent.setText(healthopponent+1);
            }
        });

        buttonhealthminus_opponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                healthopponent = Integer.parseInt(health_opponent.getText() + "");
                health_opponent.setText(healthopponent-1);
            }
        });

        buttoncmddamageplus_opponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cmddamageopponent = Integer.parseInt(cmddamage_opponent.getText() + "");
                cmddamage_opponent.setText(cmddamageopponent+1);
            }
        });

        buttoncmddamageminus_opponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cmddamageopponent = Integer.parseInt(cmddamage_opponent.getText() + "");
                cmddamage_opponent.setText(cmddamageopponent-1);
            }
        });

                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

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

        return super.onOptionsItemSelected(item);
    }



    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Single Player";
                case 1:
                    return "Single Player Commander";
                case 2:
                    return "MultiPlayer Commander";
            }
            return null;
        }
    }
}
