package com.kazy91.app;

import android.util.Log;

public class LogcatDebugger implements Debugger {
    @Override
    public void show(String text) {
        Log.v("debug",text);
    }
}