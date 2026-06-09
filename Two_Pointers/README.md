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

---

# 2161. Partition Array According to Given Pivot

## Problem Statement
Given an integer array `nums` and an integer `pivot`, rearrange the array such that:
1. All elements less than `pivot` appear before elements equal to `pivot`.
2. All elements equal to `pivot` appear before elements greater than `pivot`.
3. The relative order of elements less than `pivot` and greater than `pivot` is maintained.
Return the rearranged array.

## Approach
1. Create a new array `ans` of the same size as `nums`.
2. Traverse the array and place all elements smaller than `pivot` into `ans`.
3. Traverse again and place all elements equal to `pivot`.
4. Traverse one final time and place all elements greater than `pivot`.
5. Return the resulting array.
This approach preserves the relative order of elements in each group because elements are inserted in the same order as they appear in the original array.

## Time Complexity
- First traversal: `O(n)`
- Second traversal: `O(n)`
- Third traversal: `O(n)`
Overall Time Complexity: **O(n)**

## Space Complexity
- Extra array `ans` of size `n`
Overall Space Complexity: **O(n)**
