package com.jaume.penjat;

import com.sun.jdi.CharType;

public class Tauler {


    public String imprimirVides() {

        //int intents= Integer.parseInt(intents);//convertir intents de String a número para poder hacer intents-1
        if (intents == 0) {
            System.out.println("No et queden intents")
        } ;
        if (verificar() == "Lletra incorrecte") {
            intents = intents - 1;
            return intents;
        } else {
            return "Et queden " + intents + " vides de " + intents;//hay que diferencia intents inicial con intents-1
        }

    }


    public Boolean hasGuanyat() {

        if (String.join("", palabraEndevinada).equals(String.valueOf(paraulaSecreta))) {//String.valueOf(paraulaSecreta)? Character.toString(paraulaSecreta)
            return true;
        }
        return false;
    }

}


