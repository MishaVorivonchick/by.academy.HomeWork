package by.academy.homework.task2.task1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Country country =Country.CHINA;
        System.out.println(country +" area "+  "- " +country.getArea()+" km^2, population - "+country.getNumberOfPeople()+ " people.");
        char [] c = {'C','H','I','N','A'};
        String s = String.valueOf(c);
        System.out.println(s);
        System.out.println(country.toString());
        System.out.println(s == (country.toString()));// сравнивает ссылки объектов
        String d = String.valueOf("JAPAN");
        System.out.println(d);
        CountryAreaComparator countryAreaComparator = new CountryAreaComparator();
        System.out.println(countryAreaComparator.compare(Country.CHINA, Country.BELARUS));

    }
}

