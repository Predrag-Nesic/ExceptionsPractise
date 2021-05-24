package com.company;

public class Izuzetak extends Exception {
    private String string;

    public Izuzetak() {

    }

    public Izuzetak(String message) {
        super(message);
        string = message;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "Izuzetak{" +
                "string='" + string + '\'' +
                '}';
    }
}
