package com.example.brom.activitiesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.BreakIterator;

public class MountainDetailsActivity extends AppCompatActivity {

    private static final String TAG_LOG = "MountainDetailsActivity";
    public static final int MIN_VALUE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain_details);
        TextView incomingData = (TextView) findViewById(R.id.textFromMain);
        TextView incomingHojd = (TextView) findViewById(R.id.textFromMain2);
        TextView incomingvar = (TextView) findViewById(R.id.textFromMain3);
        Log.d(TAG_LOG, "onCreate: Started.");

        Intent incomingIntent = getIntent();
        String incomingName =  incomingIntent.getStringExtra("mountain");
        String incomingHeight =  incomingIntent.getStringExtra("height");
        String incomingLocation =  incomingIntent.getStringExtra("location");

        Log.d(TAG_LOG, "onCreate: hej" + incomingName);

        incomingData.setText(incomingName);
        incomingHojd.setText(incomingHeight);
        incomingvar.setText(incomingLocation);
        //TextView.setText(datastring);

    }
}
