package com.example.prac_03;

public class Country {
    private String name;
    private long population;

    public Country(String name, long population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }
}
