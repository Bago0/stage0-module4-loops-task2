package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        while (i <= printToInclusive) {
            int j = 2;
            for (; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i) {
                System.out.println(i);
            }
            i++;
        }
    }

}