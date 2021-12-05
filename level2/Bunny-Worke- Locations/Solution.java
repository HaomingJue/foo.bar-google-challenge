public class Solution {
    public static String solution(long x, long y) {
        //Your code here
        long level = x + y - 1;
        long tempId = (level - 1) * level / 2;
        tempId += x;
        return Long.toString(tempId);
    }
}