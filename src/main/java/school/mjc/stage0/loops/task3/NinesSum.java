package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int nine = 9;
        int sum = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++){
            sum += nine;
            nine = nine * 10 + 9;
        }
        System.out.println(sum);
    }
}
