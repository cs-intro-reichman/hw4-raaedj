public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); 
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true; // Assume all numbers are prime initially
        }

        // Implement the Sieve of Eratosthenes
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false; // Mark multiples of i as non-prime
                }
            }
        }

        // Output the prime numbers and count them
        System.out.println("Prime numbers up to " + n + ":");
        int primeCount = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                primeCount++;
            }
        }

        // Correctly calculate and display the percentage of primes
        double percentage = ((double) primeCount / (n - 1)) * 100;
        System.out.println("There are " + primeCount + " primes between 2 and " + n +
                " (" + Math.round(percentage) + "% are primes)");
    }
}