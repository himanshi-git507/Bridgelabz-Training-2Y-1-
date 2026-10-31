package Arrays.Leetcode;

public class LeetCode_2379 {
    public int minimumRecolors(String blocks, int k) {
        int whiteCount = 0;
        int minOps = Integer.MAX_VALUE;

        for (int i = 0; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }

            if (i >= k) {
                if (blocks.charAt(i - k) == 'W') {
                    whiteCount--;
                }
            }

            if (i >= k - 1) {
                minOps = Math.min(minOps, whiteCount);
            }
        }

        return minOps;
    }

    public static void main(String[] args) {
        LeetCode_2379 solution = new LeetCode_2379();

        System.out.println(solution.minimumRecolors("WBBWWBBWBW", 7));
        System.out.println(solution.minimumRecolors("WBWBBBW", 2));
    }
}