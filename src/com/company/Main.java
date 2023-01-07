package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    Avioane avion=new Avioane("Ryan airlines","RA123","Budapesta","Bucuresti","10:25:33","9:24:32");
    avion.duratazbor(avion.getOra_plecare(),avion.getOra_sosire());


    HashMap<String,Avioane> testez = new HashMap<String,Avioane>();
    testez.put("Numeavion1",avion);
    testez.put("Numeavion2",new Avioane("Ryans ","BD123","Paris","Milano","13:22:54","15:34:12"));
    testez.put("Numeavion3",new Avioane("airlinez","CD123","Roma","Brasov","9:15:23","12:55:42"));
    Avioane avionas=testez.get("Numeavion2");
    avionas.duratazbor(avionas.getOra_plecare(),avionas.getOra_sosire());
    String sosire_avionas = avionas.getSosire();
        CautareAvionDupaSosire("12:55:42",testez);

    }

    public static void CautareAvionDupaSosire(String valoare, HashMap<String, Avioane> testez){
        Set<Map.Entry<String,Avioane>> testezSet = testez.entrySet();
        Avioane savedem=new Avioane();
        int gasit=0;
        for(Map.Entry<String,Avioane> pentru : testezSet)
        {      savedem=pentru.getValue();
            String cheie=savedem.getOra_sosire();
            if(cheie==valoare)
            { System.out.println("Avionul este:" +pentru.getKey());
                System.out.println("Detaliile avionului: " +pentru);
                gasit++;
            }
    }
        if(gasit==0)
            System.out.println("Ne pare rau, nu exista un avion cu sosirea la aceasta ora.");
    }
}

