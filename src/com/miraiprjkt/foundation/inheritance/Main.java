package com.miraiprjkt.foundation.inheritance;

public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();

        System.out.println(hewan instanceof Object);
        System.out.println(hewan instanceof Hewan);
        System.out.println(hewan instanceof Kucing);

        System.out.println("------------------");

        Kucing kucing = new Kucing();
        System.out.println(kucing instanceof Object);
        System.out.println(kucing instanceof Hewan);
        System.out.println(kucing instanceof Kucing);

        System.out.println("------------------");

        hewan.makan();
        kucing.makan();
        kucing.makan("daging Megalodon");

        System.out.println("------------------");

        Kucing meow = new Kucing("Ocicat", "tropis");
        Kucing puss = new Kucing("Ocicat", "subtropis");
        Kucing popo = new Kucing("Anggora", "subtropis");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("meow equals puss? " + meow.equals(puss));
        System.out.println("meow equals popo? " + meow.equals(popo));


        System.out.println("------------------");

        Object o = new Kucing();
        Hewan h = new Kucing();
        Kucing k = new Kucing();

        // o.makan(); error njir
        h.makan();
        k.makan();

        Object object = k;
        Hewan hewanK = k;

        // object.makan(); error juga bg
        hewanK.makan();

        Kucing kucingK = (Kucing) h;
        kucingK.makan();

        Hewan harimau = new Hewan();
        Kucing anggora = (Kucing) harimau;

        Mamalia mamalia = new Kucing();

    }
}
