package com.company;

public class Main {

    public static void main(String[] args) {

        try {
            int a = 7;
            int b = (int)(2 * Math.random());
            System.out.println(a / b);

            Klasa[] k = new Klasa[5];
            k[1] = new Klasa("1");
            k[3] = new Klasa("3");
            if(k[(int)(5 * Math.random())] == null) {
                throw new Izuzetak2("Greska u null pokazivacu");
            }
            int[] niz = new int[2];
            if(b == 1) {
                throw new Izuzetak("Greska u dimenziji niza.");
            }

            niz[b + 1] = 9;
        } catch (Izuzetak i) {
            System.err.println(i);
        } catch (Exception ex) {
            System.err.println(ex);
        }

        Klasa k = new Klasa("1");
        Klasa k2 = new Klasa("1");
        System.out.println(k);
        System.out.println(k2);

        if(k.equals(k2)) {
            System.out.println("Objekti ukazuju na iste vrednosti");
        } else {
            System.out.println("Objekti ne ukazuju na iste vrednosti");
        }

        String s = "Leto";
        String s2 = "Leto";

        if(s.equals(s2)) {
            System.out.println("Stringovi ukazuju na iste vrednosti");
        } else {
            System.out.println("Stringovi ne ukazuju na iste vrednosti");
        }
    }
}
