package com.example.stefandorunga.myapplication;

import java.util.Objects;

/**
 * Created by stefandorunga on 27/03/2016.
 */
public class Game {
    public static final Object PLAYING = new Object();
    public static final Object LOST = new Object();
    private int mScore = 0;
    private int mCurrentNumber = 1;
    private Object mState;
    private FizzBuzz mFizzBuzz;
    public Game() {
        mFizzBuzz = new FizzBuzz();
        mState = PLAYING;
    }
    public int score() {
        return mScore;
    }

    public void nextPlay(String play) {
        if (isCorrectAnswer(play)) { progressGame(); } else { loseGame(); };
    }

    public Integer currentNumber() {
        return mCurrentNumber;
    }

    public Object state() {
        return mState;
    }

    private void loseGame() {
        mState = LOST;
    }

    private void progressGame() {
        mScore++;
        mCurrentNumber++;
    }

    private boolean isCorrectAnswer(String play) {
        return play.equals(mFizzBuzz.messageFor(mCurrentNumber));
    }

    public void restart() {
        mState = PLAYING;
        mScore = 0;
        mCurrentNumber = 1;
    }
}
