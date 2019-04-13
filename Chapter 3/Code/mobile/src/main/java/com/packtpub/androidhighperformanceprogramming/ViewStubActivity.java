package com.packtpub.androidhighperformanceprogramming;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;

public class ViewStubActivity extends NavigationActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    protected int getContentLayout() {
        return R.layout.content_view_stub;
    }

    @Override
    protected int getSubTitle() {
        return R.string.title_view_stub;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                if (findViewById(R.id.viewstub) != null)
                    ((ViewStub) findViewById(R.id.viewstub)).inflate();
                break;
        }
    }
}
