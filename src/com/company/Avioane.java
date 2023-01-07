package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Avioane {

   String nume;
   String nr_avion;
   String plecare;
   String sosire;
   String ora_plecare;
   String ora_sosire;

   public Avioane(){}
    public Avioane(String nume, String nr_avion, String plecare, String sosire, String ora_plecare, String ora_sosire) {
        this.nume = nume;
        this.nr_avion = nr_avion;
        this.plecare = plecare;
        this.sosire = sosire;
        this.ora_plecare = ora_plecare;
        this.ora_sosire = ora_sosire;
    }

    public String getNume(){return nume;}
    public String getNr_avion(){return nr_avion;}
    public String getPlecare(){return plecare;}
    public String getSosire(){return sosire;}
    public String getOra_plecare(){return ora_plecare;}
    public String getOra_sosire(){return ora_sosire;}

    public void setNume(String numee){this.nume=numee;}
    public void setNr_avion(String nr){this.nr_avion=nr;}
    public void setPlecare(String plecare1){this.plecare=plecare1;}
    public void setSosire(String sosire1){this.sosire=sosire1;}
    public void setOra_plecare(String ora){this.ora_plecare=ora;}
    public void setOra_sosire(String sossire){this.ora_sosire=sossire;}


    public void duratazbor(String ora_plecare,String ora_sosire){
        String[] plecare = ora_plecare.split(":");
        String[] sosire = ora_sosire.split(":");
        int[] plecare_int=new int[3];
        int[] sosire_int= new int[3];
        for(int i=0;i<plecare.length;i++)
        {   plecare_int[i]=Integer.parseInt(plecare[i]);
            sosire_int[i]=Integer.parseInt(sosire[i]);
        }
        int ore,minute,secunde;
         ore=sosire_int[0]-plecare_int[0];
         minute=sosire_int[1]-plecare_int[1];
        secunde=sosire_int[2]-plecare_int[2];
        if(secunde<0)
        {
            minute--;
            secunde=secunde+60;
        }
        if(minute<0)
        {
            ore--;
            minute=minute+60;
        }
        if(ore<0)
            System.out.println("Orele nu sunt puse in ordine.");

        else
           System.out.println("Durata zborului este de " + ore +" ore, " + minute + " minute, " + secunde + " secunde.");
    }


       @Override
    public String toString() {
        return "Avioane{" +
                "nume='" + nume + '\'' +
                ", nr_avion='" + nr_avion + '\'' +
                ", plecare='" + plecare + '\'' +
                ", sosire='" + sosire + '\'' +
                ", ora_plecare='" + ora_plecare + '\'' +
                ", ora_sosire='" + ora_sosire + '\'' +
                '}';
    }

}
