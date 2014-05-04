package de.cccc.connectfour;

import static org.junit.Assert.*;

import java.util.stream.IntStream;

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
    
    @Test
	public void canPustCoin() throws Exception {
    	assertTrue(game.canPut(0));
	}

    @Test
    public void cannotPutAfterPutting6Times() throws Exception {
    	IntStream.range(0, game.rows).forEach(value-> game.playerOnePutsCoin(0));
    	assertFalse(game.canPut(0));
    }

    @Test
    public void playercannoPutAfterPutting6Times() throws Exception {
    	IntStream.range(0, game.rows).forEach(value-> game.playerOnePutsCoin(0));
    	assertFalse(game.canPut(0));
    }

}
