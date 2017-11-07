package com.example.nathanmsika.Android5778_6244_8742_01.controllers;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.nathanmsika.Android5778_6244_8742_01.controllers.MainActivity;
import com.example.nathanmsika.Android5778_6244_8742_01.model.backend.Backend;
import com.example.nathanmsika.Android5778_6244_8742_01.model.backend.Factoty_method;
import com.example.nathanmsika.Android5778_6244_8742_01.model.entites.Branch;
import com.example.nathanmsika.Android5778_6244_8742_01.model.entites.Car;
import com.example.nathanmsika.Android5778_6244_8742_01.model.entites.Client;
import com.example.nathanmsika.Android5778_6244_8742_01.model.entites.Models;
import com.example.nathanmsika.my_navigation_drawer.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nathanmsika on 05/11/2017.
 */

public class Activity_list extends Activity {

    ListView liste = null;

    Backend bk ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_all);
        liste = (ListView) findViewById(R.id.listView);

        bk = Factoty_method.getInstance();
        if (bk.check_exist_list())
        {
            bk.init();
        }

        Button b_cars = (Button) findViewById(R.id.button1);
        Button b_Client = (Button) findViewById(R.id.button2);
        Button b_Branch = (Button) findViewById(R.id.button3);
        Button b_Models = (Button) findViewById(R.id.button4);


       // b_Branch.setBackgroundColor("#60efd3");
      //  b_Client.setBackgroundColor(Color.BLUE);
       // b_cars.setBackgroundColor(Color.BLUE);
       // b_Models.setBackgroundColor(Color.BLUE);

        b_cars.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) {f1();}});

        b_Client.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) {f2();}});

        b_Branch.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) {f3();}});

        b_Models.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) {f4();}});

    }


    public void f1()
    {
        try {

            List<Car> exemple = new ArrayList<Car>();
            exemple = bk.allcars();
            ArrayAdapter<Car> adapter = new ArrayAdapter<Car>(this , android.R.layout.simple_list_item_1, exemple);
            liste.setAdapter(adapter);

        }
        catch(Exception ex){
            Log.d("APP","error: " + ex.getMessage());
        }
    }

    public void f2()
    {
        try {

            List<Client> exemple = new ArrayList<Client>();
            exemple = bk.allclient();
            ArrayAdapter<Client> adapter = new ArrayAdapter<Client> (this , android.R.layout.simple_list_item_1, exemple);
            liste.setAdapter(adapter);

        }
        catch(Exception ex){
            Log.d("APP","error: " + ex.getMessage());
        }
    }


    public void f3()
    {
        try {

            List<Branch> exemple = new ArrayList<Branch>();
            exemple = bk.allbranch();
            ArrayAdapter<Branch> adapter = new ArrayAdapter<Branch>(this , android.R.layout.simple_list_item_1, exemple);
            liste.setAdapter(adapter);

        }
        catch(Exception ex){
            Log.d("APP","error: " + ex.getMessage());
        }
    }

    public void f4()
    {
        try {

            List<Models> exemple = new ArrayList<Models>();
            exemple = bk.allmodels();
            ArrayAdapter<Models> adapter = new ArrayAdapter<Models>(this , android.R.layout.simple_list_item_1, exemple);
            liste.setAdapter(adapter);

        }
        catch(Exception ex){
            Log.d("APP","error: " + ex.getMessage());
        }
    }



    public void btnClick2 (View v)
    {
        //  Toast.makeText(this,"שלום",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,MainActivity2.class);
        startActivity(i);
        finish();

    }

}