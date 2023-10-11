import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     //  ex2();
       ex3();
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
        int[] num1 = {1,2,3};
        int[] num2 = {1,3,4};
        int[] num3 = {2,0,0,1};
        System.out.println(Arrays.toString(ex3.addNumbers(num1, num2)));
//        System.out.println(Arrays.toString(ex3.subtractNumbers(num1, num2)));
//        System.out.println(Arrays.toString(ex3.multiply(num1, 3)));
//        System.out.println(Arrays.toString(ex3.division(num1, 3)));
    }
}
