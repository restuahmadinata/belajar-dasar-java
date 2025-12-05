package com.miraiprjkt.foundation.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args) {
        // array
        String[] heroes = new String[2];
        heroes[0] = "Blonde Blazer";
        heroes[1] = "Mecha Man";
        // heroes[2] = "Phenomaman"; // Array cuma max 2
        

        // ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");

        System.out.println("List Planet Awal");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }

        planets.remove("Earth");


        System.out.println("List Planet Akhir");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }


    }
    
}
