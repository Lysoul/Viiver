package com.thuggerbrain.viiver.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.thuggerbrain.viiver.R;
import com.thuggerbrain.viiver.fragment.FragmentLogin;
import com.thuggerbrain.viiver.fragment.FragmentNotifications;

public class NotificationsActivity extends AppCompatActivity implements FragmentNotifications.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        if (savedInstanceState==null)
        {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.ContainerNotifications, FragmentNotifications.newInstance())
                    .commit();
        }
}

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
