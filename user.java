package com.mycompany.finallab;

import java.util.Scanner;

/**
 *
 * @author ieren
 */
public class User implements IUserCustomer {

    public static void main(String[] args) {
        Scanner User = new Scanner(System.in);
        System.out.println("Enter username:");
        String Username1 = User.nextLine();

        Scanner password = new Scanner(System.in);
        String password1;
        do {
            System.out.println("Enter Password: ");
            password1 = User.nextLine();
            if (!password1.equals("ali123")) {
                System.out.println("incorrect password. Try again. ");
            }

        } while (!password1.equals("ali123"));
        System.out.println("Welcome:" + Username1);

    }
    String Username, phoneNumber;
    int id, age;

    public User(String Username, String phoneNumber, int id, int age) {
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
        this.Username = newUsername;
    }

    @Override
    public int changeId(int newId) {
        this.id = newId;
        return newId;
    }

    @Override
    public int changeAge(int newAge) {
        this.age = newAge;
        return newAge;
    }

}
