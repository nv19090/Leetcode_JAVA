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

## Space Complexity
* **O(1)**, as only a few variables are used regardless of the input size.

---

# 1344. Angle Between Hands of a Clock

## Problem Statement
Given two numbers, `hour` and `minutes`, return the smaller angle (in degrees) formed between the hour and the minute hand of an analog clock.
Answers within `10^-5` of the actual value will be accepted.

## Approach
1. Calculate the position of the hour hand:
   * Each hour mark represents `30°`.
   * The hour hand also moves as minutes pass.
   * Hour hand angle = `30 × hour + 0.5 × minutes`.
     
2. Calculate the position of the minute hand:
   * Each minute mark represents `6°`.
   * Minute hand angle = `6 × minutes`.

3. Find the absolute difference between the two angles.
4. Since there are two angles between the hands, return the smaller one:
   * `min(angle, 360 - angle)`

In the given implementation:
* `30 * hour - 5.5 * minutes` combines both calculations into a single formula.
* `Math.abs()` computes the angle difference.
* `Math.min(ans, 360 - ans)` ensures the smaller angle is returned.

## Time Complexity
* **O(1)**, as only a few arithmetic operations are performed.

## Space Complexity
* **O(1)**, since no extra data structures are used.

---

# 3300. Minimum Element After Replacement With Digit Sum

## Problem Statement
You are given an integer array `nums`.

Replace each element in the array with the sum of its digits. After performing the replacement for all elements, return the minimum element in the resulting array.

## Approach
### Digit Sum Computation

1. Traverse each element of the array.
2. For every number:

   * Extract its digits using modulo (`% 10`).
   * Add the digits to compute the digit sum.
   * Remove the last digit using integer division (`/ 10`).
3. Keep track of the minimum digit sum encountered.
4. Return the minimum value after processing all elements.

This approach computes the digit sum of each number and simultaneously maintains the smallest digit sum.

## Time Complexity
* **O(n × d)**, where:

  * `n` is the number of elements in the array.
  * `d` is the maximum number of digits in an element.

Since `d` is at most 10 for standard integer values, this is effectively **O(n)**.

## Space Complexity
* **O(1)**, as only a few extra variables are used.

---

