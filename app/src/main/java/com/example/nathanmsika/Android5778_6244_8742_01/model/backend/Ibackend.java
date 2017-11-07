package com.example.nathanmsika.Android5778_6244_8742_01.model.backend;

import com.example.nathanmsika.Android5778_6244_8742_01.model.entites.Branch;
import com.example.nathanmsika.Android5778_6244_8742_01.model.entites.Client;
import com.example.nathanmsika.Android5778_6244_8742_01.model.entites.Car;
import com.example.nathanmsika.Android5778_6244_8742_01.model.entites.Models;

import java.util.List;

/**
 * Created by nathanmsika on 03/11/2017.
 */

public interface Ibackend {

    boolean check_exist_client(Client c);
    void addclient(Client c);
    void addmodel(Models m);
    void addcar(Car c);
    List<Models> allmodels();
    List<Client> allclient();
    List<Branch> allbranch();
    List<Car> allcars();
}
