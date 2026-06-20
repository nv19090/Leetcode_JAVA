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

---

# 1732. Find the Highest Altitude

## Problem Statement

There is a biker going on a road trip. The trip consists of `n + 1` points at different altitudes.
You are given an integer array `gain` of length `n` where `gain[i]` is the net gain in altitude between points `i` and `i + 1`.
The biker starts the trip at altitude `0`.
Return the highest altitude of a point reached during the trip.

## Approach

1. The biker starts at altitude `0`.
2. Traverse the `gain` array and maintain a running sum representing the current altitude.
3. After processing each gain value:
   * Update the current altitude.
   * Compare it with the maximum altitude seen so far.
4. Return the maximum altitude reached during the journey.
The solution uses a prefix-sum approach where the running sum represents the altitude at each point.

## Time Complexity
* **O(n)**, where `n` is the length of the `gain` array.

## Space Complexity
* **O(1)**, as only two variables (`sum` and `mx`) are used.

---
