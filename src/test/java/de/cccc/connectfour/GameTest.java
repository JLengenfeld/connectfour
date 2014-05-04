package de.cccc.connectfour;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GameTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void playerOneScores() throws Exception {
        game.playerOnePutsCoin(0);

        assertEquals(1, game.getScore(0));
    }

    @Test
    public void playerTwoScores() throws Exception {
        game.playerTwoPutsCoin(0);

        assertEquals(1, game.getScore(0));
    }

    @Test
    public void playerOneAndTwoScores() throws Exception {
        game.playerOnePutsCoin(0);
        game.playerTwoPutsCoin(0);

        assertEquals(2, game.getScore(0));
    }

    @Test
    public void lastCoinMustBelongToPlayerOne() throws Exception {
        game.playerOnePutsCoin(0);

        assertEquals("player one", game.getLastCoin(0));
    }

    @Test
    public void lastCoinMustBelongToPlayerTwo() throws Exception {
        game.playerOnePutsCoin(0);
        game.playerTwoPutsCoin(0);

        assertEquals("player two", game.getLastCoin(0));
    }

}
