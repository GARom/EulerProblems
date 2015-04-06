package eulerproblems;

public class EulerProblem4 {

    public static void main(String[] args) {
        EulerProblem4 prob = new EulerProblem4();
        prob.largestPalindrome(100, 1000);
    }
    
    public void largestPalindrome(int start, int end) {
        int palin = 0;
        for (int x = start; x < end; x++) {
            for (int y = start; y < end; y++) {
                int value =  x*y;
                if (isPalindrome(value) && value > palin) {
                    palin = value;
                }
            }  
        }
        System.out.println(palin);
    }
    
    private boolean isPalindrome(int num) {
        StringBuffer sb = new StringBuffer(Integer.toString(num));
        return Integer.toString(num).equalsIgnoreCase(sb.reverse().toString());
    }
}
