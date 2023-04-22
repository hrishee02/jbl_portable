package com.hrisheekesh.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;
import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final BluetoothAdapter bAdapter = BluetoothAdapter.getDefaultAdapter();
        MotionLayout motionLayout = findViewById(R.id.motion_layout);
        motionLayout.setTransitionListener(new MotionLayout.TransitionListener() {
            @Override
            public void onTransitionStarted(MotionLayout motionLayout, int startId, int endId) {

            }

            @Override
            public void onTransitionChange(MotionLayout motionLayout, int startId, int endId, float progress) {

            }

            @SuppressLint("MissingPermission")
            @Override
            public void onTransitionCompleted(MotionLayout motionLayout, int currentId) {
                if(!bAdapter.isEnabled()){Intent intent = new Intent(getApplicationContext(), BluetoothActivity.class);
                startActivity(intent);
                }

                else {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }

            }

            @Override
            public void onTransitionTrigger(MotionLayout motionLayout, int triggerId, boolean positive, float progress) {

            }
        });


    }
}