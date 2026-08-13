// Brute Force

// import java.util.*;

// public class Main {

//     static int[] points;

//     static int solve(int index) {
//         if (index >= points.length) {
//             return 0;
//         }

//         int take = points[index] + solve(index + 2);

//         int skip = solve(index + 1);

//         return Math.max(take, skip);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         points = new int[n];

//         for (int i = 0; i < n; i++) {
//             points[i] = sc.nextInt();
//         }

//         System.out.println(solve(0));
//     }
// }

// Optimal Approach

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] points = new int[n];

        for (int i = 0; i < n; i++) {
            points[i] = sc.nextInt();
        }

        if (n == 1) {
            System.out.println(points[0]);
            return;
        }

        int[] dp = new int[n];

        dp[0] = points[0];
        dp[1] = Math.max(points[0], points[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(
                dp[i - 1],
                points[i] + dp[i - 2]
            );
        }

        System.out.println(dp[n - 1]);
    }
}

