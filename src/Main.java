import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        ex1();
//       ex2();
       ex3();
//       ex4();
    }

    public static void ex1() {
        Ex1 ex1 = new Ex1();
        int[] grades = {87, 38, 40, 21, 78,93};
        System.out.println(ex1.round(83));
        System.out.println(ex1.notEnough(grades));
        System.out.println(ex1.average(grades));
        System.out.println(Arrays.toString(ex1.afterRounding(grades)));
        System.out.println(ex1.maxGrade(grades));



    }

    public static void ex2() {
        Ex2 ex2 = new Ex2();
        System.out.println(ex2.maxZahl(new int[]{4, 8, 3, 10, 17}));
        System.out.println(ex2.minZahl(new int[]{4, 8, 3, 10, 17}));
        System.out.println(ex2.maximaleSumme(new int[]{4, 8, 3, 10, 17}));
        System.out.println(ex2.minimaleSumme(new int[]{4, 8, 3, 10, 17}));
    }

    public static void ex3() {
        Ex3 ex3 = new Ex3();
        int[] num1 = {1,0,9};
        int[] num2 = {1,2};
//        System.out.println(Arrays.toString(ex3.addNumbers(num1, num2)));
//        System.out.println(ex3.subtractNumbers(num1, num2));
        System.out.println(ex3.multiply(num2, 9));
//        System.out.println(Arrays.toString(ex3.division(num1, 3)));
    }

    public static void ex4() {
        Ex4 ex4 = new Ex4();
        int[] keyboars = {40, 50, 60};
        int[] usb = {8,12};
        System.out.println(ex4.cheapestKeyboard(keyboars));
        System.out.println(ex4.mostExpesiveDevice(keyboars, usb));
        System.out.println(ex4.affordedKeyboard(keyboars, 30));
        System.out.println(ex4.totalCostCalc(keyboars,usb,60));
    }
}
