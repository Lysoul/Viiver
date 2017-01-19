package com.thuggerbrain.viiver.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.thuggerbrain.viiver.R;
import com.thuggerbrain.viiver.activity.MainActivity;

public class SpashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spash_screen);
     RunSpashcreen(3000);

    }


    public void RunSpashcreen(int time) {
        Handler spashHandler = new Handler();
        spashHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent objSpash = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(objSpash);
                finish();
            }
        }, time);
    }
}
