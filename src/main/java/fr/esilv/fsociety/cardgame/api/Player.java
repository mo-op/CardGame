package fr.esilv.fsociety.cardgame.api;

import java.util.List;

public class Player {

    private Board board;
   
    public Player(Board board) {
    	this.board = board;
    }

    public Player(List<Card> hand, List<Card> kingdom, int pos) {
    	this(new Board(hand, kingdom, pos));
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