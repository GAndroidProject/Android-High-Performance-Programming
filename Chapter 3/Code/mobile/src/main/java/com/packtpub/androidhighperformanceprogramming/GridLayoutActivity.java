package com.packtpub.androidhighperformanceprogramming;

import android.os.Bundle;

public class GridLayoutActivity extends NavigationActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getContentLayout() {
        return R.layout.content_grid_layout;
    }

    @Override
    protected int getSubTitle() {
        return R.string.title_grid_layout;
    }
}
