package com.packtpub.androidhighperformanceprogramming;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dexle on 11/10/2015.
 */
public class SampleObjectAdapter extends BaseAdapter {
    private SampleObject[] sampleObjects;

    public SampleObjectAdapter(SampleObject[] sampleObjects) {
        this.sampleObjects = sampleObjects;
    }

    @Override
    public int getCount() {
        return sampleObjects.length;
    }

    @Override
    public SampleObject getItem(int position) {
        return sampleObjects[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SampleObjectViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_sampleobject, parent, false);
            viewHolder = new SampleObjectViewHolder();
            viewHolder.icon = (ImageView) convertView.findViewById(R.id.icon);
            viewHolder.title = (TextView) convertView.findViewById(R.id.title);
            viewHolder.description = (TextView) convertView.findViewById(R.id.description);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (SampleObjectViewHolder) convertView.getTag();
        }
        SampleObject sampleObject = getItem(position);
        viewHolder.icon.setImageResource(sampleObject.getIcon());
        viewHolder.title.setText(sampleObject.getTitle());
        viewHolder.description.setText(sampleObject.getDescription());
        return convertView;
    }

    static class SampleObjectViewHolder {
        TextView title;
        TextView description;
        ImageView icon;
    }
}
