package by.epam.oop5.task5.bean.flower;

import java.util.Objects;

public class Flower {

    private final Name name;
    private final Color color;
    private double price;

    public double getPrice() {
        return price;
    }

    public Flower(Name name, Color color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public Name getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Flower other = (Flower) obj;
        return color == other.color && Objects.equals(name, other.name) && Objects.equals(price, other.price);
    }

    @Override
    public String toString() {
        return "Цветок - " + name + ", цвет - " + color + ", цена - " + price;
    }


}
