package by.epam.oop5.task5.bean;

import by.epam.oop5.task5.bean._package.Package;
import by.epam.oop5.task5.bean.flower.Flower;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Bouquet {

    public Bouquet() {
    }

    private List<Flower> flowers;
    private Package oPackage;

    public Bouquet(List<Flower> flowers, Package oPackage) {
        this.flowers = flowers;
        this.oPackage = oPackage;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public Package getoPackage() {
        return oPackage;
    }

    public void setoPackage(Package oPackage) {
        this.oPackage = oPackage;
    }

    public List<Flower> delFlower(List<Flower> flowers, int i) {
        flowers.remove(i);
        return flowers;
    }

    public List<Flower> addFlower(List<Flower> flowers, Flower newFlower) {
        flowers.add(newFlower);
        return flowers;
    }

    @Override
    public String toString() {
        return "Композиция: " + flowers.toString() + oPackage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bouquet bouquet = (Bouquet) o;
        return flowers.equals(bouquet.flowers) && oPackage.equals(bouquet.oPackage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowers, oPackage);
    }

}
