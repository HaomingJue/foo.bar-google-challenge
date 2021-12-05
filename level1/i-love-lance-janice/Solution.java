public class Solution {
    public static String solution(String x) {
        // your code here
        char[] deciphered = x.toCharArray();
        char[] original = new char[deciphered.length];
        for (int i = 0; i < deciphered.length; i++) {
            if (deciphered[i] <= 'z' && deciphered[i] >= 'a') {
                original[i] = (char)((int)'z' - (int)deciphered[i] + (int)'a');
            } else {
                original[i] = deciphered[i];
            }
        }
        return new String(original);
    }
}