public class Ex2 {
    public int maxZahl(int[] note) {
        int max = -10000;
        for (int number : note) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public int minZahl(int[] note) {
        int min = 10000000;
        for (int number : note) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public int maximaleSumme(int[] note) {
        int sum = 0;
        int min = minZahl(note);
        for (int number : note) {
            if (number != min) {
                sum += number;
            }
        }
        return sum;
    }

    public int minimaleSumme(int[] note) {
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

