package com.example.ecomarce.splash;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.ecomarce.R;
import com.example.ecomarce.Utiliti.SharePreferenceUtils;
import com.example.ecomarce.home.HomeActivity;
import com.example.ecomarce.login.SigninAcivity;

public class SplashActivity extends AppCompatActivity {
private String TAG="splashActivity";
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        init();
        Log.e(TAG,"Splash start showing");
    }
    public  void init(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // is user is registrad then go to home screen
                // if user is new then go to login screen.
                //key register_user
                Log.e(TAG,"Counter running");
                if(SharePreferenceUtils.getInstance().getString("register_user").equals("")){
                // new user
                    Intent intent=new Intent(SplashActivity.this, SigninAcivity.class);
                    startActivity(intent);
                }else {
                    // registered user
                    Intent intent=new Intent(SplashActivity.this, HomeActivity.class);
                    startActivity(intent);


                }
                finish();

            }
        }, 3000);

    }
}
