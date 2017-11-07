package com.example.nathanmsika.Android5778_6244_8742_01.model.backend;

import com.example.nathanmsika.Android5778_6244_8742_01.model.entites.Branch;
import com.example.nathanmsika.Android5778_6244_8742_01.model.entites.Car;
import com.example.nathanmsika.Android5778_6244_8742_01.model.entites.Client;
import com.example.nathanmsika.Android5778_6244_8742_01.model.datasource.Datasource;
import com.example.nathanmsika.Android5778_6244_8742_01.model.entites.Models;
import com.example.nathanmsika.Android5778_6244_8742_01.model.entites.gearbox;

import java.util.List;

/**
 * Created by nathanmsika on 03/11/2017.
 */

public  class Backend implements Ibackend {

   private Datasource DR;




    public void init()
    {
        this.addcar(new Car(1,12,"3323jj",'A') );
        this.addcar(new Car(1,12,"3323jj",'b') );
        this.addcar(new Car(1,12,"3323jj",'c') );
        this.addcar(new Car(1,12,"3323jj",'d') );



        this.addclient(new Client("nathan",333846244,"0584838662","nathanmsika@gmail.com",1232456));
        this.addclient(new Client("nathan",333846244,"0584838662","nathanmsika@gmail.com",1232456));
        this.addclient(new Client("nathan",333846244,"0584838662","nathanmsika@gmail.com",1232456));
        this.addclient(new Client("nathan",333846244,"0584838662","nathanmsika@gmail.com",1232456));

        this.addmodel(new Models("Mercedes","Class A","",2, gearbox.AUTOMATIC ,5,5,true,true,true));
        this.addmodel(new Models("Mercedes","Class B","",2, gearbox.MANUAL ,5,5,true,true,true));
        this.addmodel(new Models("Mercedes","Class C","",2, gearbox.MANUAL ,3,3,true,false,true));
        this.addmodel(new Models("Mercedes","Class D","",2, gearbox.AUTOMATIC ,3,3,true,true,false));


    }

    public boolean check_exist_list(){
        return (DR.list_client.size()==0 && DR.list_branch.size()==0 && DR.list_models.size()==0 && DR.list_car.size()==0);
    }

    public boolean check_exist_client(Client c) {
        return DR.list_client.contains(c);
    }


    public void addclient(Client c) {
        DR.list_client.add(c);
    }


    public void addmodel(Models m) {
        DR.list_models.add(m);
    }


    public void addcar(Car c) {
        DR.list_car.add(c);
    }


    public List<Models> allmodels() {
        return DR.list_models;
    }


    public List<Client> allclient() {
        return DR.list_client;
    }


    public List<Branch> allbranch() {
        return DR.list_branch;
    }


    public List<Car> allcars() {
        return DR.list_car;
    }
}
