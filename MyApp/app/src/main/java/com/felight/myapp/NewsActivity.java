package com.felight.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity {

    private TextView tvNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        tvNews = (TextView) findViewById(R.id.tvNews);

        Intent incommingIntent = getIntent();
        String news = incommingIntent.getStringExtra(ActivityNavigator.NEWS_TYPE);
        tvNews.setText(news);

    }


}
