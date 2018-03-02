package com.lei.myreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by yanle on 2018/3/2.
 */

public class MyReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        String str = intent.getStringExtra("key");
        Log.d("tag","收到广播" + str);
    }
}
