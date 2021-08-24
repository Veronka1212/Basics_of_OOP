package by.epam.oop5.task5.bean.flower;

public enum Name {

    ROSE("Роза"),
    GERBER("Гербер"),
    CHAMOMILE("Ромашка"),
    CHRYSANTHEMUM("Хризантема"),
    LILY("Лилия"),
    HYDRANGEA("Гортензия "),
    PION("Пион  "),
    TULIP("Тюльпан  "),
    ORCHID("Орхидея "),
    LILY_OF_THE_VALLEY("Ландыш "),
    MIMOSA("Мимоза  ");

    Name(String flowerName) {
        this.flowerName=flowerName;
    }

    private String flowerName;

      @Override
    public String toString() {
        return flowerName;
    }
}
