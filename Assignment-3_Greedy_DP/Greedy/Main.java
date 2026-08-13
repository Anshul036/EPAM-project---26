// Brute Force Solution

//import java.util.*;

// public class Main {

//     static long budget;
//     static int[] scholarship;
//     static int n;
//     static int maxStudents = 0;

//     static void solve(int index, long sum, int count) {
//         if (sum > budget) {
//             return;
//         }

//         maxStudents = Math.max(maxStudents, count);

//         if (index == n) {
//             return;
//         }

//         solve(index + 1, sum + scholarship[index], count + 1);

//         solve(index + 1, sum, count);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         n = sc.nextInt();
//         budget = sc.nextLong();

//         scholarship = new int[n];

//         for (int i = 0; i < n; i++) {
//             scholarship[i] = sc.nextInt();
//         }

//         solve(0, 0, 0);

//         System.out.println(maxStudents);
//     }
// }



// Optimal Solution

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long budget = sc.nextLong();

        int[] scholarship = new int[n];

        for (int i = 0; i < n; i++) {
            scholarship[i] = sc.nextInt();
        }

        Arrays.sort(scholarship);

        long total = 0;
        int count = 0;

        for (int amount : scholarship) {
            if (total + amount <= budget) {
                total += amount;
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);
    }
}
