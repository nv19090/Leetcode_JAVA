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

# 8. String to Integer (atoi)

## Problem Statement

Implement the `myAtoi(string s)` function, which converts a string to a 32-bit signed integer.

The algorithm for `myAtoi(s)` is as follows:

1. Ignore any leading whitespace.
2. Check for an optional `'+'` or `'-'` sign.
3. Read the digits until a non-digit character is encountered or the end of the string is reached.
4. If no digits are read, return `0`.
5. Clamp the result to the 32-bit signed integer range:

   * `[-2³¹, 2³¹ - 1]`
6. Return the resulting integer.

## Approach

### Recursion + String Parsing

1. Start traversing the string recursively from index `0`.
2. Skip all leading whitespace characters.
3. If a `'+'` or `'-'` is encountered before reading any digit, determine the sign.
4. Recursively process each digit:

   * Convert the character to its numeric value.
   * Update the accumulated number.
5. Before every recursive call, check for integer overflow:

   * If the value exceeds `Integer.MAX_VALUE`, return `Integer.MAX_VALUE`.
   * If the value is less than `Integer.MIN_VALUE`, return `Integer.MIN_VALUE`.
6. Stop recursion when:

   * A non-digit character is encountered.
   * The end of the string is reached.
7. Return the final signed integer.

This implementation uses recursion instead of the common iterative approach to parse the string.

**Topic:** Strings
**Technique Used:** Recursion

## Time Complexity

* O(n), where `n` is the length of the string.

## Space Complexity

* O(n)

  * Due to the recursion call stack in the worst case.

---

