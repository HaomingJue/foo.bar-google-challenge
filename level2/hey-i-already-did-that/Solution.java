import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static int solution(String n, int b) {
        //Your code here
        HashMap<String, Integer> map = new HashMap<>();
        String curr = n;
        int count = 0;
        while (true) {
            map.put(curr, count);
            count++;
            curr = assignTask(curr, b);
            if (map.containsKey(curr)) {
                count -= map.get(curr);
                break;
            }
        }
        return count;
    }

    private static String assignTask(String curr, int b) {
        char[] chars = curr.toCharArray();
        int[] small = new int[chars.length];
        for (int i = 0; i < small.length; i++) {
            small[i] = (int)chars[i] - (int)'0';
        }
        int[] big = new int[small.length];
        Arrays.sort(small);
        for (int i = 0; i < small.length; i++) {
            big[i] = small[small.length - i - 1];
        }

        for (int i = big.length - 1; i >= 0; i--) {
            big[i] = big[i] - small[i];
            if (big[i] < 0) {
                big[i] += b;
                big[i-1] -= 1;
            }
        }
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char)(big[i] + (int)'0');
        }
        return new String(chars);
    }

}