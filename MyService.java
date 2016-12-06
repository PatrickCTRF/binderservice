package com.example.patrick.binderservice;

/**
 * Created by patrick on 12/6/16.
 */
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;

/**
 * Created by mmjoshi on 8/12/2015.
 */
public class MyService extends Service {
    private final IBinder mBinder = new LocalBinder();
    @Override
    public IBinder onBind(Intent intent)
    {
        return mBinder;
    }



    public class LocalBinder extends Binder
    {
        public MyService getService()
        {
            return MyService.this;
        }
    }
}