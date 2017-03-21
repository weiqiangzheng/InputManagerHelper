package com.flyn.inputmanagerhelper;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;

import com.flyn.inputmanagerhelper.helper.InputManagerHelper;

public class TranslucentLayoutActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translucent_layout);
        LinearLayout layout_keyboard = (LinearLayout) findViewById(R.id.layout_keyboard);
        Button tv_login = (Button) findViewById(R.id.tv_login);

        InputManagerHelper inputManagerHelper = InputManagerHelper.attachToActivity(this);
        inputManagerHelper.bindLayout(layout_keyboard, tv_login);
    }

}