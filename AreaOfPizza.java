package Homeworks;

public class AreaOfPizza {

        public static void main(String[] args) {
            calculatePizzaArea(30.0);
        }

        public static void calculatePizzaArea(double diameter) {
            double radius = diameter / 2;
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println("Area of Pizza: " + area);
        }
    }

