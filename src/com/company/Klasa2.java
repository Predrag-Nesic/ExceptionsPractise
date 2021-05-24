package com.company;

public class Klasa2 {
    public static void main(String[] args) {
//        Klasa k = new Klasa("123");
//        System.out.println(k.toString());
//        System.out.println(k);
//
//

        Klasa[] k = new Klasa[5];
        for(int i = 0; i < k.length; i++) {
            k[i] = new Klasa("Clan" + (i + 1));
            System.out.println(k[i].toString());
        }
    }
}
