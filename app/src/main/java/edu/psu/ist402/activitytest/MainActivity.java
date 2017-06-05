package edu.psu.ist402.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
    }

    @Override
    public void onResume() {
        super.onResume(); // Always call the superclass method first
        //Add code here for onResume callback action
    }

    @Override
    public void onPause() {
        super.onPause(); // Always call the superclass method first
        //Add code here for onPause callback action
    }

    @Override
    public void onStop() {
        super.onStop(); // Always call the superclass method first
        //Add code here for onStop callback action
    }

    @Override
    public void onDestroy() {
        super.onDestroy(); // Always call the superclass method first
        //Add code here for onDestroy callback action
    }
}
