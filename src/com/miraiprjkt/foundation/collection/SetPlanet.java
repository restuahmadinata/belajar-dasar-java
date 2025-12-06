package com.miraiprjkt.foundation.collection;

import java.util.HashSet;
import java.util.Set;

public class SetPlanet {
    public static void main(String[] args) {
        Set<String> planets = new HashSet<>();

        planets.add("Mercury");        
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Earth");
        planets.add("Earth");
        planets.add("Mars");

        System.out.println("Set planets awal: (size = " + planets.size() + ")" );
        for (String planet : planets) {
            System.out.println("\t" + planet);
        }

        planets.remove("Earth");

        System.out.println("Set planets akhir: (size = " + planets.size() + ")");
        for (String planet : planets) {
            System.out.println("\t" + planet);
        }

    }
}
