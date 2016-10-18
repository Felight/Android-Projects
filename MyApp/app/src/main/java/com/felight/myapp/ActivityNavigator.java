package com.felight.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityNavigator extends AppCompatActivity {

    public static final String NEWS_TYPE = "NEWS_TYPE";

    public void launchActivity(View view){
        switch (view.getId()){

            case R.id.btnGreetUser:
                Intent intentGreetUser = new Intent(this,GreetUserActivity.class);
                startActivity(intentGreetUser);
                break;

            case R.id.btnCalcualtor:
                Intent intentCalculator = new Intent(this,SimpleCalculatorActivity.class);
                startActivity(intentCalculator);
                break;

            case R.id.btnGoogleNews:
                Intent intentGoogleNews = new Intent(this,NewsActivity.class);
                intentGoogleNews.putExtra(NEWS_TYPE, "Google News");
                startActivity(intentGoogleNews);
                break;

            case R.id.btnFelightNews:
                Intent intentFelightNews = new Intent(this,NewsActivity.class);
                intentFelightNews.putExtra(NEWS_TYPE,"Felight News");
                startActivity(intentFelightNews);
                break;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_navigator);
    }
}
