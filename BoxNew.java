package Homeworks;

public class BoxNew {



        double length, width, height;

        public BoxNew(double length, double width, double height) {
            this.length = length;
            this.width = width;
            this.height = height;
            double volume = calculateVolume();
            System.out.println("Box volume: " + volume);
        }

        public BoxNew(double length, double width) {
            this(length, width, 20.0);
        }

        public BoxNew(double length) {
            this(length, 70.0);
        }

        public BoxNew() {
            this(50.0);
        }

        public double calculateVolume() {
            return length * width * height;
        }

        public static void main(String[] args) {
            BoxNew b1 = new BoxNew(50.0, 70.0, 20.0);
            BoxNew b2 = new BoxNew(50.0, 70.0);
            BoxNew b3 = new BoxNew(50.0);
            BoxNew b4 = new BoxNew();
        }
    }


