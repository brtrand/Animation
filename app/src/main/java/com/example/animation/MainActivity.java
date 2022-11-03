package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    TextView tv1;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
        bt1 = (Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
        bt3 = (Button)findViewById(R.id.bt3);
        bt4 = (Button)findViewById(R.id.bt4);
        bt5 = (Button)findViewById(R.id.bt5);
        bt6 = (Button)findViewById(R.id.bt6);
        bt7 = (Button)findViewById(R.id.bt7);


        Animation animBlink,animBounce,animRotate,animHSJump, animFade, animRFade,animRFadeOut;

        animBlink = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        animBounce = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
        animRotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        animHSJump = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.hsjump);
        animFade = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        animRFade = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotatefade);
        animRFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotatefadeout);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setVisibility(View.VISIBLE);
                tv1.startAnimation(animBlink);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setVisibility(View.VISIBLE);
                tv1.startAnimation(animBounce);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setVisibility(View.VISIBLE);
                tv1.startAnimation(animRotate);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setVisibility(View.VISIBLE);
                tv1.startAnimation(animHSJump);
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setVisibility(View.VISIBLE);
                tv1.startAnimation(animFade);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setVisibility(View.VISIBLE);
                tv1.startAnimation(animRFade);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setVisibility(View.VISIBLE);
                tv1.startAnimation(animRFadeOut);
            }
        });


    }
}