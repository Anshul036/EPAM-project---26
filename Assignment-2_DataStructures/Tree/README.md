# Tree – Trusted Servers Using XOR

## 📌 Problem Statement

Given a tree with `N` nodes, each node contains an integer value.

The tree is rooted at **Node 1**. For every node, calculate the XOR of all node values on the path from the root to that node.

A node is considered **trusted** if:

```text
XOR of values on the root-to-node path >= K
```

The task is to count the total number of trusted nodes, including the root.

---

## 📂 Project Structure

```text
Tree/
│
├── Question1.java
└── README.md
```

The `Question1.java` file contains:

* Brute-force approach
* Optimized approach
* Iterative DFS traversal
* Fast input handling for large inputs

---

## 💡 Approach 1: Brute Force

In the brute-force approach, we calculate the root-to-node XOR independently for every node.

For each target node:

1. Start DFS from the root.
2. Traverse the tree until the target node is reached.
3. Maintain the XOR value along the current path.
4. Check whether the calculated XOR is greater than or equal to `K`.
5. Increment the answer if the condition is satisfied.

### Complexity

```text
Time Complexity:  O(N²)
Space Complexity: O(N)
```

The brute-force approach can become slow for large values of `N`.

---

## ⚡ Approach 2: Optimized Solution

The optimized solution avoids recalculating the complete path for every node.

While performing DFS, we maintain the XOR value from the root to the current node.

For a node `u`:

```text
pathXor[u] = pathXor[parent] XOR value[u]
```

Therefore, when moving from a parent to its child, we only need to XOR the child's value with the XOR already calculated for the parent.

### Algorithm

1. Start DFS from Node `1`.
2. Initially, the XOR before processing the root is `0`.
3. For every visited node:

```text
pathXor = previousXor ^ value[node]
```

4. If:

```text
pathXor >= K
```

increment the answer.
5. Continue DFS for all neighboring nodes except the parent.
6. Print the final count.

### Complexity

```text
Time Complexity:  O(N)
Space Complexity: O(N)
```

This is optimal because every node in the tree must be visited at least once.

---

## 🧮 Example

### Input

```text
7 5
3 6 2 7 1 4 5
1 2
1 3
2 4
2 5
3 6
3 7
```

The root-to-node XOR values are:

```text
Node 1: 3
Node 2: 3 ^ 6     = 5
Node 3: 3 ^ 2     = 1
Node 4: 3 ^ 6 ^ 7 = 2
Node 5: 3 ^ 6 ^ 1 = 4
Node 6: 3 ^ 2 ^ 4 = 5
Node 7: 3 ^ 2 ^ 5 = 4
```

For `K = 5`, the trusted nodes are:

```text
Node 2 → 5 >= 5
Node 6 → 5 >= 5
```

Therefore, according to the stated condition, the result is:

```text
2
```

> **Note:** If an assignment specifies a different expected output for this sample, verify the original problem statement because the root-to-node XOR condition above produces `2` for the provided input.

---

## 🛠️ Technologies Used

* **Java**
* Arrays
* `ArrayList`
* Stack
* Depth First Search (DFS)
* Bitwise XOR (`^`)
* Fast input using `BufferedInputStream`-style input handling

---

## 🔑 Key Concept: XOR

XOR is a bitwise operation represented in Java using:

```java
^
```

For example:

```text
3 ^ 6 = 5
```

The important property used in this problem is that XOR can be accumulated incrementally:

```text
parentXor ^ currentNodeValue
```

This allows us to calculate the root-to-node XOR in constant time when moving to a child.

---

## 🚀 Running the Program

Make sure Java is installed.

### Compile

From the `Tree` directory:

```bash
javac Question1.java
```

### Run

```bash
java Question1
```

### Example

```text
Input:
7 5
3 6 2 7 1 4 5
1 2
1 3
2 4
2 5
3 6
3 7

Output:
2
```

---

## 📊 Complexity Comparison

| Approach      | Time    | Space  |
| ------------- | ------- | ------ |
| Brute Force   | `O(N²)` | `O(N)` |
| Optimized DFS | `O(N)`  | `O(N)` |

The optimized DFS solution is preferred for large inputs because it processes each node only once.

---

## 📁 Source Code

The implementation is available in:

[`Question1.java`](./Question1.java)

The repository is part of the **EPAM Project – Assignment 2: Data Structures**.

---

## 👨‍💻 Author

**Anshul**

GitHub: [Anshul036](https://github.com/Anshul036)

---

## 📄 License

This project is intended for educational and assignment purposes.
