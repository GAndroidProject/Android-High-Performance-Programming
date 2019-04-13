package com.packtpub.androidhighperformanceprogramming;

import android.os.Bundle;
import android.widget.ListView;

public class ViewHolderPatternActivity extends NavigationActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int listSize = 30;
        SampleObject[] sampleObjects = new SampleObject[listSize];
        for (int i = 0; i < listSize; i++) {
            sampleObjects[i] = new SampleObject(R.string.sampleTitle, R.string.sampleDescription, R.mipmap.ic_launcher);
        }
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(new SampleObjectAdapter(sampleObjects));
    }

    @Override
    protected int getContentLayout() {
        return R.layout.content_view_holder_pattern;
    }

    @Override
    protected int getSubTitle() {
        return R.string.title_view_holder_pattern;
    }
}