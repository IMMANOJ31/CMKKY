package infosys;

import java.util.Arrays;

public class LongestNonDecreasingSubsequenceXOR {

    // Infosys required function
    public static int get_ans(int N, int M, int[] A) {

        // dp[x] = longest length of a non-decreasing subsequence
        // with XOR value = x
        int MAX_XOR = 1024; // safe upper bound
        int[] dp = new int[MAX_XOR];
        Arrays.fill(dp, -1);

        int answer = 0;

        for (int i = 0; i < N; i++) {
            int val = A[i];

            // Copy current dp to avoid overwriting in same iteration
            int[] newDp = Arrays.copyOf(dp, MAX_XOR);

            // Case 1: start a new subsequence with A[i]
            newDp[val] = Math.max(newDp[val], 1);

            // Case 2: extend previous subsequences
            for (int x = 0; x < MAX_XOR; x++) {
                if (dp[x] != -1) {
                    int newXor = x ^ val;
                    newDp[newXor] = Math.max(newDp[newXor], dp[x] + 1);
                }
            }

            dp = newDp;
        }

        // Find the maximum length where XOR ≥ M
        for (int x = M; x < MAX_XOR; x++) {
            answer = Math.max(answer, dp[x]);
        }

        return answer == -1 ? 0 : answer;
    }

    // Main method for testing
    public static void main(String[] args) {

        int N = 4;
        int M = 3;
        int[] A = {1, 2, 3, 4};

        System.out.println(get_ans(N, M, A)); // Expected Output: 4
    }
}
