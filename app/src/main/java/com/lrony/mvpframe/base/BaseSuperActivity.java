package com.lrony.mvpframe.base;

import android.os.Bundle;

import me.yokeyword.fragmentation.SupportActivity;

/**
 * Created by lrony on 2018/4/9.
 * Manage all Activity lifecycle, such as statistics and recovery.
 */
public class BaseSuperActivity extends SupportActivity {

    private static final String TAG = "BaseSuperActivity";

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Statsu recovery
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Status save
    }
}
