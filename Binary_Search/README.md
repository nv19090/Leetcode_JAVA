# Binary Seach Problems (On Answers)

Problem: Split Array Largest Sum

Approach:
- The answer lies between:
    1. The maximum element of the array (minimum possible answer).
    2. The sum of all elements (maximum possible answer).
- Apply Binary Search on this range.
- For each candidate value (mid), determine the number of subarrays needed
  such that the sum of each subarray does not exceed mid.
- If more than k subarrays are required, mid is too small.
- Otherwise, try to minimize the answer by searching the left half.
- The first feasible value obtained is the minimum possible largest subarray sum.

Time Complexity: O(n * log(sum - maxElement))
    - Binary Search on the answer space.
    - Each iteration scans the array once.

Space Complexity: O(1)
    - Only constant extra space is used.


Problem : 3300 Minimum Element After Replacement With Digit Sum.
Time Complexity: O(n * d)
    n = number of elements in the array
    d = number of digits in the largest number

    For each element, we calculate the sum of its digits.
    If integers are bounded (e.g., <= 10^9), d is at most 10,
    so the practical time complexity is O(n).

Space Complexity: O(1)
    Only a few extra variables are used.


Problem 1539 - Kth Missing Positive Number
 
Approach:
  We use Binary Search to find how many positive numbers are missing
  before a particular index.
 
  Missing numbers before index `mid`:
       arr[mid] - (mid + 1)
 
  If missing count is smaller than k,
  move right side.
  Otherwise move left side.
 
  Time Complexity: O(log n)
  Space Complexity: O(1)


Problem:  Find the Smallest Divisor Given a Threshold

## Problem
Given an array `nums` and an integer `threshold`, find the smallest divisor such that the sum of all divisions rounded up is less than or equal to `threshold`.


## Approach
- Use **Binary Search** on the divisor range.
- The minimum divisor can be `1`.
- The maximum divisor can be the maximum element in the array.
- For every middle value:
  - Compute the sum using ceiling division.
  - If the sum is within the threshold:
    - Store the answer.
    - Try to find a smaller divisor.
  - Otherwise:
    - Increase the divisor.

---

## Time Complexity
- **O(n × log(max(nums)))**

## Space Complexity
- **O(1)**


 LeetCode 1011 - Capacity To Ship Packages Within D Days
 Approach: Binary Search on Answer
 Time Complexity: O(n * log(sum(weights)))
Space Complexity: O(1)
