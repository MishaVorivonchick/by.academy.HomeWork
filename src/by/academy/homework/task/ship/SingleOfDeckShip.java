package by.academy.homework.task.ship;

public class SingleOfDeckShip implements Ship {
    private final double PI = 3.14;
    double massSquare;
    double massCone;
    double massCylinder;

    @Override
    public void dataImprut(double p, double c, String f, double r, double h) {
        if ((p == DENSITY_1 || p == DENSITY_2) && ((c == NUMBER_OF_CONTAINERS_BIG && r == RADIUS_2) || (c == NUMBER_OF_CONTAINERS_LITLLE && r == RADIUS_1)) && (f.equals(square)) && ((h >= 10 && h <= 100))) {
            long massSquare = (long) (p * PI * r * r * h * c);
            System.out.println("Mass of water on a ship: " + massSquare);
        } else if ((p == DENSITY_1 || p == DENSITY_2) && ((c == NUMBER_OF_CONTAINERS_BIG && r == RADIUS_2) || (c == NUMBER_OF_CONTAINERS_LITLLE && r == RADIUS_1)) && (f.equals(cone)) && ((h >= 10 && h <= 100))) {
            long massCone = (long) (p * PI * r * r * h / 3 * c);
            System.out.println("Mass of water on a ship: " + massCone);
        } else if ((p == DENSITY_1 || p == DENSITY_2) && ((c == NUMBER_OF_CONTAINERS_BIG && r == RADIUS_2) || (c == NUMBER_OF_CONTAINERS_LITLLE && r == RADIUS_1)) && (f.equals(cylinder)) && ((h >= 10 && h <= 100))) {
            long massCylinder = (long) (p * PI * r * r * h * c); // V = πr2h
            System.out.println("Mass of water on a ship: " + massCylinder);
        } else {
            System.out.println("Does not meet the task condition.");
        }
    }
}
