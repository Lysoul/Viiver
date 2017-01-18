package com.thuggerbrain.viiver.activity;

import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.thuggerbrain.viiver.R;
import com.thuggerbrain.viiver.adapter.ToggleListAdapter;
import com.thuggerbrain.viiver.fragment.FragmentMain;
import com.thuggerbrain.viiver.fragment.FragmentSpashpage;

public class MainActivity extends AppCompatActivity implements FragmentSpashpage.OnFragmentInteractionListener {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private Toolbar toolbar;
    private ListView listviewtoggle;

    String[] itemname = {
            "จัดการบัญชี",
            "ออเดอร์ส่งของ",
            "กระเป๋าเงิน",
            "วิธีใช้งาน",
            "ตั้งค่า",
            "ข้อเสนอแนะ",
            "เกี่ยวกับเรา"
    };

    Integer[] imgid = {
            R.drawable.ic_account_circle_black_24dp,
            R.drawable.ic_account_circle_black_24dp,
            R.drawable.ic_account_circle_black_24dp,
            R.drawable.ic_account_circle_black_24dp,
            R.drawable.ic_account_circle_black_24dp,
            R.drawable.ic_account_circle_black_24dp,
            R.drawable.ic_account_circle_black_24dp
    };



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
        runSpashPage(3000);
    }


    public void initInstances() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        listviewtoggle = (ListView) findViewById(R.id.listviewtoggle);

        listviewtoggle.setAdapter(new ToggleListAdapter(MainActivity.this, itemname, imgid));


        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                R.string.open_drawer,
                R.string.close_drawer);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);

    }


    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        actionBarDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }



    @Override
    public void onFragmentInteraction(Uri uri) {

    }


    private void runSpashPage(int i) {
        final ImageView spashImage = (ImageView) findViewById(R.id.spashpage);
        final TextView  textCoppyRight = (TextView) findViewById(R.id.coppyright) ;
        textCoppyRight.setVisibility(View.VISIBLE);
        spashImage.setVisibility(View.VISIBLE);
        final Handler spashHandler = new Handler();
        spashHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                textCoppyRight.setVisibility(View.GONE);
                spashImage.setVisibility(View.GONE);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        }, i);
    }

}
