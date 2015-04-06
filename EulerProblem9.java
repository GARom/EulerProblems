/**
 * @author Guillermo
 */
public class EulerProblem9 {

    public static void main(String[] args) {
        pythagoreanTriplet();
    }
    public static void pythagoreanTriplet() {
        for(int i =1; i < 999; i++) {
            for(int j = 1; j <= i ; j++) {
                int k = 1000 - i -j;
                if(k*k == i*i + j*j) {
                    System.out.println(i*j*k);
                    return;
                }
            }
        }
    }
}
