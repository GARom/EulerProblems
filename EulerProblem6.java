
/**
 * @author Guillermo
 */
public class EulerProblem6 {

    public static void main(String[] args) {
        EulerProblem6 result = new EulerProblem6();
        result.subtract(100);
    }
    
    public void subtract (int end) {
        System.out.println(squareOfSums(end) - sumOfSquares(end));
    }
    
    private long sumOfSquares(int end) {
        long answer = 0;
        for (int i = 1; i <= end; i++ ) {
            answer = answer + i*i;
        }
        return answer;
    }
    
    private long squareOfSums(int end) {
        long answer = 0;
        for (int i = 1; i <= end; i++ ) {
            answer = answer + i;
        }
        return answer * answer;
    }
}
