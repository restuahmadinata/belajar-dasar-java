package com.miraiprjkt.foundation.bangundatar;

import java.util.Scanner;

public class Main {

    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        
        PersegiPanjang persegi1;
        SegitigaSiku segitiga1;
        Lingkaran lingkaran1;

        int s1, s2, r;

        persegi1 = new PersegiPanjang();
        segitiga1 = new SegitigaSiku();
        lingkaran1 = new Lingkaran();

        mainMenu();

        switch (pilihan) {
            case '1': {
                System.out.print("Masukan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang: " + persegi1.luas(s1, s2));
                System.out.println("Keliling persegi panjang: " + persegi1.keliling(s1, s2));
                break;
            }
            case '2': {
                System.out.print("Masukan alas segitiga siku: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan tinggi segitiga siku: ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitiga: " + segitiga1.luas(s1, s2));
                System.out.println("Keliling segitiga: " + segitiga1.keliling(s1, s2));
                break;
            }
            case '3': {
                System.out.print("Masukan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran: " + lingkaran1.luas(r));
                System.out.println("Keliling lingkaran: " + lingkaran1.keliling(r));
                break;
            }
            default: {
                System.out.println("tidak ada pilihan");
                break;
            }
        }

    }

    private static void mainMenu() {
        System.out.println("=======================");
        System.out.println("Hitung luas dan keliling");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan menu: ");
        pilihan = scanner.next().charAt(0);
    }
}
