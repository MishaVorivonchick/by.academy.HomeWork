package by.academy.homework.task.ship;

public interface Ship  {final int DENSITY_1 = 1000; //плотность
    final double DENSITY_2 = 2000;
    final double NUMBER_OF_CONTAINERS_BIG = 2;
    final double NUMBER_OF_CONTAINERS_LITLLE = 4;
    String cone = "cone";
    String square = "square";
    String cylinder = "cylinder";
    final int RADIUS_1 = 10;
    final int RADIUS_2 = 20;

    public void dataImprut(double p, double c, String f, double r, double h);

}

