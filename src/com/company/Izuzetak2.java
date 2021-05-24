package com.company;

public class Izuzetak2 extends Exception {
    private String string;

    public Izuzetak2() {

    }

    public Izuzetak2(String message) {
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
        return "Izuzetak2{" +
                "string='" + string + '\'' +
                '}';
    }
}
