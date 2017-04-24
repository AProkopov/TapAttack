package com.bugsnguns.asprokopov.tapattack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //открываем экран для ввода количества тапов, необх-х для победы
    protected void onStartTheGame(View v){
        Intent intent = new Intent(this, ChooseTargetActivity.class);
        startActivity(intent);

    }
}
