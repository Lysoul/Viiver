package com.thuggerbrain.viiver.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.thuggerbrain.viiver.R;
import com.thuggerbrain.viiver.adapter.NotificationListAdapter;

public class NotificationsActivity extends AppCompatActivity {
    Toolbar toolbar;
    ListView listViewnoti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        listViewnoti  = (ListView) findViewById(R.id.ContainerNotifications);
        listViewnoti.setAdapter(new NotificationListAdapter(getApplicationContext()));
        toolbar = (Toolbar) findViewById(R.id.toolbarnotifications);
        toolbar.setTitle("Notifications");
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorWhite));

    }





}
