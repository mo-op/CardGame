package fr.esilv.fsociety.cardgame.api;
import java.util.LinkedList;
import java.util.List;

import javafx.scene.image.ImageView;

public class Board {

    private List<Card> hand;
    private List<Card> kingdom;
    private int position;



    public Board(List<Card> hand, List<Card> kingdom, int position) {
        super();
        this.hand = hand;
        this.kingdom = kingdom;
        this.position = position;
    }

    public List<Card> getHand() {
        return hand;
    }
    
    public void setHand(List<Card> hand) {
        this.hand = hand;
    }
    
    public List<Card> getKingdom() {
        return kingdom;
    }
    
    public void setKingdom(List<Card> kingdom) {
        this.kingdom = kingdom;
    }

    public int getPosition() {
        return position;
    }
    
    public void setPosition(int position) {
        this.position = position;
    }

	public ImageView[] handToImageViews() {
		return this.toImageView(hand);
	}
	
	public ImageView[] kingdomToImageViews() {
		return this.toImageView(kingdom);
	}
	
	private ImageView[] toImageView(List<Card> l) {
		LinkedList<ImageView> list = new LinkedList();
		
		for(Card c:l)
			list.add(c.toImageView());
		
		return list.toArray(new ImageView[0]);		
	}

    
    //TODO show function
}