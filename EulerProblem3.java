package eulerproblems;

import java.util.*;

public class EulerProblem3 {
    
    public static void main(String[] args) {
        EulerProblem3 prob = new EulerProblem3();
        prob.largestPrimeFactor(600851475143l);
        
    }
    
    public void largestPrimeFactor(long num ) {
        ArrayList<Long> primes = new ArrayList<>();
        long working = num;
        long current = 2;
        while (working != 1) {
            boolean isPrime = true;
            for (Long alpha : primes) {
                if (current % alpha == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(current);
                if (working % current == 0 ) {
                    working = working / current;
                }
            }
            current++;
        }
        System.out.println(primes.get(primes.size() - 1));
    }
    
}
