package com.miraiprjkt.foundation.vokalkonsonan;

import java.util.Scanner;

public class VokalKonsonan {
    public static void main(String[] args) {

        int vokal = 0;
        int konsonan = 0;
        int spasi = 0;

        String word = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata kata: ");
        word = scanner.nextLine();


        vokal = jumlahVokal(word);
        konsonan = jumlahKonsonan(word);
        spasi = jumlahSpasi(word);

        System.out.println("Jumlah vokal: " + vokal);
        System.out.println("Jumlah konsonan: " + konsonan);
        System.out.println("Jumlah spasi: " + spasi);

        scanner.close();
        
    }

    private static int jumlahVokal(String word) {
        int i;
        int jumlah_vokal = 0;


        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'o') {
                jumlah_vokal++;
            }
        }
        return jumlah_vokal;
    }

    private static int jumlahKonsonan(String word) {
        int i;
        int jumlah_konsonan = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) != 'a' && word.charAt(i) != 'i' && word.charAt(i) != 'u' && word.charAt(i) != 'e' && word.charAt(i) != 'o' && word.charAt(i) != ' ') {
                jumlah_konsonan++;
            }
        }
        return jumlah_konsonan;
    }

    private static int jumlahSpasi(String word) {
        int i;
        int jumlah_spasi = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                jumlah_spasi++;
            }
        }
        return jumlah_spasi;
    }
}
