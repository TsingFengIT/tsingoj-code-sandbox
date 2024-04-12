import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String args[]) throws Exception
    {
        Scanner cin=new Scanner(System.in);
        int a=cin.nextInt(),b=cin.nextInt();
        System.out.println(a+b);
    }
}
class Solution {
    public int countWays(int[][] ranges) {
        Arrays.sort(ranges, (a, b) -> a[0] - b[0]);
        int ans = 1;
        int maxR = -1;
        for (int[] p : ranges) {
            if (p[0] > maxR) { // 无法合并
                ans = ans * 2 % 1_000_000_007; // 新区间
            }
            maxR = Math.max(maxR, p[1]); // 合并
        }
        return ans;
    }
}
