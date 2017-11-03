package fr.esilv.fsociety.cardgame.api;

import java.awt.Image;

public class Race extends Card {

    private String power;
    private int ID;

    public Race(String name, Image img, String NameofRace, String power, int iD) {
        super(name, img, NameofRace);
        this.NameofRace = NameofRace;
        this.power = power;
        this.ID = iD;
    }



    public String getPower() {
        return power;
    }
    public void setPower(String power) {
        this.power = power;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }


}
