import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Test.testAll();
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
