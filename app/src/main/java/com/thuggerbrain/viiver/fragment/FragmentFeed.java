package com.thuggerbrain.viiver.fragment;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.thuggerbrain.viiver.R;


/**
 * Created by jakkavat on 1/15/2017 AD.
 */
@SuppressWarnings("unused")
public class FragmentFeed extends Fragment{

    public FragmentFeed() {
        super();
    }

    @SuppressWarnings("unused")
    public static FragmentFeed newInstance() {
        FragmentFeed fragment = new FragmentFeed();
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
        View rootView = inflater.inflate(R.layout.fragment_cardsfeed, container, false);
        initInstances(rootView, savedInstanceState);
        ImageButton imageButton = (ImageButton) rootView.findViewById(R.id.morebtncards);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                switch (v.getId())
                {
                    case R.id.morebtncards:
                            PopupMenu popupMenu = new PopupMenu(getActivity(), v, Gravity.END);
                            MenuInflater menuInflater = popupMenu.getMenuInflater();
                            menuInflater.inflate(R.menu.main_floatpopup, popupMenu.getMenu());
                            popupMenu.show();

                            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                                @Override
                                public boolean onMenuItemClick(MenuItem item) {
                                    switch (item.getItemId()) {
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
