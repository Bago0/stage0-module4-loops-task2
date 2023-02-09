package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive){
        int numbers = 0;
        while(numbers != printTillInclusive+1){
            if(numbers % 2 == 0){
                System.out.println(numbers);
            }
            numbers++;
        }
    }
}
