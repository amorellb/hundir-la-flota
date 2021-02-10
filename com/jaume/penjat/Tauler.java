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
        this.intentsInicials = intentsInicials;
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
        if (lletra.length() > 1) {
            return "Lletra incorrecte";
        } else {
            boolean exist = false;
            for (int i = 0; i < this.paraulaSecreta.length; i++) {
                if (Character.toString(this.paraulaSecreta[i]).equals(lletra)) {
                    exist = true;
                    this.palabraEndevinada[i] = lletra;
                }
            }
            if (!exist) {
                intents--;
            }
            return "";
        }
    }

    // Método imprimir
    public String imprimir() {
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

    // Método imprimirVides
    public String imprimirVides() {
        if (this.intents > 1) {
            return "Et queden " + this.intents + " vides de " + this.intentsInicials;
        }
        return "Et queda " + this.intents + " vida de " + this.intentsInicials;
    }

    // Método hasGuanyat
    public Boolean hasGuanyat() {
        /*String palabra = "";
        String palabradeloscojones = "";
        for (Character letra : paraulaSecreta) {
            palabradeloscojones = palabra.concat(letra.toString());
        }
        if (String.join("", palabraEndevinada).equals(palabradeloscojones)) {
            System.out.println(palabra);
            System.out.println(palabradeloscojones);
            return true;
        }
        System.out.println("palabra " + palabra);
        System.out.println("palabradeloscojones " + palabradeloscojones);
        return false;*/

        if (String.valueOf(paraulaSecreta).equals(String.join("", palabraEndevinada))) {
            return true;
        }
        return false;
    }

}

