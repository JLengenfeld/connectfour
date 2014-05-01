package de.cccc.connectfour;

public class Game {

    private final Integer[][] field;
    
    public Game() {
    	this(new Integer[9][9]);
    }
    
    public Game(Integer[][] field) {
    	this.field = field;
    }

    public void playerOnePutsCoin(int aCollum) {
        for (int i = 0; i < field[aCollum].length; i++) {
            if (field[aCollum][i] == null) {
                field[aCollum][i] = 1;
                break;
            }
        }
    }

    public void playerTwoPutsCoin(int aCollum) {
        for (int i = 0; i < field[aCollum].length; i++) {
            if (field[aCollum][i] == null) {
                field[aCollum][i] = 2;
                break;
            }
        }
    }

    public String getLastCoin(int aCollum) {
        for (int i = field[aCollum].length - 1; i >= 0; i--) {
            if (field[aCollum][i] != null) {
                switch (field[aCollum][i]) {
                case 1:
                    return "player one";
                case 2:
                    return "player two";
                default:
                    return "jonas";
                }
            }
        }
        return "jonas again :(";
    }

    public int getScore(int aCollum) {
        int score = 0;
        for (int i = 0; i < field[aCollum].length; i++) {
            if (field[aCollum][i] != null) {
                score++;
            }
        }
        return score;
    }

}

class Coin {
    String belonginPlayer;
}
