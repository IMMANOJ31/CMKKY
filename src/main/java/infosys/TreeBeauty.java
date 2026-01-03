package infosys;

import java.util.*;

public class TreeBeauty {

    static final long MOD = 1000000007L;
    static List<Integer>[] tree;
    static int[] squareFree;
    static long answer;

    // Function to compute square-free value
    static int getSquareFree(int x) {
        int res = 1;
        for (int i = 2; i * i <= x; i++) {
            int count = 0;
            while (x % i == 0) {
                x /= i;
                count++;
            }
            if (count % 2 == 1) {
                res *= i;
            }
        }
        if (x > 1) res *= x;
        return res;
    }

    // DFS function
    static Map<Integer, Long> dfs(int node) {
        Map<Integer, Long> freq = new HashMap<>();

        for (int child : tree[node]) {
            Map<Integer, Long> childMap = dfs(child);

            // Merge smaller map into larger map
            if (childMap.size() > freq.size()) {
                Map<Integer, Long> temp = freq;
                freq = childMap;
                childMap = temp;
            }

            for (int key : childMap.keySet()) {
                long cnt = childMap.get(key);
                answer = (answer + freq.getOrDefault(key, 0L) * cnt) % MOD;
                freq.put(key, freq.getOrDefault(key, 0L) + cnt);
            }
        }

        // Add current node
        answer = (answer + freq.getOrDefault(squareFree[node], 0L)) % MOD;
        freq.put(squareFree[node], freq.getOrDefault(squareFree[node], 0L) + 1);

        return freq;
    }

    // Infosys required function
    public static long get_ans(int n, int[] par, int[] a) {
        tree = new ArrayList[n];
        squareFree = new int[n];
        answer = 0;

        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
            squareFree[i] = getSquareFree(a[i]);
        }

        for (int i = 1; i < n; i++) {
            tree[par[i]].add(i);
        }

        dfs(0);
        return answer;
    }

    // Main method for testing
    public static void main(String[] args) {
        int n = 5;
        int[] par = {0, 0, 0, 1, 1};
        int[] a = {2, 3, 6, 12, 27};
        System.out.println(get_ans(n, par, a));

    }
}

