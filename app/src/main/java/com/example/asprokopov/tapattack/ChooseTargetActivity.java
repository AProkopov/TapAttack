package com.example.asprokopov.tapattack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ChooseTargetActivity extends AppCompatActivity {

    public static int tapsToWin = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_target);
    }

    /*при нажатии кнопки Attack из поля ввода считывается количество тапов до победы
    а также отправляется осуществляется переход на экран сражения */
    protected void onAttack(View v){
        EditText editText = (EditText) findViewById(R.id.taps);
        try {
            String string = editText.getText().toString();
            tapsToWin = Integer.parseInt(string);
            if(tapsToWin == 0) {throw new Exception();}
            Intent intent = new Intent(this, BattleActivity.class);
            startActivity(intent);
        }
        catch (Exception e) {}

    }


}
