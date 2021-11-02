package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.ListActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String MonthNames[] = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
    };


    private Integer imageid[] = {
            R.drawable.ok,
            R.drawable.xmark
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setting header
        TextView textView = new TextView(this);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setText("List of Months");

        ListView listView=(ListView)findViewById(R.id.list);

        listView.addHeaderView(textView);

        // For populating list data
        MonthList MonthList = new MonthList(this, MonthNames, imageid);
        listView.setAdapter(MonthList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),"You Selected "+MonthNames[position-1]+ " as Month",Toast.LENGTH_SHORT).show();        }
        });



    }
}
