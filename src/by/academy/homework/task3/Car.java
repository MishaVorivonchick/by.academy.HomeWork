package by.academy.homework.task3;
public class Car implements ICar {
    Motor motor;
    Passenger [] passengers;
    Door door;
    Lock lock;
    Wheels wheels;
    Seat seat;
    Tank tank;
    int liter;
    @Override
    public void start(Motor motor) {
        motor.start();
    }
    @Override
    public void stop(Motor motor) {
        motor.stop();
    }
    @Override
    public void addPassenger(Passenger  passenger) {
    }
    @Override
    public int getFuel(Fuel fuel) {
        return liter;
    }


}
