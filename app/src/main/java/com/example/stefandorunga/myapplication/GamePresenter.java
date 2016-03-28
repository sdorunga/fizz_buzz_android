package com.example.stefandorunga.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;

/**
 * Created by stefandorunga on 28/03/2016.
 */
public class GamePresenter {
    private Game game;
    private Activity activity;
    public GamePresenter(Activity _activity) {
        Game game = new Game();
        activity = _activity;
        final Button numberAnswer = (Button) activity.findViewById(R.id.numberAnswer);
        numberAnswer.setText(game.currentNumber().toString());
        Button fizzAnswer = (Button) activity.findViewById(R.id.fizzAnswer);
        Button buzzAnswer = (Button) activity.findViewById(R.id.buzzAnswer);
        Button fizzBuzzAnswer = (Button) activity.findViewById(R.id.fizzBuzzAnswer);
        Button restartGame = (Button) activity.findViewById(R.id.restartGame);


        numberAnswer.setOnClickListener(new GameClickListener(game, numberAnswer, alert()));
        fizzAnswer.setOnClickListener(new GameClickListener(game, numberAnswer, alert()));
        buzzAnswer.setOnClickListener(new GameClickListener(game, numberAnswer, alert()));
        fizzBuzzAnswer.setOnClickListener(new GameClickListener(game, numberAnswer, alert()));


        restartGame.setOnClickListener(new GameRestartListener(game, numberAnswer));

    }

    class GameRestartListener implements View.OnClickListener{
        private Game mGame;
        private Button numberAnswer;
        public GameRestartListener(Game game, Button button){
            mGame = game;
            numberAnswer = button;
        }
        @Override
        public void onClick(View view) {
            mGame.restart();
            numberAnswer.setText(mGame.currentNumber().toString());
        }
    }

    class GameClickListener implements View.OnClickListener{
        private final AlertDialog mAlert;
        private Game mGame;
        private Button numberButon;
        public GameClickListener(Game game, Button button, AlertDialog alert){
            numberButon = button;
            mGame = game;
            mAlert = alert;
        }

        @Override
        public void onClick(View view) {
            Button button = (Button) view;
            mGame.nextPlay(button.getText().toString());
            if(mGame.state() == Game.LOST) {
                alert().show();
            } else {
                numberButon.setText(mGame.currentNumber().toString());
            }
        }
    }


    private AlertDialog alert() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(activity);
        dialogBuilder.setTitle("You Lost!");
        dialogBuilder.setMessage("Good work though, you should have another go");
        dialogBuilder.setCancelable(true);
        return dialogBuilder.create();
    }
}
