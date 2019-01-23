package com.example.ecomarce.Utiliti;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.ecomarce.MyApp;

public class SharePreferenceUtils {
    private static  String PREFERENCE_NAME="Event";
    private static SharePreferenceUtils sharePreferenceUtils;
    private SharedPreferences sharedPreferences;
    private SharePreferenceUtils(Context context){
        PREFERENCE_NAME=PREFERENCE_NAME+context.getPackageName();
        this.sharedPreferences=context.getSharedPreferences(PREFERENCE_NAME,Context.MODE_PRIVATE);
    }

    public static  SharePreferenceUtils getInstance(){
        if(sharePreferenceUtils==null){
            sharePreferenceUtils=new SharePreferenceUtils(MyApp.getContext());
        }
        return sharePreferenceUtils;
    }

    //login responce user_id 1234
    public void saveString(String key, String Val){
        SharedPreferences.Editor editor;
        editor=sharedPreferences.edit();
        ((SharedPreferences.Editor) editor).putString(key, Val);
        editor.commit();
    }
    public String getString(String key, String defVal){
        return sharedPreferences.getString(key,defVal);

    } public String getString(String key){
        return sharedPreferences.getString(key,"");

    }

}
