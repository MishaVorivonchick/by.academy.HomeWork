package by.academy.homework.task2.task1;

public enum Country implements  Enumeration {
    BRAZIL(8515767, 207000000),
    USA(9500000, 329000000),
    RUSSIA(17125191, 146745098),
    BELARUS(207595, 9475174),
    GERMANY(357408, 83019200),
    ITALY(301340, 59570581),
    SPAIN(505990, 46714997),
    FRANCE(674685, 65060692),
    CHINA(9598962, 1404328611),
    INDIA(3287263, 1358579000);
    private int area;
    private int numberOfPeople;
    private Country(int area, int numberOfPeople) {
        this.area = area;
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    @Override
    public int getArea() {
        return area;
    }
}
