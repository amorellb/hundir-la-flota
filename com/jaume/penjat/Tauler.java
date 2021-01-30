package com.jaume.penjat;

public class Tauler {
    private Integer intents;

    /*
     * Constructores
     * */
    // Constructor vacío
    public Tauler() {
    }
    // Constructor
    public Tauler(Integer intents) {
        this.intents = intents;
    }

    /*
    * Getters y Setters
    * */
    // Getter
    public Integer getIntents() {
        return intents;
    }
    // Setter
    public void setIntents(Integer intents) {
        this.intents = intents;
    }
}
