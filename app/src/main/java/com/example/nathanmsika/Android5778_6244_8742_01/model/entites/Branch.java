package com.example.nathanmsika.Android5778_6244_8742_01.model.entites;

/**
 * Created by samuel on 02-Nov-17.
 */
public class Branch {
    protected Address _address;
    protected int parkplace;
    protected int branchNumber;


    public Branch(Address _address, int parkplace, int branchNumber) {
        this._address = _address;
        this.parkplace = parkplace;
        this.branchNumber = branchNumber;
    }

    public Address get_address() {
        return _address;
    }

    public void set_address(Address _address) {
        this._address = _address;
    }


    public int getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(int branchNumber) {
        this.branchNumber = branchNumber;
    }

    public int getParkplace() {
        return parkplace;
    }

    public void setParkplace(int parkplace) {
        this.parkplace = parkplace;
    }
}
