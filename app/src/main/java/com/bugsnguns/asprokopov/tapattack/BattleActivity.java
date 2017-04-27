package com.bugsnguns.asprokopov.tapattack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BattleActivity extends AppCompatActivity {

    public static int score_player_one = 0;
    public static int score_player_two = 0;
    public static int winner = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);

    }

    public void onTap_one(View v){
        score_player_one = score_player_one + 1;

        TextView textViewOne = (TextView)findViewById(R.id.score_one);
        textViewOne.setText(String.valueOf(score_player_one));
        if(checkScore(score_player_one)){

            winner = 1;
            Intent intent = new Intent(this, WinnerActivity.class);
            startActivity(intent);
        }

    }

    public void onTap_two(View v){
        score_player_two = score_player_two + 1;

        TextView textViewTwo = (TextView)findViewById(R.id.score_two);
        textViewTwo.setText(String.valueOf(score_player_two));
        if(checkScore(score_player_two)){

            winner = 2;
            Intent intent = new Intent(this, WinnerActivity.class);
            startActivity(intent);
        }

    }

    protected boolean checkScore (int score){
        if(score >= ChooseTargetActivity.tapsToWin)
            return true;
        else return false;

    }


}
