import java.math.BigInteger;

public class Solution {
    public static int solution(String x) {
        BigInteger num = new BigInteger(x);
        return solution(num);
    }

    public static int solution(BigInteger num) {
        // Your code here
        int count = 0;

        BigInteger zero = new BigInteger("0");
        BigInteger one = new BigInteger("1");
        BigInteger two = new BigInteger("2");
        BigInteger three = new BigInteger("3");
        BigInteger four = new BigInteger("4");
        if (num.equals(one)) {
            return 0;
        }
        else if (num.equals(two)) {
            return 1;
        }
        else if (num.mod(two).equals(zero)) {
            return solution(num.divide(two)) + 1;
        }
        else {
            if (num.add(one).mod(four).equals(zero) && !num.equals(three)) {
                return solution(num.add(one)) + 1;
            } else {
                return solution(num.subtract(one)) + 1;
            }
        }
    }
}