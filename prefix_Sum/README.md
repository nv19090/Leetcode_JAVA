# prefix Sum problems


# 238. Product of Array Except Self

## Problem Statement

Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

The solution must be computed without using division.

## Approach

* Create a suffix product array where `suffix[i]` stores the product of all elements to the right of index `i`.
* Initialize a variable `prefix` to store the product of elements to the left of the current index.
* Traverse the array from left to right:

  * The product except self at index `i` is `prefix * suffix[i]`.
  * Update `prefix` by multiplying it with the current element.
* Store the result in the answer array and return it.

## Time Complexity

O(n)

* One traversal to build the suffix product array.
* One traversal to compute the final answer.

## Space Complexity

O(n)

* An additional suffix array of size `n` is used.
