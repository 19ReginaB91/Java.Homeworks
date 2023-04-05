package Homeworks;

public class HelloJava {
    public static void main(String[] args) {

        String str = "Hello, Java! It's a Java Basic course";
        int length = str.length();
        boolean str1 = false;
        System.out.println("Hello, Java! It's a Java Basic course" + " " + length);
        System.out.println(!str1);

        StringBuilder sb1 = new StringBuilder();

        System.out.println("It's a Java\nJava Basic course");


        String result = sb1.toString();
        System.out.println(result);

    }
}
