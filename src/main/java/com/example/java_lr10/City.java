package com.example.java_lr10;


public class City {
    String nameOfCity;
    String nameOfCountry;
    String coatOfArms;
    long countOfPeople;
    String description;

    public City(String nameOfCity, String nameOfCountry, String coatOfArms, long countOfPeople, String description) {
        this.nameOfCity = nameOfCity;
        this.nameOfCountry = nameOfCountry;
        this.coatOfArms = coatOfArms;
        this.countOfPeople = countOfPeople;
        this.description = description;
    }

    public String getNameOfCity() {
        return nameOfCity;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public String getCoatOfArms() {
        return coatOfArms;
    }

    public long getCountOfPeople() {
        return countOfPeople;
    }

    public String getDescription() {
        return description;
    }
}
