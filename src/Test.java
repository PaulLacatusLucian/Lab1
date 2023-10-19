import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void testEx1() {
        System.out.println("Testing ex1");
        System.out.println();
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(38);
        expectedResult.add(21);
        int[] expectedResult2 = new int[]{87, 40, 40, 21, 80, 95};
        int[] grades = {87, 38, 40, 21, 78, 93};

        assert Ex1.round(83) == 85;
        System.out.println("Rounding test passed!");
        assert Ex1.notEnough(grades) == expectedResult;
        System.out.println("1a. Test passed!");
        assert Ex1.average(grades) == 59.5;
        System.out.println("1b. Test passed!");
        assert Arrays.equals(Ex1.afterRounding(grades), expectedResult2);
        System.out.println("1c. Test passed!");
        assert Ex1.maxGrade(grades) == 95;
        System.out.println("1d. Test passed!");

        System.out.println("All ex1 tests passed!");
        System.out.println();
    }

    public static void testEx2() {
        System.out.println("Testing ex2");
        System.out.println();

        assert Ex2.maxZahl(new int[]{4, 8, 3, 10, 17}) == 17;
        System.out.println("2a. Test passed!");
        assert Ex2.minZahl(new int[]{4, 8, 3, 10, 17}) == 3;
        System.out.println("2b. Test passed!");
        assert Ex2.maximaleSumme(new int[]{4, 8, 3, 10, 17}) == 39;
        System.out.println("2c. Test passed!");
        assert Ex2.minimaleSumme(new int[]{4, 8, 3, 10, 17}) == 25;
        System.out.println("2d. Test passed!");

        System.out.println("All ex2 tests passed!");
        System.out.println();
    }

    public static void testEx3() {
        int[] num1 = {1, 0, 9};
        int[] num2 = {1, 0, 8};
        int amount = 9;
        int[] expectedSum = {2,1,7};
        ArrayList<Integer> expectedDif = new ArrayList<>();
        expectedDif.add(1);
        ArrayList<Integer> expectedDiv = new ArrayList<>();
        expectedDif.add(1); expectedDif.add(2);
        ArrayList<Integer> expectedMul = new ArrayList<>();
        expectedMul.add(9); expectedMul.add(8); expectedMul.add(1);
        assert Ex3.addNumbers(num1, num2) == expectedSum;
        System.out.println("3a. Test add!");
        assert Ex3.subtractNumbers(num1, num2).equals(expectedDif);
        System.out.println("3b. Test subtract!");
        assert Ex3.division(num2, 9).equals(expectedDiv);
        System.out.println("3c. Test division!");
        assert Ex3.multiply(num1, 9).equals(expectedMul);
        System.out.println("3d. Test multiply!");

        System.out.println("All ex3 tests passed!");
        System.out.println();
    }


    public static void testAll() {
        testEx1();
        testEx2();
        testEx3();
    }

}