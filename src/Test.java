import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void testEx1() {
        System.out.println("Testing ex1");
        System.out.println();
        ArrayList<Integer> expectedResult = new ArrayList<>();
        ArrayList<Integer> unexpectedResult1 = new ArrayList<>();
        unexpectedResult1.add(23);
        expectedResult.add(38);
        expectedResult.add(21);
        int[] expectedResult2 = {87, 40, 40, 21, 80, 95};
        int[] unexpectedResult = {80,50,34,21,50,32};
        int[] grades = {87, 38, 40, 21, 78, 93};

        assert Ex1.round(83) == 85;
        System.out.println("Rounding test passed!");

        try {
            assert Ex1.round(83) == 84;
        } catch (AssertionError e) {
            System.out.println("Rounding test failed with an AssertionError!");
        }


        assert Ex1.notEnough(grades) == expectedResult;
        System.out.println("1a. Test passed!");

        try {
            assert  Ex1.notEnough(grades) == unexpectedResult1;
        } catch (AssertionError e) {
            System.out.println("1a failed with an AssertionError");
        }


        assert Ex1.average(grades) == 59.5;
        System.out.println("1b. Test passed!");

        try {
            assert  Ex1.average(grades) == 60;
        } catch (AssertionError e) {
            System.out.println("1b failed with an AssertionError");
        }


        assert Arrays.equals(Ex1.afterRounding(grades), expectedResult2);
        System.out.println("1d. Test passed!");

        try {
            assert Arrays.equals(Ex1.afterRounding(grades),unexpectedResult);
        } catch (AssertionError e) {
            System.out.println("1c failed with an AssertionError!");
        }


        assert Ex1.maxGrade(grades) == 95;
        System.out.println("1d. Test passed!");

        try {
            assert Ex1.maxGrade(grades) == 92;
        } catch (AssertionError e) {
            System.out.println("1d failed with an AssertionError!");
        }


        System.out.println("All ex1 tests passed!");
        System.out.println();
    }

    public static void testEx2() {
        System.out.println("Testing ex2");
        System.out.println();

        assert Ex2.maxZahl(new int[]{4, 8, 3, 10, 17}) == 17;
        System.out.println("2a. Test passed!");

        try {
            assert Ex2.maxZahl(new int[]{4,8,4,20,27}) == 15;
        } catch (AssertionError e) {
            System.out.println("2a failed with an AssertionError!");
        }


        assert Ex2.minZahl(new int[]{4, 8, 3, 10, 17}) == 3;
        System.out.println("2b. Test passed!");

        try {
            assert Ex2.minZahl(new int[]{4,8,4,20,27}) == 5;
        } catch (AssertionError e) {
            System.out.println("2b failed with an AssertionError!");
        }


        assert Ex2.maximaleSumme(new int[]{4, 8, 3, 10, 17}) == 39;
        System.out.println("2c. Test passed!");

        try {
            assert Ex2.maximaleSumme(new int[]{4,8,3,10,17}) == 32;
        } catch (AssertionError e) {
            System.out.println("2c failed with an AssertionError!");
        }


        assert Ex2.minimaleSumme(new int[]{4, 8, 3, 10, 17}) == 25;
        System.out.println("2d. Test passed!");

        try {
            assert Ex2.minimaleSumme(new int[]{4,8,3,10,17}) == 7;
        } catch (AssertionError e) {
            System.out.println("2d failed with an AssertionError!");
        }


        System.out.println("All ex2 tests passed!");
        System.out.println();
    }

    public static void testEx3() {
        System.out.println("Testing ex3");
        System.out.println();
        int[] num1 = {1, 0, 9};
        int[] num2 = {1, 0, 8};
        int amount = 9;
        int[] expectedSum = {2,1,7};
        int[] unexpectedSum = {3,1,5};
        ArrayList<Integer> expectedDif = new ArrayList<>();
        expectedDif.add(1);
        ArrayList<Integer> unexpectedDif = new ArrayList<>();
        unexpectedDif.add(7);
        ArrayList<Integer> expectedDiv = new ArrayList<>();
        expectedDif.add(1); expectedDif.add(2);
        ArrayList<Integer> unexpectedDiv = new ArrayList<>();
        unexpectedDif.add(1); unexpectedDif.add(4);
        ArrayList<Integer> expectedMul = new ArrayList<>();
        expectedMul.add(9); expectedMul.add(8); expectedMul.add(1);
        ArrayList<Integer> unexpectedMul = new ArrayList<>();
        unexpectedMul.add(9); unexpectedMul.add(7); unexpectedMul.add(1);

        assert Ex3.addNumbers(num1, num2) == expectedSum;
        System.out.println("3a. Test add!");

        try {
            assert Ex3.addNumbers(num1, num2) == unexpectedSum;
        } catch (AssertionError e) {
            System.out.println("3a failed with an AssertionError!");
        }


        assert Ex3.subtractNumbers(num1, num2).equals(expectedDif);
        System.out.println("3b. Test subtract!");

        try {
            assert Ex3.subtractNumbers(num1, num2) == unexpectedDif;
        } catch (AssertionError e) {
            System.out.println("3b failed with an AssertionError!");
        }


        assert Ex3.division(num2, 9).equals(expectedDiv);
        System.out.println("3c. Test division!");

        try {
            assert Ex3.division(num1, amount).equals(unexpectedDiv);
        } catch (AssertionError e) {
            System.out.println("3c failed with an AssertionError!");
        }


        assert Ex3.multiply(num1, 9).equals(expectedMul);
        System.out.println("3d. Test multiply!");

        try {
            assert Ex3.multiply(num1, amount) == unexpectedMul;
        } catch (AssertionError e) {
            System.out.println("3d failed with an AssertionError!");
        }


        System.out.println("All ex3 tests passed!");
        System.out.println();
    }

    public static void testEx4() {
        System.out.println("Testing ex4");
        System.out.println();
        int[] keyboars = {40, 50, 60};
        int[] usb = {8,12};

        assert Ex4.cheapestKeyboard(keyboars) == 40;
        System.out.println("4a. Test passed!");

        try {
            assert Ex4.cheapestKeyboard(keyboars) == 45;
        } catch (AssertionError e) {
            System.out.println("4a failed with an AssertionError!");
        }


        assert Ex4.mostExpesiveDevice(keyboars, usb) == 60;
        System.out.println("4b. Test passed!");

        try {
            assert Ex4.mostExpesiveDevice(keyboars, usb) == 45;
        } catch (AssertionError e) {
            System.out.println("4b failed with an AssertionError!");
        }


        assert Ex4.affordedKeyboard(keyboars, 50) == 50;
        System.out.println("4c. Test passed!");

        try {
            assert Ex4.affordedKeyboard(keyboars, 50) == 45;
        } catch (AssertionError e) {
            System.out.println("4c failed with an AssertionError!");
        }


        assert Ex4.totalCostCalc(keyboars,usb,60) == 58;
        System.out.println("4d. Test passed!");

        try {
            assert Ex4.totalCostCalc(keyboars, usb, 60) == 45;
        } catch (AssertionError e) {
            System.out.println("4d failed with an AssertionError!");
        }

        System.out.println("All ex4 tests passed!");
        System.out.println();
    }


    public static void testAll() {
        testEx1();
        testEx2();
        testEx3();
        testEx4();
    }

}