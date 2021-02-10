package com.jaume.penjat;

public class Tauler {
    private Integer intents;
    private Integer intentsInicials;
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

    public Integer getIntentsInicials() {
        return intentsInicials;
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

    private void setIntentsInicials(Integer intentsInicials) {
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
        setIntentsInicials(vides);
        setPalabraEndevinada(new String[paraula.length()]);
    }

    // Método verificar
    public String verificar(String lletra) {
        for (int i = 0; i < this.paraulaSecreta.length; i++) {
            if (Character.toString(this.paraulaSecreta[i]).equals(lletra)) {
                this.palabraEndevinada[i] = lletra;
            } else if (!Character.toString(this.paraulaSecreta[i]).equals(lletra)) {
                this.palabraEndevinada[i] = null;
            }
        }
        intents--;
        return "Lletra incorrecte";
    }

    // Método imprimir
    public String imprimir() {
        /*String[] arrayPalabra = new String[this.paraulaSecreta.length];
        for (int i = 0; i < this.paraulaSecreta.length; i++) {
            if (this.palabraEndevinada[i] == null) {
                arrayPalabra[i] = "_";
            } else if (this.palabraEndevinada[i].equals(" ")) {
                arrayPalabra[i] = " ";
            } else if (this.palabraEndevinada[i].equals(paraulaSecreta[i])) {
                arrayPalabra[i] = palabraEndevinada[i];
            }
        }*/
        String palabra = "";
        for (int i = 0; i < this.paraulaSecreta.length; i++) {
            if (this.palabraEndevinada[i] == null) {
                palabra = palabra + "_";
            } else if (this.palabraEndevinada[i].equals(" ")) {
                palabra = palabra + " ";
            } else if (this.palabraEndevinada[i].equals(Character.toString(paraulaSecreta[i]))) {
                palabra = palabra + palabraEndevinada[i];
            }
        }
        return palabra;
    }

    public String imprimirVides() {
            return "Et queden " + this.intents + " vides de " + this.intentsInicials;
    }


    public Boolean hasGuanyat() {

        if (String.join("", palabraEndevinada).equals(String.valueOf(paraulaSecreta))) {//String.valueOf(paraulaSecreta)? Character.toString(paraulaSecreta)
            return true;
        }
        return false;
    }

}

