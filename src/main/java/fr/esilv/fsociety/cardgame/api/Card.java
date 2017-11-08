package fr.esilv.fsociety.cardgame.api;


import fr.esilv.fsociety.cardgame.controller.MainController;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public abstract class Card {
	private String name;
	private String img;

	protected Card(String name, String img) {
		this.name = name;
		this.img = img;
	}


	public String getName() {
		return name;
	}
	
	public String getImageTexture() {
		return this.img;
	}
	
	public ImageView toImageView() {
		ImageView i = new ImageView(this.getImageTexture());
		
		
		i.setOnMouseClicked( (MouseEvent evt) -> {
			if(evt.getButton() == MouseButton.PRIMARY) {
				MainController.getInstance().onClick(this);
			}
		});
		return i;
	}
	
	/**
	 * Activates this Card's effect on the game
	 * @param theGame
	 */
	public abstract void activate(Game theGame);
	
	//TODO show function


}