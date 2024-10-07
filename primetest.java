public class primetest {
    public static void main(String[] args) {

        long time = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            isPrimeOLD(i);
        }
        System.out.println("Time Taken Old : " + (System.nanoTime() - time) / 1000000);

        time = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            isPrime(i);
        }
        System.out.println("Time Taken New : " + (System.nanoTime() - time) / 1000000);

    }

    // !Old Algorithm
    static boolean isPrimeOLD(int i) {
        if (i == 0 || i == 1)
            return false;
        for (int j = 2; j < i; j++) {
            if (i % j == 0)
                return false;
        }
        return true;
    }

    // !New Algorithm
    static boolean isPrime(int i) {
        if (i == 0 || i == 1)
            return false;
        if (i == 2)
            return true;
        if (i % 2 == 0)
            return false;
        int sqrt = (int) Math.sqrt(i);
        for (int j = 3; j <= sqrt; j += 2) {
            if (i % j == 0)
                return false;
        }
        return true;
    }

}
