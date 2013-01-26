package com.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class AddToCalendarService extends Service {


    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Toast.makeText(this,"CREATED",Toast.LENGTH_LONG).show();

        stopSelf();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
