package edu.psu.ist402.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onStart() {
        super.onStart(); // Always call the superclass method first
        //Add code here for onStart callback action
        Log.d("onStart", "In the onStart event");
    }

    @Override
    public void onResume() {
        super.onResume(); // Always call the superclass method first
        //Add code here for onResume callback action
        Log.d("onResume", "In the onResume event");
    }

    @Override
    public void onPause() {
        super.onPause(); // Always call the superclass method first
        //Add code here for onPause callback action
        Log.d("onPause", "In the onPause event");
    }

    @Override
    public void onStop() {
        super.onStop(); // Always call the superclass method first
        //Add code here for onStop callback action
        Log.d("onStop", "In the onStop event");
    }

    @Override
    public void onDestroy() {
        super.onDestroy(); // Always call the superclass method first
        //Add code here for onDestroy callback action
        Log.d("onDestroy", "In the onDestroy event");
    }
}
