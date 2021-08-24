package by.epam.oop5.task5.bean.flower;

public enum Color {

    RED("красного цвета"),
    WHITE("белого цвета"),
    YELLOW("желтого цвета"),
    PINK("розового цвета"),
    TEA("чайного цвета"),
    BURGUNDY("бордового цвета"),
    POWDERY("пудрового цвета");

    private final String colorName;

    Color(String title) {
        this.colorName = title;
    }

    @Override
    public String toString() {
        return colorName;
    }
}
