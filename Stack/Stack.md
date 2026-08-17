## Stack Problems 

---

# 150. Evaluate Reverse Polish Notation

## Problem Statement

You are given an array of strings `tokens` that represents an arithmetic expression in **Reverse Polish Notation (RPN)**.

Evaluate the expression and return the integer result.

Valid operators are:

* `+`
* `-`
* `*`
* `/`

Each operand may be an integer or another expression.

Integer division should truncate toward zero.

## Approach

### Stack

1. Create a `Stack<Integer>` to store operands.
2. Traverse the `tokens` array.
3. If the current token is a number:

   * Convert it to an integer using `Integer.parseInt()`.
   * Push it onto the stack.
4. If the current token is an operator:

   * Pop the top two values from the stack.
   * Apply the operator.
   * Push the calculated result back onto the stack.
5. Continue until all tokens are processed.
6. The final value remaining at the top of the stack is the answer.

The `cal()` method handles the arithmetic operation for each operator.

**Topic:** Stack, Math
**Technique Used:** Stack

## Time Complexity

* O(n)
* Each token is processed exactly once.

## Space Complexity

* O(n)
* In the worst case, the stack can contain `O(n)` elements.

---

# 739. Daily Temperatures

## Problem Statement

Given an array of integers `temp` representing daily temperatures, return an array `answer` such that `answer[i]` is the number of days you have to wait after the `i`th day to get a warmer temperature.

If there is no future day for which this is possible, `answer[i]` should remain `0`.

## Approach

### Monotonic Stack

1. Create a stack to store the **indices** of temperatures that have not yet found a warmer day.
2. Traverse the temperature array from left to right.
3. For each temperature:

   * While the stack is not empty and the current temperature is greater than the temperature at the index on top of the stack:

     * Pop the previous index.
     * Calculate the number of days between the current index and the popped index.
     * Store this difference in `answer`.
4. Push the current index onto the stack.
5. Any indices remaining in the stack do not have a warmer future temperature, so their answers remain `0`.

The stack maintains indices whose next warmer temperature has not yet been found.

**Topic:** Stack, Arrays
**Technique Used:** Monotonic Stack

## Time Complexity

* O(n)
* Every index is pushed into the stack once and popped at most once.

## Space Complexity

* O(n)
* The stack can contain up to `n` indices, and the answer array also requires `O(n)` space.

---

