package com.sdajava.listaexample;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Koty> kotyList = new ArrayList<Koty>();

        Koty k1 = new Koty("asd", "asfa");
        Koty k2 = new Koty("asva", "asfaf");

        kotyList.add(k1);
        kotyList.add(k2);

        Process process = new Process(kotyList);


        process.getKoty().get(0).getCos();

        Inna inna = new Inna(process);
        inna.setList(process.getKoty());



	// write your code here
    }
}
