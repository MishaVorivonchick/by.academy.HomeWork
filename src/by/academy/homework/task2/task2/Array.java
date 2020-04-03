package by.academy.homework.task2.task2;

import java.util.Arrays;

public class Array {
    int[] array;
    public void Array (int[] array) {
        Arrays.sort(array);
        int count = 0, temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != temp) {
                temp = array[i];
                if (count % 2 == 1) {
                    System.out.print("[" + array[i - 1] + "] meets- " + count + " time. ");
                }
                count = 1;
            } else count++;
        }
        if (count % 2 == 1) System.out.print("[" + array[array.length - 1] + "] meets - " + count + " time.");
        System.out.println();
        this.array = array;
    }
}