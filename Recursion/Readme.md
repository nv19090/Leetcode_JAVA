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

