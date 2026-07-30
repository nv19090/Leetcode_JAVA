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

# 1464. Maximum Product of Two Elements in an Array

## Problem Statement

Given an integer array `nums`, choose two different indices `i` and `j` such that:

* `0 <= i, j < nums.length`
* `i != j`

Return the maximum value of:

`(nums[i] - 1) * (nums[j] - 1)`

## Approach

### Linear Traversal

1. Traverse the array once while maintaining:

   * `largest` → the largest element found so far.
   * `slargest` → the second largest element found so far.
2. If the current element is greater than or equal to `largest`:

   * Update `slargest` with the previous `largest`.
   * Update `largest` with the current element.
3. Otherwise, if the current element is greater than `slargest`, update `slargest`.
4. After the traversal, compute and return:

   * `(largest - 1) * (slargest - 1)`.

This approach avoids sorting and finds the answer in a single pass.

**Topic:** Arrays
**Technique Used:** Linear Traversal

## Time Complexity
* **O(n)**

  * The array is traversed exactly once.

## Space Complexity
* **O(1)**

  * Only two variables are used to track the largest and second-largest elements.

---

# 1911. Maximum Alternating Subsequence Sum
  
## Problem Statement

Given an integer array `nums`, return the alternating sum of a subsequence.

The alternating sum of a subsequence is defined as the sum of elements at even indices minus the sum of elements at odd indices in that subsequence.

## Approach

### Linear Traversal

1. Initialize a variable `sum` to store the alternating sum.
2. Traverse the array from left to right.
3. For each element:

   * If its index is even, add it to `sum`.
   * If its index is odd, subtract it from `sum`.
4. Return the final alternating sum.

This approach computes the alternating sum by processing each element exactly once.

**Topic:** Arrays
**Technique Used:** Linear Traversal

> **Note:** The code shown computes the alternating sum of the **entire array**, not the **maximum alternating subsequence sum** required by LeetCode 1911. Therefore, this implementation does **not** solve the official LeetCode problem correctly.

## Time Complexity
* O(n)

  * The array is traversed once.

## Space Complexity
* O(1)

  * Only a few extra variables are used.

---


