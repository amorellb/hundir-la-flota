package com.jaume.penjat;

public class Tauler {
    private Integer intents;
    private char[] paraulaSecreta;

    /*
     * Constructors
     * */
    // Constructor vacío
    public Tauler() {
    }
    // Constructor
    public Tauler(Integer intents, char[] paraulaSecreta) {
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
    public char[] getParaulaSecreta() {
        return paraulaSecreta;
    }
    // Setters
    public void setIntents(Integer intents) {
        this.intents = intents;
    }
    public void setParaulaSecreta(char[] paraulaSecreta) {
        this.paraulaSecreta = paraulaSecreta;
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
        for (char word : paraulaSecreta) {
            if (Character.toString(word).equals(lletra))
            return lletra;
        }
        return "Lletra incorrecte";
    }
}
