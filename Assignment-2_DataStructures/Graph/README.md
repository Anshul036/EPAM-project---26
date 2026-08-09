# Graph – Efficiently Reachable Cities

## 📌 Problem Statement

A country's transportation network is represented as a **connected undirected graph**.

* Each city is represented by a vertex.
* Each road is represented by an edge.
* City `1` is the capital.
* Every road has a length of `1`.

A city is considered **efficiently reachable** if the shortest path from City `1` to that city contains at most `D` roads.

The objective is to determine the total number of efficiently reachable cities, including the capital.

---

## 📂 Project Structure

```text
Graph/
│
├── Question2.java
└── README.md
```

`Question2.java` contains the solution for finding the number of cities whose shortest distance from City `1` is less than or equal to `D`.

---

## 📝 Input Format

```text
N M D
u1 v1
u2 v2
...
uM vM
```

Where:

* `N` = number of cities
* `M` = number of roads
* `D` = maximum allowed number of roads
* `u v` = an undirected road between cities `u` and `v`

---

## 📤 Output Format

Print a single integer representing the number of efficiently reachable cities.

---

## 🔢 Constraints

```text
1 ≤ N ≤ 10^5
0 ≤ M ≤ 2 × 10^5
0 ≤ D ≤ N
```

Additional conditions:

* The graph is connected.
* The graph is undirected.
* There are no self-loops.

---

# 💡 Approach 1: Brute Force

A straightforward approach is to perform a DFS from City `1` while maintaining the current distance.

For every path explored:

1. Start from City `1`.
2. Keep track of the number of roads used.
3. Stop exploring when the distance becomes greater than `D`.
4. Mark cities that can be reached within `D` roads.

A more expensive brute-force implementation can explore multiple possible paths before determining the shortest distance.

Because graphs can contain cycles, the number of possible paths can grow very quickly.

### Complexity

A naive path-enumeration approach can have very high time complexity and is not suitable for the given constraints.

Therefore, a better algorithm is required.

---

# ⚡ Approach 2: Optimal Solution — BFS

Since every road has the same weight (`1`), this is an **unweighted shortest-path problem**.

The optimal algorithm is **Breadth-First Search (BFS)**.

BFS has an important property:

> When a city is visited for the first time, BFS has found the shortest path from the starting city to that city.

Therefore, we can start BFS from City `1` and maintain the shortest distance of every city.

### Algorithm

1. Create an adjacency list to represent the graph.
2. Initialize all distances to `-1`.
3. Set:

```text
distance[1] = 0
```

4. Add City `1` to the queue.
5. While the queue is not empty:

   * Remove the front city.
   * Visit all its unvisited neighbors.
   * Set:

```text
distance[neighbor] = distance[current] + 1
```

* If the new distance is less than or equal to `D`, count the city.

6. Stop expanding a city when its distance is already `D`, because all of its neighbors would require more than `D` roads.

---

## 🔍 Example

### Input

```text
7 8 2
1 2
1 3
2 4
2 5
3 6
6 7
5 7
4 6
```

The graph can be visualized approximately as:

```text
        1
       / \
      2   3
     / \   \
    4   5   6
         \ / \
          7
```

Shortest distances from City `1`:

```text
City 1 → 0 roads
City 2 → 1 road
City 3 → 1 road
City 4 → 2 roads
City 5 → 2 roads
City 6 → 2 roads
City 7 → 3 roads
```

Given:

```text
D = 2
```

The efficiently reachable cities are:

```text
1, 2, 3, 4, 5, 6
```

City `7` is not counted because its shortest path requires `3` roads.

Therefore:

```text
Output:
6
```

---

# 🧠 Why BFS?

Consider the BFS traversal:

```text
Distance 0:
    1

Distance 1:
    2, 3

Distance 2:
    4, 5, 6

Distance 3:
    7
```

BFS processes the graph level by level.

Each level represents the number of roads used from the capital.

Therefore, when we reach distance `D`, we know exactly which cities satisfy the requirement.

---

# 💻 Java Implementation

The solution is implemented in:

```text
Question2.java
```

The implementation uses:

* `ArrayList` for the adjacency list
* `Queue` for BFS
* `int[]` for shortest distances
* Iterative traversal to efficiently handle large graphs

---

## ⏱️ Complexity Analysis

For an adjacency-list representation:

### Time Complexity

```text
O(N + M)
```

Every city is visited at most once, and every road is examined at most twice because the graph is undirected.

### Space Complexity

```text
O(N + M)
```

The adjacency list stores all roads, while the distance array and BFS queue require `O(N)` additional space.

---

## 📊 Approach Comparison

| Approach    | Algorithm              |       Time Complexity | Space Complexity |
| ----------- | ---------------------- | --------------------: | ---------------: |
| Brute Force | DFS / path exploration | Potentially very high |         O(N + M) |
| **Optimal** | **BFS**                |          **O(N + M)** |     **O(N + M)** |

For the given constraints:

```text
N ≤ 100,000
M ≤ 200,000
```

the BFS solution is the recommended approach.

---

## 🚀 How to Run

Make sure Java is installed.

### Compile

```bash
javac Question2.java
```

### Run

```bash
java Question2
```

### Sample Input

```text
7 8 2
1 2
1 3
2 4
2 5
3 6
6 7
5 7
4 6
```

### Sample Output

```text
6
```

---

## 🔑 Key Concepts

This problem demonstrates the following data-structure and algorithm concepts:

* Graph representation
* Undirected graphs
* Adjacency lists
* Breadth-First Search (BFS)
* Shortest path in an unweighted graph
* Queue
* Distance tracking
* Graph traversal
* Time and space complexity analysis

---

## 📁 Source Code

The implementation can be found here:

`Question2.java`

The `Graph` problem is part of **Assignment 2 – Data Structures** in the EPAM project.

---

## 👨‍💻 Author

**Anshul**

GitHub: `Anshul036`

---

## 📄 License

This project is intended for educational and assignment purposes.
