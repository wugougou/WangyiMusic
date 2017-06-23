package com.zzptc.pengxiangfeng.exam;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private Context mContext;
    private ImageView img_1;
    private ImageView img_2;
    private TextView tv_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_1= (ImageView) findViewById(R.id.img_1);
        img_2= (ImageView) findViewById(R.id.img_2);
        tv_name= (TextView) findViewById(R.id.tv_name);

        Animation animation= AnimationUtils.loadAnimation(mContext,R.anim.alpha);
        View img = findViewById(R.id.img_1);
        img.startAnimation(animation);

        Timer timer = new Timer();
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {

            }
        };
    //3000ms后自动跳转
       // timer.schedule(TimerTask, 3000);

    }

}
