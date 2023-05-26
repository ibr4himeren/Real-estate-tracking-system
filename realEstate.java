package com.mycompany.finallab;

import java.util.ArrayList;

/**
 *
 * @author ieren
 */
public class Realestate {

    String name, address;
    int purchasePrice, rentPrice;

    ArrayList<Apartments> Apartments = new ArrayList();

    ArrayList<Flats> Flats = new ArrayList();

    ArrayList<Villas> Villas = new ArrayList();

    ArrayList<Integer> Sales = new ArrayList();

    //A method that allows customer to purchase an estate for a specific price. 
    void purchaseRealestate(Customer Customer, Realestate realstate, int Customeroffer) {

        if (Customeroffer >= realstate.purchasePrice) {
            System.out.println(Customer.Username + " purchased " + realstate.name + " for: " + realstate.purchasePrice);
            Customer.payments.add(Customeroffer);
            Customer.purchasedrealestates.add(realstate);
        } else {
            System.out.println("Failed due to offered price");
        }
    }

    //A method that allows customer to rent an estate for a specific price.
    void rentRealEstate(Customer Customer, Realestate realstate, int Customeroffer) {

        if (Customeroffer >= realstate.rentPrice) {
            System.out.println(Customer.Username + "rented " + realstate.name + " for: " + realstate.purchasePrice);
            Customer.payments.add(Customeroffer);
            Customer.rentedrealestates.add(realstate);
        } else {
            System.out.println("Failed due to offered price");
        }
    }

    //A method that makes a sale while purchasing an estate for a specific price.
    void saleByPurchase(Customer Customer, Realestate realstate, int salePrice) {
        int finalPrice;
        finalPrice = realstate.purchasePrice - salePrice;
        Customer.payments.add(finalPrice);
        Customer.purchasedrealestates.add(realstate);
        this.Sales.add(salePrice);
        System.out.println("Final Price is: " + finalPrice + ". " + realstate.name + " selled succesfully to " + Customer + " by its new price.");
    }

    //A method that makes a sale while renting an estate for a specific price.
    void saleByRent(Customer Customer, Realestate realstate, int salePrice) {
        int finalPrice;
        finalPrice = realstate.rentPrice - salePrice;
        Customer.payments.add(finalPrice);
        Customer.rentedrealestates.add(realstate);
        this.Sales.add(salePrice);
        System.out.println("Final Price is: " + finalPrice + ". " + "The Estate rented succesfully by its new price.");
    }

    //A method that shows defined apartments.
    void getAllApartments() {
        System.out.println("All apartments are: ");
        for (int i = 0; i < this.Apartments.size(); i++) {
            if (this.Apartments.get(i) == null) {
                continue;
            } else {
                System.out.println((i + 1) + "- " + " Name: " + this.Apartments.get(i).name + ", Adress: "
                        + this.Apartments.get(i).address + ", Price: " + this.Apartments.get(i).purchasePrice
                        + ", Floors: " + this.Apartments.get(i).floors);
            }
        }
    }

    //A method that shows defined flats.
    void getAllFlats() {
        System.out.println("All flats are: ");
        for (int i = 0; i < this.Flats.size(); i++) {
            if (this.Flats.get(i) == null) {
                continue;
            } else {
                System.out.println((i + 1) + "- " + " Name: " + this.Flats.get(i).name + ", Adress: "
                        + this.Flats.get(i).address + ", Price: " + this.Flats.get(i).purchasePrice
                        + ", Rooms: " + this.Flats.get(i).rooms);
            }
        }
    }

    //A method that shows defined villas.
    void getAllVillas() {
        System.out.println("All Villas are: ");
        for (int i = 0; i < this.Villas.size(); i++) {
            if (this.Villas.get(i) == null) {
                continue;
            } else {
                System.out.println((i + 1) + "- " + " Name: " + this.Villas.get(i).name + ", Adress: "
                        + this.Villas.get(i).address + ", Price: " + this.Villas.get(i).purchasePrice
                        + ", Rooms: " + this.Villas.get(i).rooms);
            }
        }
    }

    //A method that removes purchased estates from customer.
    void removeFromPurchasedRealestate(Customer Customer, Realestate realstate) {
        Customer.purchasedrealestates.remove(realstate);
        System.out.println("Estate removed succesfully");
    }

    //A method that removes rented estates from customer.
    void removeFromRentedRealestate(Customer Customer, Realestate realstate) {
        Customer.rentedrealestates.remove(realstate);
        System.out.println("Estate removed succesfully");

    }
}
