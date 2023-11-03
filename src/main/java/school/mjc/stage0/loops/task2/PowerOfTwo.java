package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int ans = 1;
        if (power < 0) {
            System.out.println("too much power");
        } else {
            System.out.println(1);
            int cnt1 = 1;
            while (cnt1 <= power) {
                ans *= 2;
                cnt1++;
                System.out.println(ans);
            }


        }

    }
}
