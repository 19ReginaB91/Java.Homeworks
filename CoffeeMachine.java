package Homeworks;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a drink: 1 - espresso, 2 - americano, 3 - cappuccino, 4 - water:");
        int valueDrink = sc.nextInt();

        getDrinkIf(valueDrink);
        System.out.println();
        getDrinkSwitch(valueDrink);

        sc.close();
    }


    public static String getDrinkIf(int a) {
        String nameDrink;
        if (a == 1) {
            nameDrink = "Espresso";
        } else if (a == 2) {
            nameDrink = "Americano";
        } else if (a == 3) {
            nameDrink = "Cappuccino";
        } else if (a == 4) {
            nameDrink = "Water";
        } else {
            nameDrink = "Error!";
            System.out.println(nameDrink);
            return nameDrink;
        }
        System.out.println("Your " + nameDrink + " is ready");
        return nameDrink;
    }

    public static void getDrinkSwitch(int n) {
        String nameDrink;
        switch (n) {
            case 1:
                nameDrink = "Espresso";
                break;
            case 2:
                nameDrink = "Americano";
                break;
            case 3:
                nameDrink = "Cappuccino";
                break;
            case 4:
                nameDrink = "Water";
                break;

            default:
                nameDrink = "Error!";
                System.out.println(nameDrink);
                return;
        }
        System.out.println("Your "+  nameDrink + " is ready");
    }

}



