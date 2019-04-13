package com.packtpub.androidhighperformanceprogramming;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class BuildingLayoutActivity extends NavigationActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    protected int getContentLayout() {
        return R.layout.content_layout;
    }

    @Override
    protected int getSubTitle() {
        return R.string.title_layout;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                final View view = findViewById(R.id.imagebutton);
                view.setLayerType(View.LAYER_TYPE_HARDWARE, null);
                ObjectAnimator animator = ObjectAnimator.ofFloat(view, "rotationY", 360, 0);
                animator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        view.setLayerType(View.LAYER_TYPE_NONE, null);
                    }
                });
                animator.start();
                break;
        }
    }
}
