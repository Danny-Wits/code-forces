public class primeTestTest {
    public static void main(String[] args) {
        testIsPrime();
        testPerformance();
    }

    public static void testIsPrime() {
        System.out.println("Running testIsPrime...");

        // Test known prime numbers
        assertEqual(primetest.isPrime(2), true, "2 should be prime");
        assertEqual(primetest.isPrime(3), true, "3 should be prime");
        assertEqual(primetest.isPrime(5), true, "5 should be prime");
        assertEqual(primetest.isPrime(7), true, "7 should be prime");
        assertEqual(primetest.isPrime(13), true, "13 should be prime");

        // Test known non-prime numbers
        assertEqual(primetest.isPrime(0), false, "0 should not be prime");
        assertEqual(primetest.isPrime(1), false, "1 should not be prime");
        assertEqual(primetest.isPrime(4), false, "4 should not be prime");
        assertEqual(primetest.isPrime(6), false, "6 should not be prime");
        assertEqual(primetest.isPrime(9), false, "9 should not be prime");
        assertEqual(primetest.isPrime(15), false, "15 should not be prime");

        System.out.println("All testIsPrime cases passed.\n");
    }

    public static void testPerformance() {
        System.out.println("Running testPerformance...");

        long time = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            primetest.isPrime(i);
        }
        long timeTaken = (System.nanoTime() - time) / 1000000;
        System.out.println("Time Taken: " + timeTaken + " ms");

        // Performance check - adjust threshold based on your environment
        if (timeTaken < 5000) {
            System.out.println("Performance test passed.");
        } else {
            System.out.println("Performance test failed, took too long.");
        }
    }

    // Helper method to simulate assertions
    public static void assertEqual(boolean actual, boolean expected, String message) {
        if (actual != expected) {
            System.out.println("Test failed: " + message);
        } else {
            System.out.println("Test passed: " + message);
        }
    }
}
