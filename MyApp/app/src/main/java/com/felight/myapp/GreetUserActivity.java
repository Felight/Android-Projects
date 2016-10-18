package com.felight.myapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by vinaynoah on 05/07/16.
 */
public class GreetUserActivity extends AppCompatActivity {


    private static final String TAG = GreetUserActivity.class.getSimpleName();

    private EditText etFirstName;
    private EditText etLastName;
    private TextView tvResult;

    public void greetUser(View view){
        Log.i(TAG, "inside greet user method");
        String fName = etFirstName.getText().toString();
        String lName = etLastName.getText().toString();

        tvResult.setText("Greetings " + fName + " " + lName);
        Log.i(TAG, fName + " " + lName);
        Toast.makeText(getBaseContext(), "Greetings " + fName + " " + lName, Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.greet_user_layout);

        etFirstName = (EditText) findViewById(R.id.etFirstName);
        etLastName = (EditText) findViewById(R.id.etLastName);
        tvResult = (TextView) findViewById(R.id.tvResult);


    }
}
