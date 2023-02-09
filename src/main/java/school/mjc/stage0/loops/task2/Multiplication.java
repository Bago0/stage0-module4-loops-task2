package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int result = 0;
        int multiplied;
        int time;
        if (multiplyByAndToInclusive == 0) {
            System.out.print("");
        } else {
        if (multiplyByAndToInclusive > 0) {
            time = multiplyByAndToInclusive;
        } else  {
            time = -1 * multiplyByAndToInclusive;
        }

            time++;
            while (time != 0) {
                multiplied = result * multiplyByAndToInclusive;
                System.out.println(multiplied);
                result++;
                time--;
            }
        }
    }
}
