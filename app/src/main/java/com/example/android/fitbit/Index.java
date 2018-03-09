package com.example.android.fitbit;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;


/**
 * Created by PCB on 3/6/2018.
 */

public class Index extends AppCompatActivity{

    private long timestamp;
    private TextView textViewStepCounter;
    private TextView textViewStepDetector;
    private Thread detectorTimeStampUpdaterThread;
    private Handler handler;
    private boolean isRunning = true;

    protected void onCreate(Bundle savedInstatnceState) {

        super.onCreate(savedInstatnceState);
        setContentView(R.layout.index_layout);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

    }



}
