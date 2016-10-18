package com.felight.myapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by vinaynoah on 05/07/16.
 */
public class NewActivity extends AppCompatActivity {

    public void doSomething(View view){
        TextView textView = (TextView) findViewById(R.id.tvResult);
        textView.setText("This is from JAVA program");
        textView.setTextColor(Color.BLUE);
        textView.setTextSize(50.5F);
    }



    //starting point ( for JVM : psvm ) ( for dvm/art : onCreate() )

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newactivity_layout);

    }



}
