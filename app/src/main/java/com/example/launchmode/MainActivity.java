package com.example.launchmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnStartFirstActivity;
    private Button mBtnStartSecondActivity;
    private Button mBtnStartThirdActivity;
    private Button mBtnStartMyselt;
    private Intent intent;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate: --- " + getClass().getSimpleName());
        Log.e(TAG, "onCreate:taskId == "+getTaskId() );
        mBtnStartFirstActivity = findViewById(R.id.btn_start_first_activity);
        mBtnStartSecondActivity = findViewById(R.id.btn_start_second_activity);
        mBtnStartThirdActivity = findViewById(R.id.btn_start_third_activity);
        mBtnStartMyselt = findViewById(R.id.btn_start_myselt);

        mBtnStartFirstActivity.setOnClickListener(this);
        mBtnStartSecondActivity.setOnClickListener(this);
        mBtnStartThirdActivity.setOnClickListener(this);
        mBtnStartMyselt.setOnClickListener(this);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(TAG, "onNewIntent: ");
    }

    @Override
    public void onClick(View v) {
        if (intent == null) {
            intent = new Intent();
        }
        switch (v.getId()) {
            case R.id.btn_start_first_activity:
                intent.setClass(this, FirstActivity.class);
                break;
            case R.id.btn_start_second_activity:
                intent.setClass(this, SecondActivity.class);
                break;
            case R.id.btn_start_third_activity:
                intent.setClass(this, ThirdActivity.class);
                break;
            case R.id.btn_start_myselt:
                intent.setClass(this, MainActivity.class);
                break;
        }
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart: ");
    }
}
