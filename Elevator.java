package Homeworks;
import java.util.Scanner;
public class Elevator {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите высоту здания (H): ");
            int H = scanner.nextInt();
            System.out.print("Введите количество этажей подъема (N): ");
            int N = scanner.nextInt();
            System.out.print("Введите количество этажей спуска (M): ");
            int M = scanner.nextInt();
            int result = calculateLiftRides(H, N, M);
            System.out.println("Количество подъемов лифта: " + result);
        }

        public static int calculateLiftRides(int H, int N, int M) {
            int rides = 0;
            int currentHeight = 0;
            while (currentHeight < H) {
                rides++;
                currentHeight += N;
                if (currentHeight >= H) {
                    break;
                }
                currentHeight -= M;
            }
            return rides;
        }
    }

