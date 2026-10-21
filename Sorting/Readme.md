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

# 3551. Minimum Swaps to Sort by Digit Sum

## Problem Statement

Given an integer array `nums`, sort its elements by digit sum in ascending order. If two elements have the same digit sum, sort them by their numeric values in ascending order.

Return the minimum number of swaps required to rearrange the original array into this sorted order.

## Approach

### HashMap + Custom Sorting + Cycle Detection

1. Calculate the digit sum of every element and store it in a `HashMap`.
2. Convert the map entries into a list.
3. Sort the list using a custom comparator:
   - First, compare digit sums in ascending order.
   - If the digit sums are equal, compare the original numbers in ascending order.
4. Store the sorted numbers in an array.
5. Create a position map to record the target index of each value.
6. Use a `visited` array to detect cycles in the permutation from the original array to the sorted array.
7. Count the cycles and calculate the minimum swaps using `n - cycles`.

Cycle detection determines the minimum number of swaps required to place all elements in their correct positions.

## Topic + Technique Used

**Topic:** Sorting, Hashing, Arrays

**Technique Used:** Digit Sum + Custom Comparator + Cycle Detection

## Time Complexity

**O(n log n + n × d)**

Where `n` is the array length and `d` is the maximum number of digits in an element. Sorting takes O(n log n), and calculating digit sums takes O(n × d).

## Space Complexity

**O(n)**

The `HashMap`, sorted list, position map, and visited array require linear additional space.
