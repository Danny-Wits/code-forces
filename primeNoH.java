import java.util.ArrayList;
import java.util.List;

/**
 * primeNoH
 */
public class primeNoH {
    static boolean result = true;

    public static void main(String[] args) throws InterruptedException {
        long time = System.nanoTime();
        List<runner> runnerList = new ArrayList<>();
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            runnerList.add(new runner(i));
        }
        for (runner runn : runnerList) {
            threadList.add(new Thread(runn));
        }
        for (Thread thread : threadList) {
            thread.start();
        }
        System.out.println("Active threads: " + Thread.activeCount());
        for (Thread thread : threadList) {
            thread.join();
        }
        System.out.println("Active threads: " + Thread.activeCount());
        for (runner r : runnerList) {
            result = result && r.result;
        }
        System.out.println("Time Taken : " + (System.nanoTime() - time) / 1000000);
        System.out.println(result);
    }

    public static class runner implements Runnable {
        int index;
        boolean result;

        runner(int i) {
            index = i;
        }

        @Override
        public void run() {
            result = loop(this.index);
        }

    }

    private static boolean loop(int index) {
        boolean result = true;
        int limit = 100000 * (index + 1);
        System.out.println("From: " + ((index * 100000)) + "| To: " + limit);
        for (int i = 1 + (index * 100000); i < limit; i += 2) {
            result = result && (firstFactor(i) <= Math.sqrt(i));

        }
        return result;
    }

    private static int firstFactor(int i) {
        for (int j = 3; j < i; j += 2) {
            if (i % j == 0)
                return j;
        }
        return 1;
    }
}