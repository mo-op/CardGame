package fr.esilv.fsociety.cardgame.api;

import java.util.LinkedList;

import fr.esilv.fsociety.cardgame.api.races.Goblin;

/**
 * Represents the 2 boards and more generally the game taking place
 */
public class Game {
	
	public static final int TOP_PLAYER = 0;
	public static final int BOTTOM_PLAYER = 1;
	public static final int CURRENT_PLAYER = 2;

	private Dealer theDealer;
	
	private Player currentPlayer;
	
	private Player topPlayer;
	private Player bottomPlayer;
	
	public Game() {
		this.setBottomPlayer(new Player(new LinkedList<Card>(), new LinkedList<Card>(), BOTTOM_PLAYER));
		this.setTopPlayer(new Player(new LinkedList<Card>(), new LinkedList<Card>(), TOP_PLAYER));
		this.theDealer = new Dealer();
		
		//TODO draw 5 cards
		this.bottomPlayer.getBoard().getHand().add(new Goblin()); //FIXME ONLY FOR TESTING
		this.bottomPlayer.getBoard().getHand().add(new Goblin()); //FIXME ONLY FOR TESTING
		this.bottomPlayer.getBoard().getHand().add(new Goblin()); //FIXME ONLY FOR TESTING
		this.bottomPlayer.getBoard().getHand().add(new Goblin()); //FIXME ONLY FOR TESTING
		this.bottomPlayer.getBoard().getHand().add(new Goblin()); //FIXME ONLY FOR TESTING
		this.bottomPlayer.getBoard().getHand().add(new Goblin()); //FIXME ONLY FOR TESTING
		this.bottomPlayer.getBoard().getHand().add(new Goblin()); //FIXME ONLY FOR TESTING
		
	}
	
	
	public Player getCurrentPlayer() {
		return this.currentPlayer;
	}
	
	public Player getPlayer(int pos) {
		if(pos == TOP_PLAYER)
			return topPlayer;
		
		if(pos == BOTTOM_PLAYER)
			return bottomPlayer;
		
		if(pos == CURRENT_PLAYER)
			return currentPlayer;
		
		return null;
	}
	
	public void setTopPlayer(Player pl) {
		this.topPlayer = pl;
	}
	
	public void setBottomPlayer(Player pl) {
		this.bottomPlayer = pl;
	}
	
	/**
	 * The card c was clicked
	 * @param c
	 */
	public void onClick(Card c) {
		
	}
	
}