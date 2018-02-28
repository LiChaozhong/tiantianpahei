package com.example.pwxc.tiantianpahei;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;


/**
 * Created by pwxc on 28/02/2018.
 */

public class MyService extends Service {

    @Override
    public IBinder onBind(Intent intent){
        return null;
    }

    @Override
    public void onCreate(){
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flag, int startId){
        return super.onStartCommand(intent, flag, startId);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
    }
}
