package eulerproblems;

/**
 * @author Guillermo
 */
public class EulerProblem5 {
    public static void main(String[] args) {
        EulerProblem5 problem = new EulerProblem5();
        problem.largestEvenDivisible(20);
    }
    public void largestEvenDivisible(int end) {
        boolean finished = false;
        // Counting by 6 because all the numbers are divisible by 2 & 3
        for (int num = 6; !finished; num+=6) {
            boolean evenlyDivisible = true;
            for (int divisor = 1; divisor <= end; divisor++) {
                if (num % divisor != 0) {
                    evenlyDivisible = false;
                }
            }
            if(evenlyDivisible) {
                System.out.println(num);
                finished = true;
            }
        }
    }
}
