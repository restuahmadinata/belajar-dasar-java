package com.miraiprjkt.foundation.route;

public class Switch {
    public static void main(String[] args) {
        int input = 1;

        switch (input) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Tidak termasuk angka 1 - 3");
                break;
        }
    }
}
