import java.util.ArrayList;

/**
 * @author Guillermo
 */
public class EulerProblem10 {

    public static void main(String[] args) {
        sumPrimes(2000000);
    }
    
    public static void sumPrimes(int limit) {
        //generates primes
        ArrayList<Long> primes = new ArrayList<>();
        primes.add(2L);
        long sum = 2;
        long current = 3;
        while (current < limit) {
            boolean isPrime = true;
            long factorLimit = (long) Math.sqrt(current);
            
            for (Long alpha : primes) {
                if (current % alpha == 0) {
                    isPrime = false;
                    break;
                }
                if(alpha > factorLimit) {
                    break;
                }
            }
            if (isPrime) {
                primes.add(current);
                sum = sum + current;
            }
            current = current + 2;
        }
        System.out.println(sum);
    }
}
