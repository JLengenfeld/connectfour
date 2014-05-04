package de.cccc.connectfour;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class Game {

	private static final String PLAYER_ONE = "player one";
	private static final String PLAYER_TWO = "player two";

	private List<Stack<String>> field = null;
	int rows = 0;

	public Game() {
		this(7, 6); // Standardgroesse eines connect-four Spiels
	}

	/**
	 * @param cols
	 * @param rows
	 */
	public Game(int cols, int rows) {
		this.rows = rows;
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

	public boolean canPut(int aCollum) {
		return field.get(aCollum).size() < rows;
	}

	int connectedElementsInColumn(int aCollum) {
		Stack<String> stack = field.get(aCollum);
		if (stack.isEmpty()) {
			return 0;
		} else {
			AtomicInteger index = new AtomicInteger();
			return (int) stack
					.stream()
					.filter(i -> i.equals(before(stack, index))
							|| i.equals(next(stack, index))).count();
		}
	}

	/**
	 * FIXME: move own stack implementation
	 * 
	 * @param stack
	 * @param index
	 * @return
	 */
	private String before(Stack<String> stack, AtomicInteger index) {
		int next = index.get() - 1;
		if (next > 0)
			return stack.get(next);
		else
			return null;
	}

	/**
	 * FIXME: move own stack implementation
	 * 
	 * @param stack
	 * @param index
	 * @return
	 */
	private String next(Stack<String> stack, AtomicInteger index) {
		int next = index.incrementAndGet();
		if (next < stack.size())
			return stack.get(next);
		else
			return null;
	}
}
