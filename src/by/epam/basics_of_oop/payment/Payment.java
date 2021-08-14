package by.epam.basics_of_oop.payment;

import java.util.List;
import java.util.Objects;

public class Payment {

    private String shop;
    private List<Shopping> array;

    public Payment() {
    }

    public Payment(String shop, int price, List<Shopping> array) {
        this.shop = shop;
        this.array = array;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public List<Shopping> getArray() {
        return array;
    }

    public void setArray(List<Shopping> array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(shop, payment.shop) && Objects.equals(array, payment.array);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shop, array);
    }

    @Override
    public String toString() {
        return "Магазин " + shop + ", список покупок: \n";
    }

    public static class Shopping {

        public Shopping() {
        }

        private String product;
        private int amount;
        private int cost;

        public Shopping(String product, int cost, int amount) {
            this.product = product;
            this.cost = cost;
            this.amount = amount;
        }

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Shopping shopping = (Shopping) o;
            return cost == shopping.cost && amount == shopping.amount && Objects.equals(product, shopping.product);
        }

        @Override
        public int hashCode() {
            return Objects.hash(product, cost, amount);
        }

        @Override
        public String toString() {
            return "Название продукта: " + product + ", количество " + amount + ", цена " + cost + "\n";
        }
    }
}
