package de.cccc.connectfour;

public class Game {

    private final Integer[][] field;
    
    public Game() {
    	this(7,6); // Standardgroesse eines connect-four Spiels
    }
    
    public Game(int cols, int rows) {
    	this.field = new Integer[cols][rows];
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
