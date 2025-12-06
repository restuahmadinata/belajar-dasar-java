package com.miraiprjkt.foundation.objek;

public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Kucing");
        Hewan arelio = new Hewan("Arelio");

        kucing.beratHewan(2);
        kucing.jumlahKakiHewan(4);
        kucing.cetakHewan();

        System.out.println();

        arelio.beratHewan(69);
        arelio.jumlahKakiHewan(100);
        arelio.cetakHewan();
    }
}
