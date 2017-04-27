package com.bugsnguns.asprokopov.tapattack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);
        TextView textViewWinner = (TextView)findViewById(R.id.winner);
        textViewWinner.setText(String.valueOf(BattleActivity.winner));
    }

    public void onNewGame(View v){
        BattleActivity.score_player_one = 0;
        BattleActivity.score_player_two = 0;
        BattleActivity.winner = 0;
        Intent intent = new Intent(this, ChooseTargetActivity.class);
        startActivity(intent);
    }
}
