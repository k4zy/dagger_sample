package com.kazy91.app;

import android.content.Context;
import android.widget.Toast;

public class ToastDebugger implements Debugger {
    Context context;
    public ToastDebugger(Context context){
        this.context = context;
    }

    @Override
    public void show(String text) {
        Toast.makeText(context,text,Toast.LENGTH_SHORT).show();
    }

}