# Maths Problems 

---

# 1281. Subtract the Product and Sum of Digits of an Integer

## Problem Statement
Given an integer `n`, return the difference between the product of its digits and the sum of its digits.
Formally, let:
* `product` = product of all digits of `n`
* `sum` = sum of all digits of `n`
Return `product - sum`.

## Approach
1. Initialize:

   * `product = 1`
   * `sum = 0`
2. Extract each digit using `n % 10`.
3. Update:

   * Multiply the digit into `product`.
   * Add the digit to `sum`.
4. Remove the last digit using `n /= 10`.
5. Repeat until all digits have been processed.
6. Return `product - sum`.
The solution processes each digit exactly once and keeps track of both the product and the sum simultaneously.

## Time Complexity
* **O(d)**, where `d` is the number of digits in `n`.

---

## Space Complexity
* **O(1)**, as only a few variables are used regardless of the input size.
