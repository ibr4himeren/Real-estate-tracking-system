package com.mycompany.finallab;

import java.util.ArrayList;

/**
 *
 * @author ieren
 */
public class Customer implements IUserCustomer {

    String Username, phoneNumber;
    int id, age;

    ArrayList<Integer> payments = new ArrayList<>();

    ArrayList<Realestate> purchasedrealestates = new ArrayList<>();

    ArrayList<Realestate> rentedrealestates = new ArrayList<>();

    public Customer(String Username, String phoneNumber, int id, int age) {
        this.Username = Username;
        this.age = age;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getUsername() {
        return Username;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void changePhoneNumber(String newNumber) {
        this.phoneNumber = newNumber;
    }

    @Override
    public void changeUsername(String newUsername) {
        this.phoneNumber = newUsername;
    }

    @Override
    public int changeId(int newId) {
        this.id = newId;
        return id;
    }

    @Override
    public int changeAge(int newAge) {
        this.age = newAge;
        return newAge;

    }

    //A method that shows customer's payments.
    void getAllPayments() {
        System.out.println("All payments are: ");
        for (int i = 0; i < this.payments.size(); i++) {
            if (this.payments.get(i) == null) {
                continue;
            } else {
                System.out.println((i + 1) + "- " + payments.get(i));
            }
        }
    }

    //A method that sums customer's payments.
    void getTotalPayment() {
        int total = 0;
        for (int payments : payments) {
            total += payments;

        }
        System.out.println("Total payments spent: " + total);
    }

    //A method that shows customer's purchased estates.
    void getPurchasedEstates() {
        System.out.println("Purchased estates are: ");
        for (int i = 0; i < this.purchasedrealestates.size(); i++) {
            if (this.purchasedrealestates.get(i) == null) {
                continue;
            } else {
                System.out.println((i + 1) + "- " + purchasedrealestates.get(i).name);
            }
        }
    }

    //A method that shows customer's rented estates.
    void getRentedEstates() {
        System.out.println("Rented estates are: ");
        for (int i = 0; i < this.rentedrealestates.size(); i++) {
            if (this.rentedrealestates.get(i) == null) {
                continue;
            } else {
                System.out.println((i + 1) + "- " + rentedrealestates.get(i).name);
            }
        }
    }

}
