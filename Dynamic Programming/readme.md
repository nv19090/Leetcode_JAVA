### Dynamic Programming Problems Solution in java 

---

# 1137. N-th Tribonacci Number

## Problem Statement

The Tribonacci sequence is defined as:

* `T(0) = 0`
* `T(1) = 1`
* `T(2) = 1`
* `T(n) = T(n-1) + T(n-2) + T(n-3)` for `n >= 3`

Given an integer `n`, return the value of `T(n)`.

## Approach

Use recursion with memoization to calculate the Tribonacci number efficiently.

1. Handle the base cases:

   * If `n == 0`, return `0`.
   * If `n <= 2`, return `1`.
2. Create a `HashMap` to store previously calculated Tribonacci values.
3. Before calculating a value, check whether it already exists in the map.
4. Recursively calculate the previous three Tribonacci values.
5. Store the calculated result in the `HashMap` and return it.

Memoization prevents repeated calculations of the same subproblems.

## Topic + Technique Used

**Topic:** Recursion, Dynamic Programming

**Technique:** Recursion + Memoization (Top-Down DP)

## Time Complexity

**O(n)**

Each Tribonacci value is calculated once and stored in the `HashMap`. Each calculation performs constant work apart from recursive calls.

## Space Complexity

**O(n)**

The `HashMap` stores up to O(n) results, and the recursion call stack requires O(n) space in the worst case.

---

# 509. Fibonacci Number

## Problem Statement

The Fibonacci numbers are defined as:

* `F(0) = 0`
* `F(1) = 1`
* `F(n) = F(n - 1) + F(n - 2)` for `n > 1`

Given an integer `n`, return `F(n)`.

---

## Approach

### Recursion + Memoization

1. Handle the base cases:

   * If `n <= 1`, return `n`.
2. Use a `HashMap` to store already calculated Fibonacci values.
3. Before calculating `fib(n)`, check whether the result is already present in the `HashMap`.
4. If it exists, return the stored value.
5. Otherwise, recursively calculate:

   * `fib(n - 1)`
   * `fib(n - 2)`
6. Add both results, store the result in the `HashMap`, and return it.

Memoization avoids recalculating the same Fibonacci values multiple times.

**Topic:** Recursion, Dynamic Programming
**Technique Used:** Recursion + Memoization (Top-Down DP)

---

## Time Complexity

**O(n)**

Each Fibonacci value is calculated only once and stored in the `HashMap`.

## Space Complexity

**O(n)**

The `HashMap` stores up to `n` calculated values, and the recursive call stack can also reach O(n).
