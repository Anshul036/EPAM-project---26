# Greedy – Scholarship Distribution

## 📌 Problem Statement

A college has a limited scholarship budget and `N` students. Each student has a minimum scholarship amount they are willing to accept.

The objective is to determine the **maximum number of students** who can receive scholarships without exceeding the total budget.

Each student can receive at most one scholarship.

---

## 📂 Project Structure

```text
Greedy/
│
├── Main.java
└── README.md
```

`Main.java` contains both the brute-force and optimal greedy solutions.

---

## 📝 Input Format

```text
N B
a1 a2 a3 ... aN
```

Where:

* `N` = number of students
* `B` = total available budget
* `ai` = minimum scholarship required by student `i`

---

## 📤 Output Format

Print a single integer representing the maximum number of students who can receive scholarships.

---

## 🔢 Constraints

```text
1 ≤ N ≤ 100000
1 ≤ B ≤ 10^9
1 ≤ ai ≤ 10^6
```

---

# 💡 Approach 1: Brute Force

The brute-force approach considers every possible subset of students.

For each student, there are two choices:

1. Select the student.
2. Skip the student.

For every possible combination, calculate the total scholarship amount and keep the maximum number of students whose total does not exceed the budget.

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

# ⚡ Approach 2: Optimal Solution — Greedy

To maximize the number of students, we should always select the students requiring the **smallest scholarship amounts first**.

### Algorithm

1. Sort all scholarship requirements in ascending order.
2. Initialize `total = 0` and `count = 0`.
3. Traverse the sorted array.
4. If adding the current scholarship does not exceed the budget:

   * Add it to `total`.
   * Increment `count`.
5. Otherwise, stop.
6. Print `count`.

### Why Greedy Works

For any fixed number of students, choosing the students with the smallest scholarship requirements gives the minimum possible total cost.

Therefore, if the sum of the smallest `k` scholarships exceeds the budget, no other selection of `k` students can fit within the budget.

---

## 🔍 Example

### Input

```text
5 20
4 8 2 6 5
```

After sorting:

```text
2 4 5 6 8
```

Selection:

```text
2 + 4 + 5 + 6 = 17
```

Adding `8` would result in:

```text
17 + 8 = 25
```

Since `25 > 20`, the fifth student cannot be selected.

### Output

```text
4
```

---

# 💻 Java Implementation

The solution is implemented in:

```text
Main.java
```

The implementation uses:

* `Arrays.sort()` for sorting
* Greedy selection
* `long` for safely storing the total budget
* Iterative traversal

---

## ⏱️ Complexity Analysis

### Brute Force

**Time Complexity:**

```text
O(2^N)
```

**Space Complexity:**

```text
O(N)
```

### Optimal Greedy

**Time Complexity:**

```text
O(N log N)
```

Sorting takes `O(N log N)` and the traversal takes `O(N)`.

**Space Complexity:**

```text
O(N)
```

---

## 📊 Approach Comparison

| Approach    | Algorithm          | Time Complexity | Space Complexity |
| ----------- | ------------------ | --------------- | ---------------- |
| Brute Force | Subset / Recursion | `O(2^N)`        | `O(N)`           |
| Optimal     | Sorting + Greedy   | `O(N log N)`    | `O(N)`           |

For the given constraint `N ≤ 100000`, the **Greedy solution is recommended**.

---

## 🚀 How to Run

Make sure Java is installed.

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
5 20
4 8 2 6 5
```

### Sample Output

```text
4
```

---

## 🔑 Key Concepts

This problem demonstrates:

* Greedy algorithms
* Sorting
* Subset exploration
* Optimization
* Budget-based selection
* Time and space complexity analysis

---

## 📁 Source Code

The implementation can be found here:

```text
Main.java
```

This problem is part of **Assignment 3 – Greedy & DP** in the EPAM project.

---

## 👨‍💻 Author

**Anshul**

GitHub: `Anshul036`

---

## 📄 License

This project is intended for educational and assignment purposes.
