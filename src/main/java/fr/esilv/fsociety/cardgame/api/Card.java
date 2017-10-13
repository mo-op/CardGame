package fr.esilv.fsociety.cardgame.api;

/**
 * Represents a card that can be picked from the deck, played by a player or activated
 *
 */
public abstract class Card {

	public final String name; // the name of the card
	public final String description; // the description of the card, what its effects will be
	
	protected Card(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	
	/**
	 * Get the name of the texture that should be used to display this card on the board
	 * @return texture id
	 */
	public String getTextureName() {
		return null;
	}
	
	/*
	 * Activate this card for the specified player<br>
	 * TODO: replace type of arguments with api types when done
	 */
	public abstract void activate(Object board, Object player);
	
}
