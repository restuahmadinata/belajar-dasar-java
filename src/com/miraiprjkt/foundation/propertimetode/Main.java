package com.miraiprjkt.foundation.propertimetode;

public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan(69);
        kucing.makan();
        kucing.jalan();
        kucing.lari();

        System.out.println("Umurnya " + kucing.getUmur());
        
        double bmi = kucing.getBerat() / (kucing.getTinggi() * 0.01) * (kucing.getTinggi() * 0.01);
        System.out.println("indeks massa tubuh hewan ini adalah: " + bmi);
    }
}
