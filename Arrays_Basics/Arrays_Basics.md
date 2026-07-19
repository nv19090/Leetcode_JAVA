# Arrays Problems
--- 

# 3689 Maximum Total Subarray Value-I

## Problem Statement
Given an integer array `nums` and an integer `k`, find the maximum total value obtainable by taking the difference between the maximum and minimum elements of the array and multiplying it by `k`.

## Approach
1. Traverse the array once to find the minimum element (`mn`) and maximum element (`mx`).
2. Calculate the difference `mx - mn`.
3. Multiply this difference by `k`.
4. Return the result as a `long`.

## Time Complexity
- **O(n)**, where `n` is the size of the array.
- The array is traversed only once.

## Space Complexity
- **O(1)**, as only a constant amount of extra space is used.

---
  
# 3675. Check Good Integer

## Problem Statement
Given an integer `n`, determine whether it is a **good integer**.
A number is considered **good** if the difference between the sum of the squares of its digits and the sum of its digits is at least `50`.
Return `true` if the integer is good; otherwise, return `false`.

## Approach
1. Traverse each digit of the number using modulo (`% 10`) and division (`/ 10`).
2. Calculate:
   * `sum` → Sum of all digits.
   * `sq` → Sum of squares of all digits.
3. Compute the difference `sq - sum`.
4. If the difference is greater than or equal to `50`, return `true`; otherwise, return `false`.

## Time Complexity
* **O(d)**, where `d` is the number of digits in `n`.

## Space Complexity
* **O(1)**, as only a few variables are used.

---

# 485. Max Consecutive Ones

## Problem Statement

Given a binary array `nums`, return the maximum number of consecutive `1`s in the array.

## Approach

### Linear Traversal

1. Initialize two variables:

   * `count` to store the current streak of consecutive `1`s.
   * `mx` to store the maximum streak found so far.
2. Traverse the array from left to right.
3. For each element:

   * If it is `1`, increment `count` and update `mx`.
   * If it is `0`, reset `count` to `0`.
4. After completing the traversal, return `mx`.

Since the array is scanned only once, this approach is both simple and efficient.

**Topic:** Arrays
**Technique Used:** Linear Traversal

## Time Complexity

* O(n)

  * The array is traversed exactly once.

## Space Complexity

* O(1)

  * Only a few extra variables are used.

---

