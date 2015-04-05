package eulerproblems;
/**
 * @author Guillermo
 */
public class EulerProblem1 {
    
    public static void main(String[] args) {
	EulerProblem1 prob = new EulerProblem1();
        prob.result(10); // Checking if I get 23
        prob.result(100);
        prob.result(1000); //answer
        prob.result(10000); // I started noticing a pattern
    }
    public void result(long range) {
        int sum = 0;
	for (int i = 0; i < range; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
	System.out.println(sum);
    }
	
}
