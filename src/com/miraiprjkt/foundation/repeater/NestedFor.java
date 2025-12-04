package com.miraiprjkt.foundation.repeater;

import java.util.Scanner;

public class NestedFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        // Notes
        // Bagaimana cara bintang ini bekerja?
        // Intinya perulangan pertama dijalankan dulu, anggap saja i = 0
        // Karena 0 adalah index-1 maka perulangan kedua akan mencetak satu bintang, setelahnya baru new line
        // Begitu seterusnya sampe i < 5 = 4 yang mana 4 adalah index-5

        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // Bagaimana dengan segitiga siku siku bintang terbalik?
        for (int i = a; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        scanner.close();
    }
}
