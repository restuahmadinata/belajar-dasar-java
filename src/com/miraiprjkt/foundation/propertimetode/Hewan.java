package com.miraiprjkt.foundation.propertimetode;

public class Hewan {
    double tinggi = 30;
    double berat = 3;
    int umur;

    Hewan(int umur) {
        this.umur = umur;
    }

    void lari() {
        System.out.println("Hewan ini lagi lari...");
    }

    void jalan() {
        System.out.println("Hewan ini lagi jalan...");
    }

    void makan() {
        System.out.println("Hewan ini lagi makan...");
    }

    double getBerat() {
        return berat;
    }

    double getTinggi() {
        return tinggi;
    }

    double getUmur() {
        return umur;
    }
}
