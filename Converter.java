package Homeworks;

public class Converter {

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        double celsius = 25.0;
        System.out.println(celsius + " degrees Celsius = " + celsiusToKelvin(celsius) + " Kelvin");
        System.out.println(celsius + " degrees Celsius = " + celsiusToFahrenheit(celsius) + " Fahrenheit");
    }


    public class SwapValues {
        public static void main(String[] args) {
            int a = 10, b = 20;
            int temp = a;
            a = b;
            b = temp;
            System.out.println("a = " + a + ", b = " + b);
        }
    }
}


