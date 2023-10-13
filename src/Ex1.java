import java.util.ArrayList;

import static java.lang.Math.abs;

public class Ex1 {
    public int round(int number) {
        int nextMumber = (number / 5 + 1) * 5;
        if (number < 38)
            return number;
        else if (abs(number - nextMumber) < 3)
            return nextMumber;
        return number;
    }

    public ArrayList<Integer> notEnough(int[] grades) {
        ArrayList<Integer> failed = new ArrayList<>();
        for (int grade : grades)
            if (grade < 40)
                failed.add(grade);
        return failed;
    }

    public double average(int[] grades) {
        int sum = 0;
        int count = 0;
        for (int grade : grades) {
            sum += grade;
            count++;
        }
        return (double) sum / count;
    }

    public int[] afterRounding(int[] grades) {
        for (int index = 0; index < grades.length; index++)
            grades[index] = round(grades[index]);
        return grades;
    }

    public int maxGrade(int[] grades) {
        grades = afterRounding(grades);
        int max = 0;
        for (int grade:grades)
            if (grade > max)
                max = grade;
        return max;
    }
}

