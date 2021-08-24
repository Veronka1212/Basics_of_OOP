package by.epam.oop5.task5.bean._package;


import java.util.Objects;

public class Package {

    private final TypeOfPackage type;
    private double price;

    public TypeOfPackage getType() {
        return type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Package(TypeOfPackage type, double price) {
        this.type = type;
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Package aPackage = (Package) o;
        return Double.compare(aPackage.price, price) == 0 && type == aPackage.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price);
    }

    @Override
    public String toString() {
        return " Упаковка: " +type +", цена " + price;
    }

}
