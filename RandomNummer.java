package Homeworks;

import java.util.Random;
public class RandomNummer {



        public static void main(String[] args) {
            Random random = new Random();
            int number = random.nextInt(700) + 100; // генерируем случайное трёхзначное число
            int maxDigit = number % 10; // предполагаем, что максимальная цифра последняя
            number /= 10; // убираем последнюю цифру из числа

            if (number % 10 > maxDigit) { // сравниваем среднюю цифру с максимальной
                maxDigit = number % 10;
            }
            number /= 10; // убираем среднюю цифру из числа

            if (number > maxDigit) { // сравниваем первую цифру с максимальной
                maxDigit = number;
            }

            System.out.println("Random number: " + number);
            System.out.println("Biggest number: " + maxDigit);
        }
    }

