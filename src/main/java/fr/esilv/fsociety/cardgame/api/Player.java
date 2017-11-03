package fr.esilv.fsociety.cardgame.api;

public class Player {

    private Board board;
   
    public Player(Board board) {
    	this.board = board;
    }

    
    public Board getBoard() {
    	return this.board;
    }

    /**
     * Calculate the score
     * @return
     */
    public int getScore() {
    	return 0;
    }
}