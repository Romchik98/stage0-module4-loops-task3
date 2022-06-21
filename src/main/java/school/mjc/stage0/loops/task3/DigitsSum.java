package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number){
        int sum = 0;
        if (number < 0) {
            number *= -1;
        }
        String str = "" + number;
        for (int counter = 0; counter < str.length(); counter++) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}