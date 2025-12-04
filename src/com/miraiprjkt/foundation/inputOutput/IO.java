package com.miraiprjkt.foundation.inputOutput;

import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Operasi Matematik Sederhana");

        System.out.println("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Masukkan operand: ");
        String operand = scanner.nextLine();

        System.out.println("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        int result = 0;
        switch (operand) {
            case "+":
                result = angka1 + angka2;
                System.out.println(result);
                break;
            default:
                System.out.println("apaan tuh");
                break;
        }

        scanner.close();
    }
}
