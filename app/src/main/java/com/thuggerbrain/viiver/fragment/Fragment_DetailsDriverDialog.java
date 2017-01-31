package com.thuggerbrain.viiver.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thuggerbrain.viiver.R;

public class Fragment_DetailsDriverDialog extends DialogFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_infodelivery,container,false);
        getDialog().setTitle(getActivity().getResources().getString(R.string.details));
        return rootView;
    }
}
