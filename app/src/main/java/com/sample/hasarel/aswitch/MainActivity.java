package com.sample.hasarel.aswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Ui Components
    private Switch mSwSwitch1,mSwSwitch2;
    private Button mBtnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mSwSwitch1 = findViewById(R.id.main_activity_sw_switch1);
        mSwSwitch2 = findViewById(R.id.main_activity_sw_switch2);
        mBtnClick = findViewById(R.id.main_activity_btn_click);
        mBtnClick.setOnClickListener(this);
    }

    private void clickSwitch(){
        String switch1, switch2;
        if (mSwSwitch1.isChecked())
            switch1 = mSwSwitch1.getTextOn().toString();
        else
            switch1 = mSwSwitch1.getTextOff().toString();
        if (mSwSwitch2.isChecked())
            switch2 = mSwSwitch2.getTextOn().toString();
        else
            switch2 = mSwSwitch2.getTextOff().toString();
        Toast.makeText(getApplicationContext(), "Switch1 -  " + switch1 + " \n" + "Switch2 - " + switch2,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_activity_btn_click:
                clickSwitch();
                break;
            default:
                break;
        }
    }
}