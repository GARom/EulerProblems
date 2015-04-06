
import java.util.ArrayList;

public class EulerProblem7 {

    public static void main(String[] args) {
        EulerProblem7 result = new EulerProblem7();
        result.getPrime(6);
        result.getPrime(10001);
    }
    
    public void getPrime(int n) {
        //Creates primes like EulerProblem3
        ArrayList<Long> primes = new ArrayList<>();
        primes.add(2L);
        long current = 3;
        while (primes.size() < n) {
            boolean isPrime = true;
            for (long alpha : primes) {
                if(current % alpha == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(current);
            }
            current = current +2;
            
        }
        System.out.println(primes.get(primes.size() -1));
    }
    
}
