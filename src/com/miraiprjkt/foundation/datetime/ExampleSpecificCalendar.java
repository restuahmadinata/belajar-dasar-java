package com.miraiprjkt.foundation.datetime;

import java.util.Calendar;

public class ExampleSpecificCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Waktu sekarang adalah " + calendar.getTime());
        
        calendar.add(Calendar.DATE, -69);
        System.out.println("69 hari yang lalu adalah " + calendar.getTime());

        calendar.add(Calendar.MONTH, 69);
        System.out.println("69 bulan kemudian adalah " + calendar.getTime());

        calendar.add(Calendar.YEAR, 69);
        System.out.println("69 tahun kemudian adalah " + calendar.getTime());
    }
}
