package com.packtpub.androidhighperformanceprogramming;

import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;

/**
 * Created by dexle on 11/10/2015.
 */
public class SampleObject {
    private int title;
    private int description;
    private int icon;

    public SampleObject(@StringRes int title, @StringRes int description, @DrawableRes int icon) {
        setTitle(title);
        setDescription(description);
        setIcon(icon);
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(@StringRes int title) {
        this.title = title;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(@StringRes int description) {
        this.description = description;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(@DrawableRes int icon) {
        this.icon = icon;
    }
}
