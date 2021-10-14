package com.nems.ajanta_adsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nems.aj_adsdk.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toaster.Toster(this,"Hiiss");
    }
}