package com.mycompany.finallab;

/**
 *
 * @author ieren
 */
public class Apartments extends Realestate {

    int floors;

    public Apartments(String name, String adress, int purchasePrice,int rentPrice, int floors) {
        this.floors = floors;
        this.name = name;
        this.address = adress;
        this.purchasePrice = purchasePrice;
        this.rentPrice = rentPrice;

    }
}
