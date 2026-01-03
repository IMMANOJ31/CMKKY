package infosys;

public class GoodSubsequenceGCD {

    // Function to calculate GCD using Euclidean algorithm
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // Infosys required function
    public static int get_ans(int n, int[] a, int p, int q, int[][] queries) {

        int answer = 0;

        // Process each query
        for (int qi = 0; qi < q; qi++) {

            int index = queries[qi][0] - 1; // 1-based to 0-based
            int newValue = queries[qi][1];

            // Update array
            a[index] = newValue;

            int currentGCD = 0;
            int countDivisible = 0;

            // Check elements divisible by p
            for (int i = 0; i < n; i++) {
                if (a[i] % p == 0) {
                    countDivisible++;
                    if (currentGCD == 0) {
                        currentGCD = a[i];
                    } else {
                        currentGCD = gcd(currentGCD, a[i]);
                    }
                }
            }

            // GOOD subsequence condition
            if (currentGCD == p) {
                answer++;
            }
        }

        return answer;
    }

    // Main method for testing
    public static void main(String[] args) {

        int n = 2;
        int[] a = {3, 3};
        int p = 3;
        int q = 2;

        int[][] queries = {
                {2, 3},
                {1, 6}
        };

        System.out.println(get_ans(n, a, p, q, queries)); // Output: 2
    }
}
