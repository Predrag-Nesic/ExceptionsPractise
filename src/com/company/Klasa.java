package com.company;

public class Klasa {
    private String ime;

    public Klasa(String ime) {
        this.ime = ime;
    }

    @Override
    public String toString() {
        return "Ovo je klasna metoda za ispis sa imenom " + ime;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.ime == ((Klasa)obj).ime;
    }
}
