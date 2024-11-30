public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] p = new boolean[n + 1];  
        for(int i = 2; i < n; i++){
            p[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (p[i]) {
                for (int j = i * i; j <= n; j += i) {
                    p[j] = false;
                }
            }
        }
        System.out.println("Prime numbers up to " + n + ":");
         double counter = 0.0;
         for(int k = 0; k < p.length; k++){
            if(p[k]){
                System.out.println(k);
                counter++;
            }
        }
        int totalNumbers = n - 1; // Numbers between 2 and n
        int percentage = (int) Math.round(((double) counter / totalNumbers) * 100);

        // Print total count of primes with percentage
        System.out.println("There are " + counter + " primes between 2 and " + n +
                " (" + percentage + "% are primes)");
    }

       
    }
}