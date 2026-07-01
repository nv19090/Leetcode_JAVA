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

---

# 633. Sum of Square Numbers

## Problem Statement

Given a non-negative integer `c`, decide whether there exist two integers `a` and `b` such that:

`a² + b² = c`

Return `true` if such a pair exists; otherwise, return `false`.

## Approach

### Two Pointers + Math

1. Initialize two pointers:

   * `i = 0`
   * `j = √c` (the largest possible value whose square is less than or equal to `c`).

2. While `i <= j`:

   * Compute `i² + j²`.
   * If the sum equals `c`, return `true`.
   * If the sum is greater than `c`, decrement `j` to reduce the sum.
   * Otherwise, increment `i` to increase the sum.

3. If no valid pair is found after the traversal, return `false`.

The two-pointer approach efficiently searches all possible pairs without checking every combination.

## Time Complexity

* **O(√c)**

  * Each pointer moves at most `√c` times.

## Space Complexity

* **O(1)**

  * Only a few extra variables are used.

---

# 611. Valid Triangle Number

## Problem Statement

Given an integer array `nums`, return the number of triplets chosen from the array that can form a valid triangle.

A triangle is valid if the sum of any two sides is greater than the third side.

## Approach

### Sorting + Two Pointers

1. Sort the array in non-decreasing order.
2. Fix the largest side by iterating from the end of the array.
3. Use two pointers:

    * `left` at the beginning of the array.
    * `right` just before the fixed largest side.
4. If `nums[left] + nums[right] > nums[i]`:

    * Every element between `left` and `right - 1` can also form a valid triangle with `nums[right]` and `nums[i]`.
    * Add `right - left` to the answer.
    * Move `right` one step left.
5. Otherwise:

    * Move `left` one step right to increase the sum.
6. Continue until all possible triplets have been checked.

This greedy two-pointer approach efficiently counts all valid triangles after sorting.

## Time Complexity
* **O(n²)**

    * Sorting takes **O(n log n)**.
    * The two-pointer traversal takes **O(n²)**.

## Space Complexity
* **O(1)** (excluding the space used by the sorting algorithm).

---

# 917. Reverse Only Letters

## Problem Statement

Given a string `s`, reverse only all the letters in the string and return the result.

Non-letter characters should remain in their original positions.

## Approach

### Two Pointers

1. Convert the string into a character array for easy modification.
2. Initialize two pointers:

   * `i` at the beginning of the array.
   * `j` at the end of the array.
3. While `i < j`:

   * If `arr[i]` is not a letter, move `i` forward.
   * Else if `arr[j]` is not a letter, move `j` backward.
   * Otherwise:

     * Swap the letters at `i` and `j`.
     * Move both pointers inward.
4. Convert the modified character array back into a string and return it.

The algorithm ensures that only alphabetic characters are reversed while all non-letter characters remain at their original indices.

## Time Complexity

* **O(n)**, where `n` is the length of the string.

## Space Complexity

* **O(n)**, due to the character array created from the input string.

---


