package com.thuggerbrain.viiver.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.thuggerbrain.viiver.R;
import com.thuggerbrain.viiver.utils.ScreenUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int ScreenWidth = ScreenUtils.getInstance().getScreenWidth();
        int ScreenHeight = ScreenUtils.getInstance().getScreenHeight();

        Toast.makeText(MainActivity.this,"Width = "+ScreenWidth+", Height = "+ScreenHeight,Toast.LENGTH_SHORT).show();

    }
}
