
package eulerproblems;
/**
 * @author Guillermo
 */
public class EulerProblem2 {

    public static void main(String[] args) {
      //Fibonacci Sequence in current times is 0,1,1,2,3,5,8,13,21,34,55,89...
        long previous = 0; //F0 = 0
        long current = 1; // F1 = 1
        long next = 1; // F2 = 1
        long answer = 0;
        do {
            previous = current;
            current = next;
            next = current + previous;
            if (current % 2 == 0) {
                answer = answer + current;
            }
        } while(next < 4000000);
        System.out.println(answer);
    }
    
}
