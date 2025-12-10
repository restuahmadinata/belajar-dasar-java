package com.miraiprjkt.foundation.datetime;

import java.util.Calendar;

public class ExampleSplitCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Sekarang tanggal " + calendar.getTime());
        System.out.println("Tanggal " + calendar.get(Calendar.DATE));
        System.out.println("Bulan " + calendar.get(Calendar.MONTH));
        System.out.println("Tahun " + calendar.get(Calendar.YEAR));
    }
}
