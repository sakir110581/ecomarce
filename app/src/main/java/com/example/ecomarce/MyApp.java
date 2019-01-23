package com.example.ecomarce;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MyApp extends Application {
    private static Context context;
    private String TAG="My app Activity";

    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
        Log.e(TAG,"Myapp activity start showing");
    }

    public static Context getContext(){
        return context;
    }
}
