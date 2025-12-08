package com.miraiprjkt.foundation.accessmodifier.package3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nilainya adalah: " + Perhitungan.nilai);

        for (int i = 0; i < 69; i++) {
            new Perhitungan();
        }

        System.out.println("Sampai perhitungan: " + Perhitungan.nilai);
        System.out.println("Nilai dari getNilai adalah: " + Perhitungan.getNilai());
    }
}
