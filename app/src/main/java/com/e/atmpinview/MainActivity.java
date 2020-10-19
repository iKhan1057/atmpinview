package com.e.atmpinview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.e.atmpinview.atmpin.ATMPINActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void atmpin(View view){
        startActivity(new Intent(MainActivity.this, ATMPINActivity.class));
    }
}
