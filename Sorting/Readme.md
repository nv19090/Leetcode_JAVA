# Sorting Problems Leetcode 

---

# 1619. Mean of Array After Removing Some Elements

## Problem Statement

Given an integer array `arr`, remove the smallest **5%** and the largest **5%** of the elements.

Return the mean (average) of the remaining elements.

Answers within `10^-5` of the actual answer will be accepted.

## Approach

### Sorting + Simulation

1. Sort the array in non-decreasing order.
2. Compute the number of elements to remove from each end:

   * `remove = (5 × arr.length) / 100`
3. Traverse the array from index `remove` to `arr.length - remove - 1`.
4. Calculate the sum of the remaining elements.
5. Divide the sum by the number of remaining elements to obtain the trimmed mean.
6. Return the computed mean.

Sorting ensures that the smallest and largest 5% of the elements are positioned at the beginning and end of the array, making them easy to exclude.

## Time Complexity
* **O(n log n)**

  * Sorting the array takes **O(n log n)**.
  * Traversing the remaining elements takes **O(n)**.

## Space Complexity
* **O(1)** (excluding the space used by the sorting algorithm).

---
