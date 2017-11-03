package fr.esilv.fsociety.cardgame.api;


import java.awt.Image;

public abstract class Card {
	private String name;
	private String img;

	protected Card(String name, String img) {
		super();
		this.name = name;
		this.img = img;
	}


	public String getName() {
		return name;
	}
	
	public String getImageTexture() {
		return this.img;
	}
	
	/**
	 * Activates this Card's effect on the game
	 * @param theGame
	 */
	public abstract void activate(Game theGame);
	
	//TODO show function


}