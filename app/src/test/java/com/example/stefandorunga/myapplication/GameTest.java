package com.example.stefandorunga.myapplication;

/**
 * Created by stefandorunga on 27/03/2016.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void nextPlayIncrementsCurrentScoreAndCurrentNunmber() {
        Game game = new Game();
        assertEquals(0, game.score());
        assertEquals((Integer) 1, game.currentNumber());
        game.nextPlay("1");
        assertEquals((Integer) 2, game.currentNumber());
        assertEquals(1, game.score());
    }
    @Test
    public void makingTheWrongPlayChangesStatusFromPlayingToLost() {
        Game game = new Game();
        assertEquals(Game.PLAYING, game.state());
        game.nextPlay("1");
        assertEquals(Game.PLAYING, game.state());
        game.nextPlay("2");
        assertEquals(Game.PLAYING, game.state());
        game.nextPlay("Fizz");
        assertEquals(Game.PLAYING, game.state());
        game.nextPlay("Fizz");
        assertEquals(Game.LOST, game.state());
    }

    @Test
    public void restartingTheGameResetsCurrentNumberCurrentScoreAndState() {
        Game game = new Game();
        game.nextPlay("1");
        game.nextPlay("1");
        game.restart();
        assertEquals((Integer) 1, game.currentNumber());
        assertEquals(0, game.score());
        assertEquals(Game.PLAYING, game.state());

    }
}
