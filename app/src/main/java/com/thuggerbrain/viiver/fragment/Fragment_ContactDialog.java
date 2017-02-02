package com.thuggerbrain.viiver.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thuggerbrain.viiver.R;

/**
 * Created by Agisz on 1/31/2017 AD.
 */

public class Fragment_ContactDialog extends android.support.v4.app.DialogFragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dialogcontact,container,false);
        return rootView;
    }


}
