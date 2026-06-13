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
  
