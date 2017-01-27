package com.thuggerbrain.viiver.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.thuggerbrain.viiver.R;

/**
 * Created by Agisz on 1/27/2017 AD.
 */

public class NotificationListAdapter extends BaseAdapter {
    public Context mContext;
    public LayoutInflater mInflater;

    public NotificationListAdapter(Context context) {
        mContext = context;
        mInflater= LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return 20;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
        {
            convertView =  mInflater.inflate(R.layout.fragment_notification,parent,false);
        }
        else
        {

        }

        return convertView;
    }
}
