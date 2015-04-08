

package javaapplication3;

public class EulerProblem12 {

    public static void main(String[] args) {
        EulerProblem12 result = new EulerProblem12();
        result.solve(500);
    }
    public void solve(int limit) {
        long num = 1;
        long iteration = 1;
        while (true) {
            iteration++;
            num = num + iteration;
            if(getDivisors(num) > limit) {
                System.out.println(num);
                break;
            }
        }
    }
        private int getDivisors(long num) {
            int divisors = 2;
            long limit = (long) Math.sqrt(num * 1.0);
            for (int current = 2; current < limit; current++) {
                if(num % current == 0) {
                    divisors = divisors + 2;
                }
            } 
            if(num % limit == 0) {
                divisors++;
            }
            return divisors;
        }
    
}
