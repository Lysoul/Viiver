package com.thuggerbrain.viiver.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.PopupMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.thuggerbrain.viiver.R;


/**
 * Created by jakkavat on 1/15/2017 AD.
 */
@SuppressWarnings("unused")
public class FragmentMain extends Fragment implements View.OnClickListener{
    private ViewPager viewPager;
    private TabLayout tabLayout;

    private int[] tabIcons = {
            R.drawable.ic_search_white_36dp,
            R.drawable.ic_notifications_white_36dp,
            R.drawable.ic_search_white_36dp,
            R.drawable.ic_notifications_white_36dp
    };

    public FragmentMain() {
        super();
    }

    @SuppressWarnings("unused")
    public static FragmentMain newInstance() {
        FragmentMain fragment = new FragmentMain();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init(savedInstanceState);

        if (savedInstanceState != null)
            onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        initInstances(rootView, savedInstanceState);
        FloatingActionButton fab = (FloatingActionButton) rootView.findViewById(R.id.fabmainbtn);
        fab.setOnClickListener(this);
        fab.setOnClickListener(this);

        return rootView;
    }

    private void init(Bundle savedInstanceState) {
        // Init Fragment level's variable(s) here
    }

    @SuppressWarnings("UnusedParameters")
    private void initInstances(View rootView, Bundle savedInstanceState) {
        // Init 'View' instance(s) with rootView.findViewById here

        viewPager = (ViewPager) rootView.findViewById(R.id.viewpager);
        viewPager.setAdapter(new FragmentStatePagerAdapter(getChildFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return FragmentProfile.newInstance();
                    case 1:
                        return FragmentFeed.newInstance();
                    case 2:
                        return FragmentContact.newInstance();
                    case 3:
                        return FragmentTracking.newInstance();
                    default:
                        return null;
                }
            }

            @Override
            public int getCount() {
                return 4;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                switch (position) {
                    case 0:
                        return "Profile";
                    case 1:
                        return "Feed";
                    case 2:
                        return "Contact";
                    case 3:
                        return "Tracking";
                    default:
                        return "";
                }
            }


        });

        tabLayout = (TabLayout) rootView.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();

    }


    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
    }


    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    /*
     * Save Instance State Here
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save Instance State here
    }

    /*
     * Restore Instance State Here
     */
    @SuppressWarnings("UnusedParameters")
    private void onRestoreInstanceState(Bundle savedInstanceState) {
        // Restore Instance State here
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fabmainbtn:
                PopupMenu popupMenu = new PopupMenu(getActivity(), v);
                MenuInflater menuInflater = popupMenu.getMenuInflater();
                menuInflater.inflate(R.menu.main_floatpopup, popupMenu.getMenu());
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch(item.getItemId()) {
                            case R.id.senderitembtn:
                                Toast.makeText(getActivity(), "Sender Button", Toast.LENGTH_LONG).show();
                                return true;
                            case R.id.deliverdefindlocatinobtn:
                                Toast.makeText(getActivity(), "Delivery Button", Toast.LENGTH_LONG).show();
                                return true;
                        }
                        return false;
                    }
                });


        }
    }


}
