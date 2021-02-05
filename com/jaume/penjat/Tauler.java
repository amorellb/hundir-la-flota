package com.jaume.penjat;



public class Tauler {
    private Integer intents;
    private char[] paraulaSecreta;
    private String[] palabraEndevinada; // Només permet declarar l'array amb un tamany definit

    /*
     * Constructors
     * */
    // Constructor vacío
    public Tauler() {
    }

    // Constructor
    public Tauler(Integer intents, char[] paraulaSecreta, String[] palabraEndevinada) {
        this.intents = intents;
        this.paraulaSecreta = paraulaSecreta;
        this.palabraEndevinada = palabraEndevinada;
    }

    /*
     * Getters y Setters
     * */
    // Getters
    public Integer getIntents() {
        return intents;
    }

    public char[] getParaulaSecreta() {
        return paraulaSecreta;
    }

    public String[] getPalabraEndevinada() {
        return palabraEndevinada;
    }

    // Setters
    public void setIntents(Integer intents) {
        this.intents = intents;
    }

    public void setParaulaSecreta(char[] paraulaSecreta) {
        this.paraulaSecreta = paraulaSecreta;
    }

    public void setPalabraEndevinada(String[] palabraEndevinada) {
        this.palabraEndevinada = palabraEndevinada;
    }

    /*
     * Methods
     * */
    // Método inicialitzarPartida
    public void inicialitzarPartida(String paraula, Integer vides) {
        char[] words = paraula.toCharArray();
        setParaulaSecreta(words);
        setIntents(vides);
    }

    // Método verificar
    public String verificar(String lletra) {
        this.palabraEndevinada = new String[this.paraulaSecreta.length];
        for (int i = 0; i < this.paraulaSecreta.length; i++) {
            if (Character.toString(this.paraulaSecreta[i]).equals(lletra)) {
                this.palabraEndevinada[i] = lletra;
            } else if (!Character.toString(this.paraulaSecreta[i]).equals(lletra)) {
                this.palabraEndevinada[i] = null;
            }
        }
        this.intents--;
        return "Lletra incorrecte";
    }

    // Método imprimir
    public String imprimir() {
        this.palabraEndevinada = new String[this.paraulaSecreta.length];
        for (int i = 0; i < this.paraulaSecreta.length; i++) {
            if (Character.toString(this.paraulaSecreta[i]).equals(" ")) {
                this.palabraEndevinada[i] = " ";
            } else {
                this.palabraEndevinada[i] = "_";
            }
        }
//Arrays.toString(this.palabraEndevinada)
        String palabra= String.join("",this.palabraEndevinada);
        return palabra;

    }

    public String imprimirVides() {

        //int intents= Integer.parseInt(intents);//convertir intents de String a número para poder hacer intents-1
        if (intents == 0) {
            System.out.println("No et queden intents");
        }
        ;
        if (verificar("") == "Lletra incorrecte") {
            intents = intents - 1;
            return Integer.toString(intents);
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

