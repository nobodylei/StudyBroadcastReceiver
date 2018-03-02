package com.lei.myreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        //发送广播
        Intent intent = new Intent();
        intent.setAction("com.lei.receiver");
        //带数据
        intent.putExtra("key","Hello");
        //sendBroadcast(intent);
        //接收广播需要com.lei.permission权限
        sendBroadcast(intent,"com.lei.permission");
    }

    /*public void doClick(View v) {
        switch(v.getId()) {
            case R.id.send1://发送一条普通广播
                Intent intent = new Intent();
                intent.putExtra("msg", "这是一条普通广播");//向intent中放入参数
                intent.setAction("BC_One");//设置Action，需要唯一性
                sendBroadcast(intent);//发送广播
                Log.i("info", "sssssss");
                TextView tv = findViewById(R.id.textView1);
                tv.setText("sssss");
                break;
            case R.id.send2://发送一条有序广播
                Intent intent2 = new Intent();
                intent2.putExtra("msg", "这是一条有序广播");//向intent中放入参数
                intent2.setAction("BC_One");//设置Action，需要唯一性
                //sendBroadcast(intent2);//发送广播
                sendOrderedBroadcast(intent2, null);//发送有序广播，权限为null
                Log.i("info", "sssssss222");

                break;
            case R.id.send3://发送一条异步广播
                Intent intent3 = new Intent();
                intent3.putExtra("msg", "这是一条异步广播");//向intent中放入参数
                intent3.setAction("BC_Three");//设置Action，需要唯一性
                //sendBroadcast(intent2);//发送广播
                //sendOrderedBroadcast(intent3, null);//发送有序广播，权限为null
                sendStickyBroadcast(intent3);//发送异步广播
                //注册
                IntentFilter intentfilter = new IntentFilter("BC_Three");
                bc3 = new BC3();
                registerReceiver(bc3, intentfilter);
                Log.i("info", "sssssss333");

                break;
            default:
                break;
        }
    }*/
}
