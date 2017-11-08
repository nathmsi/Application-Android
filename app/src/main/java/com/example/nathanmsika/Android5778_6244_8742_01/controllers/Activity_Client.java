package com.example.nathanmsika.Android5778_6244_8742_01.controllers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.nathanmsika.Android5778_6244_8742_01.model.datasource.DataBaseHelper;
import com.example.nathanmsika.my_navigation_drawer.R;

/**
 * Created by nathanmsika on 08/11/2017.
 */

public class Activity_Client extends AppCompatActivity{

    DataBaseHelper myDb;
    EditText txtName , txtSurName , txtMarks;
    Button btnClick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);

        myDb = new DataBaseHelper(this);
        txtName = (EditText) findViewById(R.id.idName);
        txtSurName = (EditText) findViewById(R.id.idSurname);
        txtMarks = (EditText) findViewById(R.id.idMarks);
        btnClick = (Button) findViewById(R.id.idBtn);

        btnClick.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                ClickMe();
            }
        });


    }

    private void ClickMe() {

        try {
            String name = txtName.getText().toString();
            String surname = txtSurName.getText().toString();
            String marks = txtMarks.getText().toString();


            Boolean result = myDb.insertData(name, surname, marks);

            if (result == true)
                Toast.makeText(this, "Data Inserted Successfully", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Daa Inserted Failed", Toast.LENGTH_SHORT).show();
        }
        catch (Exception ex)
        {
            Log.d("APP","error: " + ex.getMessage());
        }
    }

}
