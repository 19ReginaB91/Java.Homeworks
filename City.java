package Homeworks;


    import java.util.HashMap;
import java.util.Map;
    import java.util.Scanner;

public class City {
        public static void main(String[] args) {
            // создаем карту, где ключем будет идентификатор страны, а значением - список пороговых значений для населения городов

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a population: ");
            int population = scanner.nextInt();

            System.out.print("Enter an country identifier: ");
            String countryId = scanner.next();  // FR, DE

            Map<String, int[]> citySizes = new HashMap<>();
            citySizes.put("Germany", new int[]{100_000, 400_000, 1_000_000});
            citySizes.put("France", new int[]{200_000, 500_000, 1_500_000});

            // вызываем метод, передавая население города и идентификатор страны
            checkCitySize(800_000, "Germany");
        }

        public static void checkCitySize(int population, String countryId) {
            // получаем список пороговых значений для страны
            int[] thresholds = getThresholds(countryId);
            // проверяем население города и выводим результат
            if (population < thresholds[0]) {
                System.out.println("small city");
            } else if (population < thresholds[1]) {
                System.out.println("middle city");
            } else {
                System.out.println("big city");
            }
        }

        public static int[] getThresholds(String countryId) {
            // получаем список пороговых значений для страны
            Map<String, int[]> citySizes = new HashMap<>();
            citySizes.put("Germany", new int[]{100_000, 400_000, 1_000_000});
            citySizes.put("France", new int[]{200_000, 500_000, 1_500_000});

            return citySizes.get(countryId);
        }
    }

