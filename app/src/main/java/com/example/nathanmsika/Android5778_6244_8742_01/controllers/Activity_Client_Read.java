package com.example.nathanmsika.Android5778_6244_8742_01.controllers;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nathanmsika.Android5778_6244_8742_01.model.datasource.DataBaseHelper;
import com.example.nathanmsika.Android5778_6244_8742_01.model.entites.Car;
import com.example.nathanmsika.my_navigation_drawer.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nathanmsika on 08/11/2017.
 */

public class Activity_Client_Read extends AppCompatActivity {

    DataBaseHelper myDb;
    TextView txtResult;
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_read);


        myDb = new DataBaseHelper(this);
        txtResult = (TextView) findViewById(R.id.idResult);
        btnClick = (Button) findViewById(R.id.idBtn2);

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
            Cursor res = myDb.getAllData();
            StringBuffer stringBuffer = new StringBuffer();
            if(res!=null && res.getCount()>0) {
                while(res.moveToNext())
                {
                    stringBuffer.append("Id: "+res.getString(0) + "\n");
                    stringBuffer.append("Name: "+res.getString(1) + "\n");
                    stringBuffer.append("Surname: "+res.getString(2) + "\n");
                    stringBuffer.append("Marks: "+res.getString(3) + "\n");
                }
                txtResult.setText(stringBuffer.toString());
                Toast.makeText(this, "Data Retrieved Successfully", Toast.LENGTH_SHORT).show();
            }
            else
                Toast.makeText(this, "No Data Retrieve", Toast.LENGTH_SHORT).show();

        }
        catch (Exception ex)
        {
            Log.d("APP","error: " + ex.getMessage());
        }


    }

}
