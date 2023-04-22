package com.hrisheekesh.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class BluetoothActivity extends AppCompatActivity {
    @SuppressLint("MissingPermission")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);


        Button btntOn = findViewById(R.id.btnOn);
        final BluetoothAdapter bAdapter = BluetoothAdapter.getDefaultAdapter();
        btntOn.setOnClickListener(v -> {
            if(bAdapter == null)
            {
                Toast.makeText(getApplicationContext(),"Bluetooth Not Supported",Toast.LENGTH_SHORT).show();
            }
            else{
                if(!bAdapter.isEnabled()){
                    startActivityForResult(new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE),1);
                }
            }

        });


    }
}