package com.lei.myreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class BC1 extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		String s = intent.getStringExtra("msg");
		Log.i("info", s);

		Bundle bundle = new Bundle();//新建一个bundle对象
		bundle.putString("test", "广播处理的数据");//向bundle中添加数据

		setResultExtras(bundle);//设置一个返回的值，把bundle传进去
	}

}
