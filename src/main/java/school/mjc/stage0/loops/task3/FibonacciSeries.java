package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int fibonacci0 = 0;
        int fibonacci1 = 1;
        int fibonacci = 2;
        System.out.println(fibonacci0);
        System.out.println(fibonacci1);
        for (int i = 2; i < lastFibonacci; i++) {
            fibonacci = fibonacci0 + fibonacci1;
            System.out.println(fibonacci);
            fibonacci0 = fibonacci1;
            fibonacci1 = fibonacci;
        }
    }
}
