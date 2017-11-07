package com.example.nathanmsika.Android5778_6244_8742_01.controllers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by nathanmsika on 03/11/2017.
 */
import com.example.nathanmsika.my_navigation_drawer.R;

public class MainActivity2 extends AppCompatActivity {

    ListView mListView;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lst);

        Button submit = (Button) findViewById(R.id.button_cars);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Activity_list.class);
                startActivity(intent);
            }
        });



    }

    public void btnClick3 (View v)
    {
        //  Toast.makeText(this,"שלום",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }



}
