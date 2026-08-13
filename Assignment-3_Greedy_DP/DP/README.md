# Dynamic Programming – Maximum Learning Points

## 📌 Problem Statement

A student has `N` topics arranged in order. Each topic provides a certain number of learning points.

The student cannot select **two consecutive topics**. The objective is to find the **maximum learning points** that can be earned.

---

## 📂 Project Structure

```text
DP/
│
├── Main.java
└── README.md
```

`Main.java` contains the brute-force and optimized dynamic programming solutions.

---

## 📝 Input Format

```text
N
p1 p2 p3 ... pN
```

Where:

* `N` = number of topics
* `pi` = learning points for topic `i`

---

## 📤 Output Format

Print the maximum learning points that can be earned without selecting two consecutive topics.

---

## 🔢 Constraints

```text
1 ≤ N ≤ 100000
1 ≤ Points ≤ 10000
```

---

# 💡 Approach 1: Brute Force

The brute-force approach considers two choices for every topic:

1. Select the current topic and skip the next topic.
2. Skip the current topic and move to the next topic.

The maximum of these two choices gives the answer.

### Complexity

**Time Complexity:**

```text
O(2^N)
```

**Space Complexity:**

```text
O(N)
```

The brute-force approach is not suitable for large values of `N`.

---

# ⚡ Approach 2: Optimal Solution — Dynamic Programming

For every topic, we have two choices:

* **Skip:** Keep the maximum points obtained so far.
* **Take:** Add the current topic's points to the result from two positions earlier.

The recurrence is:

```text
dp[i] = max(dp[i - 1], points[i] + dp[i - 2])
```

### Algorithm

1. Initialize the first two DP values.
2. For every topic from index `2` onwards:

   * Calculate the value if the topic is selected.
   * Calculate the value if the topic is skipped.
   * Store the maximum.
3. The final DP value gives the maximum learning points.

---

## 🚀 Space Optimized DP

Only the previous two DP values are required, so the complete DP array can be avoided.

### Complexity

**Time Complexity:**

```text
O(N)
```

**Space Complexity:**

```text
O(1)
```

This is the recommended solution for the given constraints.

---

## 🔍 Example

### Input

```text
6
5 1 2 10 6 2
```

An optimal selection is:

```text
5 + 2 + 10 = 17
```

Therefore:

### Output

```text
17
```

---

# 💻 Java Implementation

The solution is implemented in:

```text
Main.java
```

The implementation uses:

* Dynamic Programming
* Space optimization
* Iterative traversal
* `O(1)` auxiliary space

---

## 📊 Approach Comparison

| Approach     | Algorithm               | Time Complexity | Space Complexity |
| ------------ | ----------------------- | --------------- | ---------------- |
| Brute Force  | Recursion               | `O(2^N)`        | `O(N)`           |
| DP           | Dynamic Programming     | `O(N)`          | `O(N)`           |
| Optimized DP | DP + Space Optimization | `O(N)`          | `O(1)`           |

---

## 🚀 How to Run

### Compile

```bash
javac Main.java
```

### Run

```bash
java Main
```

### Sample Input

```text
6
5 1 2 10 6 2
```

### Sample Output

```text
17
```

---

## 🔑 Key Concepts

This problem demonstrates:

* Dynamic Programming
* Recursion
* Optimal substructure
* Space optimization
* Time and space complexity analysis

---

## 👨‍💻 Author

**Anshul**

GitHub: `Anshul036`

---

## 📄 License

This project is intended for educational and assignment purposes.
