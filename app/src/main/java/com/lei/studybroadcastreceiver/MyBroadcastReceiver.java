package com.lei.studybroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by yanle on 2018/3/2.
 */

public class MyBroadcastReceiver extends BroadcastReceiver{
    @Override//接收到广播调用
    public void onReceive(Context context, Intent intent) {
        //获得多拨打的号码
        String phoneNumber = getResultData();
        setResultData("0335" + phoneNumber);
        Log.i("tag",phoneNumber);
    }
}
