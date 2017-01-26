package com.thuggerbrain.viiver.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.thuggerbrain.viiver.R;
import com.thuggerbrain.viiver.fragment.FragmentOrder;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);


        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.ordercontentContainer, FragmentOrder.newInstance())
                    .commit();
        }

    }
}
