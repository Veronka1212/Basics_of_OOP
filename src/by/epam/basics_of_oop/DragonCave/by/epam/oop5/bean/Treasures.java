package by.epam.oop5.bean;

import java.util.Objects;

public class Treasures {

    private String name;
    private int cost;

    public Treasures(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Treasures treasures = (Treasures) o;
        return cost == treasures.cost && Objects.equals(name, treasures.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    @Override
    public String toString() {
        return "Сокровище - " +name +", цена - " + cost;
    }
}
