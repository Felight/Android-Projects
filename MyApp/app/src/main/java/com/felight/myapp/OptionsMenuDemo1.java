package com.felight.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

//Creating Options menu using programming
public class OptionsMenuDemo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_menu_demo1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

       /* MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_options_menu, menu);
        return true;*/
        return super.onCreateOptionsMenu(menu);

    }


}
