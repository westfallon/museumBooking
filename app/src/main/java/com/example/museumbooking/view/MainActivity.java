package com.example.museumbooking.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.museumbooking.R;
import com.example.museumbooking.util.ScreenUtil;

public class MainActivity extends AppCompatActivity {

    private Button mbtn_1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScreenUtil.setAndroidNativeLightStatusBar(MainActivity.this, true);
        setContentView(R.layout.activity_main);

        mbtn_1 = findViewById(R.id.btn_1);
        mbtn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyBookingActivity.class);
                startActivity(intent);
            }
        });

    }



}