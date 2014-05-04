package de.cccc.connectfour;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Game {

	private static final String PLAYER_ONE = "player one";
	private static final String PLAYER_TWO = "player two";

	private List<Stack<String>> field = null;

	public Game() {
		this(7, 6); // Standardgroesse eines connect-four Spiels
	}

	/**
	 * @param cols
	 * @param rows
	 */
	public Game(int cols, int rows) {
		this.field = new ArrayList<Stack<String>>(cols);
		
		int i = 0;
		while (i++ < cols) {
			field.add(new Stack<String>());
		}
	}

	public void playerOnePutsCoin(int aCollum) {
		field.get(aCollum).push(PLAYER_ONE);
	}

	public void playerTwoPutsCoin(int aCollum) {
		field.get(aCollum).push(PLAYER_TWO);
	}

	public String getLastCoin(int aCollum) {
		return field.get(aCollum).peek();
	}

	public int getScore(int aCollum) {
		return field.get(aCollum).size();
	}

}

class Coin {
	String belonginPlayer;
}
