package com.felight.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityLifeCycleDemo extends AppCompatActivity {


    private static final String TAG = ActivityLifeCycleDemo.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_life_cycle_demo);
        Log.i(TAG, "onCreate Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart Called");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume Called");

    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop Called");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy Called");
    }
}
