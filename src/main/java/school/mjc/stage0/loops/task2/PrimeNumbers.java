package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int cnt = 2;

        while (cnt <= printToInclusive) {
            int primeCounter = 2;
            boolean bool = false;
            while (primeCounter < cnt) {
                if (cnt % primeCounter == 0) {
                    bool = true;
                    break;
                }
                primeCounter++;
            }
            if (!bool) {
                System.out.println(cnt);
            }
            cnt++;

        }
    }
}
