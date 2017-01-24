package com.thuggerbrain.viiver.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thuggerbrain.viiver.R;

/**
 * Created by Agisz on 1/24/2017 AD.
 */

public class DummyScrollView extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
    }

    @Nullable
    @Override
            public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup viewGroup,@Nullable Bundle saveInsatnceState)
    {
            return inflater.inflate(R.layout.fragment_dummyscroll,viewGroup,false);
    }
}
