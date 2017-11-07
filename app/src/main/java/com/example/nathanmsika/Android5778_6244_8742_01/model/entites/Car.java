package com.example.nathanmsika.Android5778_6244_8742_01.model.entites;

/**
 * Created by samuel on 02-Nov-17.
 */
public class Car {
    protected int branchParkNumber;
    protected float km;
    protected String carNumber;
    protected char _class;

    public Car(int branchParkNumber, float km, String carNumber, char _class) {
        this.branchParkNumber = branchParkNumber;
        this.km = km;
        this.carNumber = carNumber;
        this._class = _class;
    }

    @Override
    public String toString() {
        return "Car -->" + "\n" +
                "branchParkNumber=" + branchParkNumber + "\n" +
                "km=" + km + "\n" +
                "carNumber='" + carNumber + "\n" +
                "class=" + _class
                ;
    }

    public int getBranchParkNumber() {
        return branchParkNumber;
    }

    public void setBranchParkNumber(int branchParkNumber) {
        this.branchParkNumber = branchParkNumber;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public char get_class() {
        return _class;
    }

    public void set_class(char _class) {
        this._class = _class;
    }

}
