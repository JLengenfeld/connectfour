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
        int collum = 0;
        game.playerOnePutsCoin(collum);

        assertEquals(1, game.getScore(collum));
    }

    @Test
    public void playerTwoScores() throws Exception {
        int collum = 0;
        game.playerTwoPutsCoin(collum);

        assertEquals(1, game.getScore(collum));
    }

    @Test
    public void playerOneAndTwoScores() throws Exception {
        int collum = 0;
        game.playerOnePutsCoin(collum);
        game.playerTwoPutsCoin(collum);

        assertEquals(2, game.getScore(collum));
    }

    @Test
    public void lastCoinMustBelongToPlayerOne() throws Exception {
        int collum = 0;
        game.playerOnePutsCoin(collum);

        assertEquals("player one", game.getLastCoin(collum));
    }

    @Test
    public void lastCoinMustBelongToPlayerTwo() throws Exception {
        int collum = 0;
        game.playerOnePutsCoin(collum);
        game.playerTwoPutsCoin(collum);

        assertEquals("player two", game.getLastCoin(collum));
    }

}
