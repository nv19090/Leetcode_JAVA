# Two pointers Problems

# 15. 3Sum

## Problem Statement

Given an integer array `nums`, return all unique triplets `[nums[i], nums[j], nums[k]]` such that:

`nums[i] + nums[j] + nums[k] = 0`

The solution set must not contain duplicate triplets.

## Approach

* Sort the array to make it easier to handle duplicates and apply the two-pointer technique.
* Fix one element at a time and use two pointers to find the remaining two elements.
* If the sum of the three elements is:

  * Equal to `0`, store the triplet and move both pointers while skipping duplicates.
  * Greater than `0`, move the right pointer to decrease the sum.
  * Less than `0`, move the left pointer to increase the sum.
* Skip duplicate values for the fixed element to avoid duplicate triplets.
* Continue until all possible unique triplets are explored.

## Time Complexity

O(n²)

* Sorting takes O(n log n).
* For each element, the remaining part of the array is scanned using two pointers in O(n).
* Overall complexity is O(n²).

## Space Complexity

O(1)

* No extra data structures are used apart from the output list.
* Auxiliary space is constant.
