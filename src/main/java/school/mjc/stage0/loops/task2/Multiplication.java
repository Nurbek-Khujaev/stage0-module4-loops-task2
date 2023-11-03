package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int sum = 1;
        int cnt = 0;

        while (cnt <= multiplyByAndToInclusive) {
            sum *= cnt;
            cnt++;
        }

        System.out.println(sum);
    }
}
