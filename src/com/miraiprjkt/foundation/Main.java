package com.miraiprjkt.foundation;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import com.miraiprjkt.foundation.anisong.*;
import com.miraiprjkt.foundation.waifu.Mirai;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mirai Kuriyama istri gwej");
        Mirai.FamousQuote();

        Daisy.intro();
        WatchMe.intro();

        Date today = new Date();
        System.out.println("Hari ini: " + today);

        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok: " + tomorrow);
        
        char[] miraiChars = {'M', 'I', 'R', 'A', 'I'};
        String miraiString = new String(miraiChars);
        // int length = miraiString.length();
        // char firstChar = miraiString.charAt(0);
        boolean containM = miraiString.equals("MIRAI");
        System.out.println(containM);
    }
}