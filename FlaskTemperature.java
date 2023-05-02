package Homeworks;

public class FlaskTemperature {


        public static boolean checkDevice(int temperature1, int temperature2) {
            return temperature1 > 100 && temperature2 < 100;
        }

        public static void main(String[] args) {
            int temperature1 = 120;
            int temperature2 = 80;

            boolean isDeviceWorking = checkDevice(temperature1, temperature2);

            System.out.println(isDeviceWorking);
        }
    }

