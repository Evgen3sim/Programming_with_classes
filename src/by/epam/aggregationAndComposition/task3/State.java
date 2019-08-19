package by.epam.aggregationAndComposition.task3;

/* Создать объект класса Государство, используя классы
   Область, Район, Город. Методы: вывести на консоль
   столицу, количество областей, площадь, областные центры. */


import java.util.Arrays;

public class State {
    private static final int DEFAULT = 6;
    private String name;
    private String capital;
    private double square;
    private Region[] regions;

    {
        regions = new Region[DEFAULT];
    }

    public State(String name, double square) {
        this.name = name;
        this.square = square;
    }

    public void addRegion(Region region) {
        if (region != null) {
            for (int i = 0; i < regions.length; i++) {
                if (regions[i] == null) {
                    regions[i] = region;
                    break;
                }
            }
        }
    }

    public void removeRegion(Region region) {
        if (region != null) {
            for (int i = 0; i < regions.length; i++) {
                if (regions[i] != null && regions[i].equals(region)) {
                    regions[i] = null;
                    break;
                }
            }
        }
    }

    public Region getRegionByName(String name) {
        Region region = null;
        if (name != null) {
            for (int i = 0; i < regions.length; i++) {
                if (regions[i].getRegionName().equals(name)) {
                    region = regions[i];
                    break;
                }
            }
        }
        return region;
    }

    public String getStateName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(City city) {
        this.capital = city.getCityName();
    }

    public int getRegionsNumber() {
        return regions.length;
    }

    public double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        for (int i = 0; i < regions.length; i++) {
            if (regions[i].getRegionCenter() != null) {
                System.out.println(regions[i].getRegionName() + " has the following regional center: "
                        + regions[i].getRegionCenter());
            }
        }
        return "State " + getStateName() + " [capital=" + ((capital != null) ? capital : "capital not defined")
                + ", regions number=" + getRegionsNumber() + ", square=" + square + "]";
    }
}
