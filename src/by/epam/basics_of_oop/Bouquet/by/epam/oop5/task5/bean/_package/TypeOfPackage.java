package by.epam.oop5.task5.bean._package;

public enum TypeOfPackage {

    BOX("коробка"),
    PAPER("бумага"),
    BASKET("корзина"),
    WITHOUT_PACKAGING("без упаковки"),
    WRAPPER("обертка");

    private final String type;

    TypeOfPackage(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
