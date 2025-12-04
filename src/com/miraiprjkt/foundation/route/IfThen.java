package com.miraiprjkt.foundation.route;

public class IfThen {
    public static void main(String[] args) {
        boolean isOn = false;

        // Kalo yang mau dieksekusi cuma 1 line saja, ga perlu pake curly braces
        if (isOn) // dieksekusi kalo true
            System.out.println("Nyalain lampu");

        // Beda lagi kalo >1 line, harus pake curly braces
        if (!isOn) { // dieksekusi kalo false
            System.out.println("Lampu 1 hadir");
            System.out.println("Lampu 2 hadir");
        }

    }
}
