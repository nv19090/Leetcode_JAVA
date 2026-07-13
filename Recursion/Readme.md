# Recursion Problems Leetcode

---

# 50. Pow(x, n)

## Problem Statement

Implement `pow(x, n)`, which calculates `x` raised to the power `n` (`xⁿ`).

Given a floating-point number `x` and an integer `n`, return `x` raised to the power `n`.

The solution must handle:

* Positive exponents
* Negative exponents
* Zero exponent
* Large values of `n`

## Approach

### Recursion + Binary Exponentiation

Instead of multiplying `x` by itself `n` times, we use **Binary Exponentiation**.

1. Base Case:

   * If `n == 0`, return `1`.

2. Recursively compute:

   * `half = power(x, n / 2)`

3. If `n` is even:

   * `xⁿ = (xⁿᐟ²) × (xⁿᐟ²)`

4. If `n` is odd:

   * `xⁿ = (xⁿᐟ²) × (xⁿᐟ²) × x`

5. For negative powers:

   * Convert `x` to `1/x`
   * Convert `n` to a positive value using a `long` variable to safely handle `Integer.MIN_VALUE`.

This reduces the number of multiplications from **O(n)** to **O(log n)**.

## Time Complexity
* **O(log n)**
* The exponent is halved in every recursive call.

## Space Complexity
* **O(log n)**
* Due to the recursive call stack.

---

# 1295. Find Numbers with Even Number of Digits

## Problem Statement

Given an array `nums` of integers, return how many of them contain an **even number of digits**.

## Approach

## Recursion

1. Traverse each element of the array.
2. For every number, recursively count the number of digits:

   * Base Case:

     * If the number becomes `0`, return the digit count.
   * Recursive Case:

     * Increment the count.
     * Recursively process `n / 10`.
3. Check whether the returned digit count is even.
4. If it is even, increment the answer.
5. Return the total count.

Although this problem is commonly solved using Math or String conversion, this implementation demonstrates how recursion can be used to count the digits of a number.

**Topic:** Arrays, Math
**Technique Used:** Recursion

## Time Complexity
* O(n × d)

  * `n` = number of elements in the array.
  * `d` = number of digits in each number.

Since the number of digits in an integer is small, this is effectively **O(n)**.

## Space Complexity
* O(d)

  * Due to the recursion call stack while counting the digits of a number.

---

