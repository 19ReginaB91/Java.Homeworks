public class HwNumericalSystem {
    public static void main(String[] args) {

        // 1 уровень сложности: переведите такие числа как 1144, 978, 12 из 10й в 8ю системы счисления и обратно

        //Decimal //  из 8й в 10ю системы
        int a = 1144;
        int a10 = 612;

        System.out.println(1 * Math.pow(8, 3) + 1 * Math.pow(8, 2) + 4 * Math.pow(8, 1) + 4 * Math.pow(8, 0));
        System.out.println();

        int b = 978;
        int b10 = 640;
        System.out.println(9 * Math.pow(8, 2) + 7 * Math.pow(8, 1) + 8 * Math.pow(8, 0));
        System.out.println();

        int c = 12;
        int c10 = 10;
       System.out.println(1 * Math.pow(8, 1) + 2 * Math.pow(8, 0));
        System.out.println();

        //OCTAL // из 10й в 8ю систему
        int d = 1144;
        int d8 = 2170;
        System.out.println(d8);

        System.out.println();
//        System.out.println(1144 / 8); //143
//        System.out.println(1144 % 8);      //0
//        System.out.println(143 / 8);  //17
//        System.out.println(143 % 8);       //7
//        System.out.println(17 / 8);    // 2
//        System.out.println(17 % 8);       //1
//        System.out.println(2 / 8);     //0
//        System.out.println(2 % 8);       //2
//        System.out.println();

        int e = 978;
        int e8 = 1722;
        System.out.println(e8);
        System.out.println();
//        System.out.println(978 / 8); //122
//        System.out.println(978 % 8);      //2
//        System.out.println(122 / 8); //15
//        System.out.println(122 % 8);     //2
//        System.out.println(15 / 8); //1
//        System.out.println(15 % 8);     //7
//        System.out.println(1 / 8); //0
//        System.out.println(1 % 8);    // 1
//        System.out.println();

        int f = 12;
        int f8 = 14;;
        System.out.println(f8);
//        System.out.println(12 / 8); //1
//        System.out.println(12 % 8);    //4
//        System.out.println(4 / 8); //0
//        System.out.println(4 % 8);    //1
//        System.out.println();

    }
}
