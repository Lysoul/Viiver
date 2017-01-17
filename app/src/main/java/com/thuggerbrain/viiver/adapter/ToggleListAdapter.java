package com.thuggerbrain.viiver.adapter;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.thuggerbrain.viiver.R;

import java.util.List;

/**
 * Created by jakkavat on 1/18/2017 AD.
 */

public class ToggleListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;


    public ToggleListAdapter(Activity context, String[] itemname, Integer[] imgid) {
        super(context, R.layout.listview_maintoggle, itemname);

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview_maintoggle, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.tvToggle);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imgtoggleIcom);

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        return rowView;

    };


}
