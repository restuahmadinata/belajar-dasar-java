package com.miraiprjkt.foundation.suhuair;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args) {
        System.out.println("Ngukur suhu air kita rek woilah");

        int suhu;

        System.out.println("Masukkin angka suhunya bang: ");
        Scanner scanner = new Scanner(System.in);
        suhu = scanner.nextInt();

        if (suhu <= 0) {
            System.out.println(suhu + "°C? Dingin banget njir");
        } else if (suhu > 0 && suhu < 100) {
            System.out.println(suhu +"°C? Oke sih hangat hangat gitu");
        } else {
            System.out.println(suhu + "°C? Aw hell nah, panas bet anjerrrr!!!!");
        }

        scanner.close();
    }
}
