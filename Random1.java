package Homeworks;


    import java.util.Random;

    public class Random1 {
        public static void main(String[] args) {
            Random random = new Random();
            int n = random.nextInt(28800); // генерация случайного числа от 0 до 28800
            System.out.println(n + " секунд"); // вывод на экран количества секунд



            int hours = n / 3600; // количество полных часов
            if (hours > 0) {
                System.out.println("Осталось " + hours + " часов");
            } else {
                System.out.println("Осталось менее часа");
            }
        }

        private int nextInt(int i) {

            return i;
        }
}
