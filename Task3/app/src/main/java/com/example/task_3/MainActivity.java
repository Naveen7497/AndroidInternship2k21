package com.example.task_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("APSSDC","First activity Created");
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
            Log.i("APSSDC", "First activity Stopped");
        }

        @Override
            protected void onResume() {
                super.onResume();
                Log.i("APSSDC", "First activity Resumed");
            }

            @Override
                protected void onRestart() {
                super.onRestart();
                Log.i("APSSDC", "First activity Restarted");
            }

            @Override
            protected void onDestroy() {
            super.onDestroy();
                Log.i("APSSDC", "First activity Destroyed");
            }

    public void next(View view) {
        startActivity(new Intent(this,SecondActivity.class));
    }
}



