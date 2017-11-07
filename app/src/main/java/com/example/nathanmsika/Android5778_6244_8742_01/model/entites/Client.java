package com.example.nathanmsika.Android5778_6244_8742_01.model.entites;

/**
 * Created by samuel on 02-Nov-17.
 */
public class Client {
    protected String name;
    protected long ID;
    protected String phoneNumber;
    protected String emailAddress;
    protected long creditCardNumbers;

    public Client(String name, long ID, String phoneNumber, String emailAddress, long creditCardNumbers) {
        this.name = name;
        this.ID = ID;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.creditCardNumbers = creditCardNumbers;
    }

    @Override
    public String toString() {
        return "Client ->" +
                " name='" + name + "\n" +
                " ID =" + ID +
                " phoneNumber ='" + phoneNumber + "\n" +
                " emailAddress ='" + emailAddress + "\n" +
                " creditCardNumbers =" + creditCardNumbers
                ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public long getCreditCardNumbers() {
        return creditCardNumbers;
    }

    public void setCreditCardNumbers(long creditCardNumbers) {
        this.creditCardNumbers = creditCardNumbers;
    }
}
