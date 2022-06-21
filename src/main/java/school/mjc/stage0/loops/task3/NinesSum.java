package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for (int counter = 1; counter <= lengthOfLastNumber; counter++) {
            sum += Math.pow(10, counter) - 1;
        }
        System.out.println(sum);
    }
}
