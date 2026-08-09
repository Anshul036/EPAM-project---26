
//Brute-force Solution

//import java.util.*;
//
//public class Question1 {
//
//    static int n;
//    static long k;
//    static long[] key;
//    static List<Integer>[] graph;
//
//    static long findXor(int target) {
//        boolean[] visited = new boolean[n + 1];
//
//        Stack<long[]> stack = new Stack<>();
//
//        stack.push(new long[]{1, 0, key[1]});
//        visited[1] = true;
//
//        while (!stack.isEmpty()) {
//            long[] curr = stack.pop();
//
//            int node = (int) curr[0];
//            int parent = (int) curr[1];
//            long xor = curr[2];
//
//            if (node == target) {
//                return xor;
//            }
//
//            for (int next : graph[node]) {
//                if (next != parent) {
//                    stack.push(new long[]{
//                            next,
//                            node,
//                            xor ^ key[next]
//                    });
//                }
//            }
//        }
//
//        return 0;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        n = sc.nextInt();
//        k = sc.nextLong();
//
//        key = new long[n + 1];
//
//        for (int i = 1; i <= n; i++) {
//            key[i] = sc.nextLong();
//        }
//
//        graph = new ArrayList[n + 1];
//
//        for (int i = 1; i <= n; i++) {
//            graph[i] = new ArrayList<>();
//        }
//
//        for (int i = 0; i < n - 1; i++) {
//            int u = sc.nextInt();
//            int v = sc.nextInt();
//
//            graph[u].add(v);
//            graph[v].add(u);
//        }
//
//        int answer = 0;
//
//        for (int node = 1; node <= n; node++) {
//
//            long pathXor = findXor(node);
//
//            if (pathXor >= k) {
//                answer++;
//            }
//        }
//
//        System.out.println(answer);
//
//        sc.close();
//    }
//}



//Optimal Solution

import java.io.*;
import java.util.*;

public class Question1 {

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            int num = 0;
            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }

            return num * sign;
        }
    }

    static class State {
        int node;
        int parent;
        long xor;

        State(int node, int parent, long xor) {
            this.node = node;
            this.parent = parent;
            this.xor = xor;
        }
    }

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();

        int n = fs.nextInt();
        long k = fs.nextInt();

        long[] key = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            key[i] = fs.nextInt();
        }

        List<Integer>[] graph = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int u = fs.nextInt();
            int v = fs.nextInt();

            graph[u].add(v);
            graph[v].add(u);
        }

        long answer = 0;

        Stack<State> stack = new Stack<>();

        stack.push(new State(1, 0, 0));

        while (!stack.isEmpty()) {

            State current = stack.pop();

            int u = current.node;
            int parent = current.parent;

            long pathXor = current.xor ^ key[u];

            if (pathXor >= k) {
                answer++;
            }

            for (int v : graph[u]) {
                if (v != parent) {
                    stack.push(new State(v, u, pathXor));
                }
            }
        }

        System.out.println(answer);
    }
}
