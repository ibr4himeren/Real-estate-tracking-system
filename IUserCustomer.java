package com.mycompany.finallab;

/**
 *
 * @author ieren
 */
public interface IUserCustomer {

    String getUsername();

    int getId();

    int getAge();

    String getPhoneNumber();

    void changeUsername(String newUsername);

    int changeId(int newId);

    int changeAge(int newNumber);

    void changePhoneNumber(String newNumber);

}
