package com.example.museumbooking.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import com.example.museumbooking.R;
import com.example.museumbooking.databinding.ActivityMyBookingBinding;
import com.example.museumbooking.handler.ViewChaineBinding;
import com.example.museumbooking.util.ScreenUtil;

public class MyBookingActivity extends AppCompatActivity {

    private ActivityMyBookingBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_booking);
    }


//    @Override
//    public MyBookingActivity bindView() {
//        //状态栏字体设为黑色
//        ScreenUtil.setAndroidNativeLightStatusBar(MyBookingActivity.this, true);
//        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_my_booking);
//        return this;
//    }
//
//    @Override
//    public MyBookingActivity bindData() {
//        return this;
//    }
//
//    @Override
//    public MyBookingActivity bindEvents() {
//
//        return null;
//    }
}