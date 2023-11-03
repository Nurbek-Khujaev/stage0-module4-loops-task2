package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int cnt = 0;
        while (cnt <= printToInclusive) {
            int fact = 1;
            int cnt1 = 1;
            while (cnt1 <= cnt) {
                fact *= cnt1;
                cnt1++;
            }
            cnt++;

            System.out.println(fact);


        }

    }
}
