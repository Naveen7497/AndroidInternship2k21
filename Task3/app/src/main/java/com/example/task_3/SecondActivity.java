package com.example.task_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("APSSDC","First activity Started");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i("APSSDC", "First activity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("APSSDC", "Second activity Stopped");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("APSSDC", "Second activity Resumed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("APSSDC", "Second activity Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("APSSDC", "Second activity Destroyed");
    }
}