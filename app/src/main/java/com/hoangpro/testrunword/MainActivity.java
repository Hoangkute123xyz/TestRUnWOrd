package com.hoangpro.testrunword;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView text;
     String textBK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        final String textS = "Xin chào mình là Hoàng";
        textBK=textS;
        final int range=100;
        final int length=textS.length()*range;
        Log.e("Length", length+"");
        CountDownTimer timer = new CountDownTimer(length,range) {
            @Override
            public void onTick(long millisUntilFinished) {
                if (textBK.length()>0)
                text.setText(text.getText().toString()+textBK.charAt(0));
                textBK=textBK.substring(1);

                Log.e("milies", millisUntilFinished+"");
            }

            @Override
            public void onFinish() {
                text.setText(textS);
            }
        };
        timer.start();
    }

    private void initView() {
        text = findViewById(R.id.text);
    }
}
