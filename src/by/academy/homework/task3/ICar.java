package by.academy.homework.task3;

public interface ICar {

    public void start(Motor motor);

    public void stop(Motor motor);

    public void addPassenger(Passenger passenger);

    public int getFuel(Fuel fuel);
}
