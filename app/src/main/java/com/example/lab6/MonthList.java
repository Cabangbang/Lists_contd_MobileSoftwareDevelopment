package com.example.lab6;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class MonthList extends ArrayAdapter {
    private String[] MonthNames;
    private Integer[] imageid;
    private Activity context;

    public MonthList(Activity context, String[] MonthNames, Integer[] imageid) {
        super(context, R.layout.row_item, MonthNames);
        this.context = context;
        this.MonthNames = MonthNames;
        this.imageid = imageid;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater= context.getLayoutInflater();
        View row = inflater.inflate(R.layout.row_item, parent, false);
        if(convertView==null)
            row = inflater.inflate(R.layout.row_item, null, true);
        TextView textViewMonth = (TextView) row.findViewById(R.id.textViewMonth);
        ImageView imageFlag = (ImageView) row.findViewById(R.id.imageViewFlag);
        textViewMonth.setText(MonthNames[position]);
        if(MonthNames[position]== "December"){
            imageFlag.setImageResource(imageid[0]);

        } else {
            imageFlag.setImageResource(imageid[1]);
        }
        return row;
    } // get View

}
