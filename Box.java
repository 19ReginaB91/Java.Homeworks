package Homeworks;

public class Box {
    double length, width, height;

    public Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
        double volume = length * width * height;
        System.out.println("Box volume: " + volume);
    }

    public Box(double l, double w) {
        length = l;
        width = w;
        height = 10.0;
        double volume = length * width * height;
        System.out.println("Box volume: " + volume);
    }

    public Box(double l) {
        length = l;
        width = 10.0;
        height = 10.0;
        double volume = length * width * height;
        System.out.println("Box volume: " + volume);
    }

    public Box() {
        length = 10.0;
        width = 10.0;
        height = 10.0;
        double volume = length * width * height;
        System.out.println("Box volume: " + volume);
    }

    public static void main(String[] args) {
        Box b1 = new Box(20.0, 30.0, 40.0);
        Box b2 = new Box(20.0, 30.0);
        Box b3 = new Box(20.0);
        Box b4 = new Box();
    }
}