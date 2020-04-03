package by.academy.homework.task.port;
import by.academy.homework.task.ship.DoubleOfDeckShip;
import by.academy.homework.task.ship.SingleOfDeckShip;
import by.academy.homework.task.ship.Ship;
public class Port {
    public static void main(String[] args) {
        Ship ship1 = new SingleOfDeckShip();
        ship1.dataImprut(1000, 2, "cone", 20, 50);
        Ship ship2 = new DoubleOfDeckShip();
        ship2.dataImprut(2000, 2, "cone", 20, 55);
        Ship ship3 = new SingleOfDeckShip();
        ship3.dataImprut(1000, 4, "square", 10, 15);
        Ship ship4 = new SingleOfDeckShip();
        ship4.dataImprut(1000, 2, "square", 20, 30);
        Ship ship5 = new SingleOfDeckShip();
        ship5.dataImprut(1000, 4, "cylinder", 10, 48);
        Ship ship6 = new SingleOfDeckShip();
        ship6.dataImprut(1000, 2, "cylinder", 20, 72);
        Ship ship7 = new DoubleOfDeckShip();
        ship7.dataImprut(2000, 4, "square", 10, 23);
        Ship ship8 = new DoubleOfDeckShip();
        ship8.dataImprut(1000, 2, "cylinder", 20, 67);
        Ship ship9 = new DoubleOfDeckShip();
        ship9.dataImprut(2000, 4, "square", 10,44);
        Ship ship10 = new DoubleOfDeckShip();
        ship10.dataImprut(1000, 2, "cone", 10, 110);
    }
}

