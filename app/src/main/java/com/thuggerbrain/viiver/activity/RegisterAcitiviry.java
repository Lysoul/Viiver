package com.thuggerbrain.viiver.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.thuggerbrain.viiver.R;
import com.thuggerbrain.viiver.fragment.FragmentRegist;
public class RegisterAcitiviry extends AppCompatActivity implements FragmentRegist.OnFragmentInteractionListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.ContainerRegist, FragmentRegist.newInstance())
                    .commit();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
