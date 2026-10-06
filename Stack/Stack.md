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

# 32. Longest Valid Parentheses

## Problem Statement

Given a string `s` containing only `'('` and `')'`, find the length of the longest valid parentheses substring.

A valid parentheses string has properly matched and nested opening and closing parentheses.

## Approach

### Stack + Index Tracking

1. Use a `Stack<Integer>` to store indices.
2. Initially push `-1` into the stack as a base index.
3. Traverse the string from left to right.
4. If the current character is `'('`, push its index onto the stack.
5. If the current character is `')'`:
   - Pop the top index.
   - If the stack becomes empty, push the current index as the new base index.
   - Otherwise, calculate the length of the current valid substring using:
     `j - st.peek()`
6. Update `ans` with the maximum length found.
7. Return `ans`.

The stack stores indices rather than characters, allowing the length of every valid substring to be calculated directly.

**Topic:** Stack, String  
**Technique Used:** Stack + Index Tracking

## Time Complexity

**O(n)**

The string is traversed once, and every index is pushed and popped from the stack at most once.

## Space Complexity

**O(n)**

In the worst case, the stack can contain O(n) indices.

---

# 856. Score of Parentheses

## Problem Statement

Given a balanced parentheses string `s`, calculate its score according to these rules:

- `()` has a score of `1`.
- `AB` has a score of `A + B`, where `A` and `B` are balanced parentheses strings.
- `(A)` has a score of `2 * A`.

Return the total score of the parentheses string.

## Approach

### Stack + Multiplication Tracking

1. Use a `Stack<Integer>` to keep track of the score multiplier for nested parentheses.
2. Traverse the string character by character.
3. When an opening parenthesis `'('` is encountered:
   - If the stack is empty, push `1`.
   - Otherwise, push `2 * st.peek()` because the new pair is nested one level deeper.
4. When a closing parenthesis `')'` is encountered:
   - If the previous opening parenthesis forms a primitive `()`, add the current stack value to `count`.
   - Pop the corresponding value from the stack.
5. Return the accumulated `count`.

The `value` flag is used to identify whether the current closing parenthesis directly closes an opening parenthesis.

**Topic:** Stack, String  
**Technique Used:** Stack + Nested Score Tracking

## Time Complexity

**O(n)**

The string is traversed once, and each parenthesis is pushed and popped from the stack at most once.

## Space Complexity

**O(n)**

In the worst case, the stack can contain O(n) elements.

---

# 921. Minimum Add to Make Parentheses Valid

## Problem Statement

Given a string `s` containing only `'('` and `')'`, return the minimum number of parentheses that must be added to make the string valid.

A valid parentheses string has every opening parenthesis matched with a corresponding closing parenthesis.

## Approach

### Stack + Unmatched Parentheses

1. Use a `Stack<Character>` to store unmatched opening parentheses.
2. Traverse the string character by character.
3. If the current character is `'('`, push it into the stack.
4. If the current character is `')'`:
   - If the stack is empty, there is no matching opening parenthesis, so increment `op`.
   - Otherwise, remove the matching `'('` from the stack.
5. After processing the entire string:
   - `op` represents unmatched closing parentheses.
   - `st.size()` represents unmatched opening parentheses.
6. The total number of additions required is:
   `op + st.size()`.

**Topic:** Stack, String  
**Technique Used:** Stack + Matching Parentheses

## Time Complexity

**O(n)**

The string is traversed once, and each parenthesis is pushed and popped at most once.

## Space Complexity

**O(n)**

In the worst case, all characters can be opening parentheses and stored in the stack.
