package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {

        int cnt = 0;

        while (cnt <= multiplyByAndToInclusive) {

            System.out.println(cnt * multiplyByAndToInclusive);
            cnt++;
        }

    }
}
