package com.thuggerbrain.viiver.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.thuggerbrain.viiver.R;
import com.thuggerbrain.viiver.fragment.FragmentMain;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInstances();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, FragmentMain.newInstance())
                    .commit();
        }



    }


    private void initInstances() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }


    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId())

        {
            case R.id.action_notification:
                Intent gotoNotifications = new Intent(getApplicationContext(), NotificationsActivity.class);
                startActivity(gotoNotifications);
                return true;
        }


        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        //take picture
//        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
//        startActivity(intent);

    }

}
