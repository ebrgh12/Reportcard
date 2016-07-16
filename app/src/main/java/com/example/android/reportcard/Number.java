package com.example.android.reportcard;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
public class Number extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create an array of words
        ArrayList< ReportCard> words = new ArrayList<ReportCard>();
        words.add(new ReportCard("85","English"));
        //This is the Log message using the toString() method
        Log.v("NumbersActivity", "Current word: " + words.toString());
        words.add(new ReportCard("92","Physics"));
        words.add(new ReportCard("90","Chemistry"));
        words.add(new ReportCard("55","Biology"));
        words.add(new ReportCard("86","Maths"));
        words.add(new ReportCard("60","Spanish"));
        words.add(new ReportCard("25","Chinese"));
        words.add(new ReportCard("100","Kannada"));
        words.add(new ReportCard("101", "Android"));
        // For verification
        Log.v("Number Activity", "ReportCard at index :0" + words.get(0));
        // Display using java( Set the rootview)
        ReportAdapter adapter = new ReportAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        //This is the Log message using the toString() method
        Log.v("NumbersActivity", "Current word: " + words.toString());
    }
}
