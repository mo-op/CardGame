package fr.esilv.fsociety.cardgame.api;


import java.awt.Image;

public class Card {
	private String name;
	protected static Image img;
	protected static String NameofRace;

	public Card(String name, Image img, String race) {
		super();
		this.name = name;
		this.img = img;
		this.NameofRace = race;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static Image getImg() {
		return img;
	}
	public static void setImg(Image img) {
		Card.img = img;
	}
	public static String getNameofRace() {
		return NameofRace;
	}
	public static void setNameofRace(String nameofRace) {
		NameofRace = nameofRace;
	}


	/*
	 * Fonction:
	 * 				Affichage();
	 * 				UseCard();
	 */


}