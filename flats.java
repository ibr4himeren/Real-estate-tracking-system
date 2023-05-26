package com.mycompany.finallab;

/**
 *
 * @author ieren
 */
public class Flats extends Realestate {

    int rooms;

    public Flats(String name, String adress, int purchasePrice, int rentPrice,int rooms) {
        this.rooms = rooms;
        this.name = name;
        this.address = adress;
        this.purchasePrice = purchasePrice;
        this.rentPrice = rentPrice;
    }
}
