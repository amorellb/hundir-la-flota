package com.jaume.penjat;

public class Tauler {
    private Integer intents;
    private String paraulaSecreta;

    /*
     * Constructors
     * */
    // Constructor vacío
    public Tauler() {
    }
    // Constructor
    public Tauler(Integer intents, String paraulaSecreta) {
        this.intents = intents;
        this.paraulaSecreta = paraulaSecreta;
    }

    /*
    * Getters y Setters
    * */
    // Getters
    public Integer getIntents() {
        return intents;
    }
    public String getParaulaSecreta() {
        return paraulaSecreta;
    }
    // Setters
    public void setIntents(Integer intents) {
        this.intents = intents;
    }
    public void setParaulaSecreta(String paraulaSecreta) {
        this.paraulaSecreta = paraulaSecreta;
    }

    /*
    * Methods
    * */
    // Método inicialitzarPartida
    public inicialitzarPartida(String paraula, Integer nombreLletres) {

    }
}
