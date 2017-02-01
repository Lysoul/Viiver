package com.thuggerbrain.viiver.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.thuggerbrain.viiver.R;
import com.thuggerbrain.viiver.activity.AccountSettingActivity;


/**
 * Created by jakkavat on 1/15/2017 AD.
 */
@SuppressWarnings("unused")
public class FragmentPreference extends Fragment {
    private ImageButton acountSetting;

    public FragmentPreference() {
        super();
    }

    @SuppressWarnings("unused")
    public static FragmentPreference newInstance() {
        FragmentPreference fragment = new FragmentPreference();
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
        View rootView = inflater.inflate(R.layout.fragment_preference, container, false);

        initInstances(rootView, savedInstanceState);
        acountSetting = (ImageButton) rootView.findViewById(R.id.imbtnAccountSetting);
        acountSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId())
                {
                    case R.id.imbtnAccountSetting:
                        Intent gotoAccountSetting = new Intent(getActivity().getApplicationContext(), AccountSettingActivity.class);
                        startActivity(gotoAccountSetting);
                        break;
                }
            }
        });
        return rootView;

    }

    private void init(Bundle savedInstanceState) {
        // Init Fragment level's variable(s) here
    }

    @SuppressWarnings("UnusedParameters")
    private void initInstances(View rootView, Bundle savedInstanceState) {
        // Init 'View' instance(s) with rootView.findViewById here


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


}
