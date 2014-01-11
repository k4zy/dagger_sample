package com.kazy91.app;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module(injects = MainActivity.class)
public class DebuggerModule {
    Context context;
    public DebuggerModule(Context context){
        this.context = context;
    }
    @Provides
    Debugger provideDebugger() {
        return new ToastDebugger(context);
    }
}