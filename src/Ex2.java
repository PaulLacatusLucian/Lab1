public class Ex2 {
    public static int maxZahl(int[] note) {
        int max = -10000;
        for (int number : note) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int minZahl(int[] note) {
        int min = 10000000;
        for (int number : note) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int maximaleSumme(int[] note) {
        int sum = 0;
        int min = minZahl(note);
        for (int number : note) {
            if (number != min) {
                sum += number;
            }
        }
        return sum;
    }

    public static int minimaleSumme(int[] note) {
        int sum = 0;
        int max = maxZahl(note);
        for (int number : note) {
            if (number != max) {
                sum += number;
            }
        }
        return sum;
    }
}

