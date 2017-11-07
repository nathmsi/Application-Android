package com.example.nathanmsika.Android5778_6244_8742_01.model.constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nathanmsika on 05/11/2017.
 */

public class KeyValues {

    public String s1;
    public String p1;

    public List<KeyValues> lst;

    public static String KEY1 = "main.user.name" ;
    public static String VALUE1 = "ITAMAR LACHMAN" ;

    public static String VALUE_USER = "nathan" ;
    public static String VALUE_PASSWORD = "321" ;

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public KeyValues()
    {
       lst = new ArrayList<>();
    }


    void add(KeyValues k){
        lst.add(k);
    }


}
