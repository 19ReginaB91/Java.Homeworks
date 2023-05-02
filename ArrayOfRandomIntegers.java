package Homeworks;

import java.util.Random;

public class ArrayOfRandomIntegers {

    public static void main(String[] args) {
        int[] array = new int[15]; // создаем массив из 15 элементов
        int evenCount = 0; // создаем переменную для хранения количества четных чисел

        // заполняем массив случайными числами
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10); // случайное число от 0 до 9
        }

        // считаем количество четных чисел в массиве
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) { // если число четное, то увеличиваем счетчик на 1
                evenCount++;
            }
        }

        // выводим количество четных чисел на экран
        System.out.println("Number of even elements in the array: " + evenCount);
    }
}

