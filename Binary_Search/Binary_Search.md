# Binary Seach Problems (On Answers)

# Split Array Largest Sum

## Problem Statement

Given an integer array and an integer `k`, split the array into `k` non-empty subarrays such that the largest subarray sum is minimized.

## Approach

* The answer lies between the maximum element of the array and the sum of all elements.
* Apply Binary Search on this range.
* For each candidate value, count the number of subarrays required such that no subarray sum exceeds that value.
* If more than `k` subarrays are needed, increase the value.
* Otherwise, try to find a smaller feasible value.
* The first feasible value is the minimum possible largest subarray sum.

## Time Complexity

O(n × log(sum - maxElement))

## Space Complexity

O(1)

# 3300. Minimum Element After Replacement With Digit Sum

## Problem Statement

Replace every element of the array with the sum of its digits and return the minimum element after all replacements.

## Approach

* Traverse the array.
* For each element, calculate the sum of its digits.
* Keep track of the minimum digit sum obtained.
* Return the minimum value.

## Time Complexity

O(n × d)

where `d` is the number of digits in the largest element.

## Space Complexity

O(1)

# 1539. Kth Missing Positive Number

## Problem Statement

Given a sorted positive integer array and an integer `k`, return the `kth` missing positive number.

## Approach

* Use Binary Search to determine how many numbers are missing before a given index.

* Missing numbers before index `mid` can be calculated as:

  `arr[mid] - (mid + 1)`

* If the missing count is less than `k`, search on the right side.

* Otherwise, search on the left side.

* Use the final position to determine the kth missing number.

## Time Complexity

O(log n)

## Space Complexity

O(1)

# Find the Smallest Divisor Given a Threshold

## Problem Statement

Given an array `nums` and an integer `threshold`, find the smallest divisor such that the sum of all divisions rounded up is less than or equal to `threshold`.

## Approach

* Apply Binary Search on the possible divisor range.
* The minimum divisor is `1`.
* The maximum divisor is the largest element in the array.
* For each divisor:

  * Calculate the sum using ceiling division.
  * If the sum is within the threshold, try to find a smaller divisor.
  * Otherwise, increase the divisor.
* The smallest valid divisor is the answer.

## Time Complexity

O(n × log(max(nums)))

## Space Complexity

O(1)

# 1011. Capacity To Ship Packages Within D Days

## Problem Statement

Given an array of package weights and an integer `days`, return the least weight capacity of the ship that allows all packages to be shipped within the given number of days.

## Approach

* The answer lies between the maximum package weight and the sum of all package weights.
* Apply Binary Search on this range.
* For each capacity, determine the number of days required to ship all packages.
* If more than the given days are needed, increase the capacity.
* Otherwise, try to find a smaller valid capacity.
* The smallest feasible capacity is the answer.

## Time Complexity

O(n × log(sum(weights)))

## Space Complexity

O(1)
