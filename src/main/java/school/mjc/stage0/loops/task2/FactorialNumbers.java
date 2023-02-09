package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count = 1;
        int power = 0;
        while(printToInclusive+1 != 0){
            System.out.println(count);
           count = count + count*power;
        printToInclusive--;
        power++;
        }
    }
}
