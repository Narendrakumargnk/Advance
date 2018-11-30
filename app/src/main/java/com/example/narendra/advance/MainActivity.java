package com.example.narendra.advance;

import android.app.Activity;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView camera, permissions, sensors, bluetooth, wifi, sms, telephony, gps, location, maps;

    //Camera, Permissions, Sensors, Bluetooth, Wi-Fi, SMS, Telephony, GPS, Location Manager, Google Maps
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting ids and assigning to local
        camera = (TextView) findViewById(R.id.camera);
        permissions = (TextView) findViewById(R.id.permissions);
        sensors = (TextView) findViewById(R.id.sensors);
        bluetooth = (TextView) findViewById(R.id.bluetooth);
        wifi = (TextView) findViewById(R.id.wifi);
        sms = (TextView) findViewById(R.id.sms);
        telephony = (TextView) findViewById(R.id.telephony);
        gps = (TextView) findViewById(R.id.gps);
        location = (TextView) findViewById(R.id.location);
        maps = (TextView) findViewById(R.id.maps);


        //setting on click listeners
        camera.setOnClickListener(this);
        permissions.setOnClickListener(this);
        sensors.setOnClickListener(this);
        bluetooth.setOnClickListener(this);
        wifi.setOnClickListener(this);
        sms.setOnClickListener(this);
        telephony.setOnClickListener(this);
        gps.setOnClickListener(this);
        location.setOnClickListener(this);
        maps.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.camera:

                Intent intent = new Intent(getApplicationContext(), CamaraNew.class);
                startActivity(intent);
                break;

            case R.id.permissions:
                Intent i = new Intent(getApplicationContext(), Camara_test.class);
                startActivity(i);
                break;

            case R.id.sensors:
                Intent in = new Intent(getApplicationContext(), CamaraNew.class);
                startActivity(in);
                break;
        }
    }
}
