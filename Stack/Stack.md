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

