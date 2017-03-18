package com.sdajava.listaexample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukas on 18.03.2017.
 */
public class Process {

    public List<Koty> koty = new ArrayList<Koty>();

    public Process(List<Koty> koty) {
        this.koty = koty;
    }

    public void showCats(){
        koty.forEach(s -> s.getCos());
    }

    public List<Koty> getKoty() {
        return koty;
    }

    public void setKoty(List<Koty> koty) {
        this.koty = koty;
    }
}
