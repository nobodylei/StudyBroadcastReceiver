package com.lei.myreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class BC2 extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		String s = intent.getStringExtra("msg");
		Log.i("info", "reveiver2收到消息" + s);
		//abortBroadcast();//截断广播，普通广播不能被中断，会发生异常

		Bundle bundle = getResultExtras(true);//获得消息
		String s2 = bundle.getString("test");
		Log.i("info", "reveiver2收到消息" + s2);
	}

}
