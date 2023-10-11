public class Ex3 {
    public int convert2Number(int[] numAsArray) {
        int number = 0;
        if (numAsArray[0] >= 0) {
            for (int i = 0; i < numAsArray.length; i++)
                number = number * 10 + numAsArray[i];
            return number;
        } else {
            numAsArray[0] *= -1;
            for (int i = 0; i < numAsArray.length; i++)
                number = number * 10 + numAsArray[i];
            return number * -1;
        }
    }

    public int numberLength(int number) {
        int length = 1;
        while (number / 10 != 0) {
            length++;
            number /= 10;
        }
        return length;
    }

    public int[] convert2Array(int number) {
        boolean isNeg = false;
        int length = numberLength(number);
        int[] array = new int[length];
        if (number < 0) {
            number *= -1;
            isNeg = true;
        }
        while (number > 0) {
            length--;
            array[length] = number % 10;
            number = number / 10;
        }
        if (isNeg)
            array[0] *= -1;

        return array;
    }

    public int[] addNumbers(int[] num1, int[] num2) {
        if (num1.length != num2.length)
            throw new IllegalArgumentException("Length does not match");
        int number1 = convert2Number(num1);
        int numer2 = convert2Number(num2);
        return convert2Array(number1+numer2);
    }

    public int[] subtractNumbers(int[] num1, int[] num2) {
        if (num1.length != num2.length)
            throw new IllegalArgumentException("Length does not match");
        int number1 = convert2Number(num1);
        int numer2 = convert2Number(num2);
        return convert2Array(number1-numer2);
    }

    public int[] multiply(int[] num1, int amount) {
        int number = convert2Number(num1);
        return convert2Array(number*amount);
    }

    public int[] division(int[] num1, int amount) {
        int number = convert2Number(num1);
        return convert2Array(number/amount);
    }

//    public int[] addNumbers(int[] num1, int[] num2) {
//        int[] newNumber = new int[num1.length];
//        int rest = 0;
//
//        for (int i = num1.length - 1; i >= 0; i--) {
//            int sum = num1[i] + num2[i] + rest;
//            if (sum <= 9) {
//                newNumber[i] = sum;
//                rest = 0;
//            } else {
//                newNumber[i] = sum % 10;
//                rest = sum / 10;
//            }
//        }
//        if (rest > 0) {
//            int[] aux = new int[num1.length + 1];
//            aux[0] = rest;
//            for (int i = 1; i < newNumber.length; i++)
//                aux[i] = newNumber[i - 1];
//            aux[aux.length - 1] = newNumber[newNumber.length - 1];
//            return aux;
//        } else {
//            return newNumber;
//        }
//    }
}

