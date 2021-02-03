package com.jaume.penjat;

import java.util.Arrays;

public class Tauler {
    private Integer intents;
    private char[] paraulaSecreta;
    private String[] palabraEndevinada;

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
        for (char word : paraulaSecreta) {
            if (Character.toString(word).equals(lletra))
                return lletra;
        }
        return "Lletra incorrecte";
    }

    // Método imprimir
    public String imprimir() {
        for (int i = 0; i < paraulaSecreta.length; i++) {
            if (Character.toString(paraulaSecreta[i]).equals(" ")) {
                palabraEndevinada[i] = " ";
            } else {
                palabraEndevinada[i] = "_";
            }
        }
        return Arrays.toString(palabraEndevinada);
    }
}
