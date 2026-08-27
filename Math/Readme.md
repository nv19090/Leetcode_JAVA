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

# 3754. Sum and Multiply

## Problem Statement

Given an integer `n`, perform the following operations:

1. Ignore all digits equal to `0`.
2. Construct a new number by reversing the remaining non-zero digits.
3. Compute the sum of the digits of the newly formed number.
4. Return the product of the new number and the sum of its digits.

## Approach

### Digit Manipulation

1. Traverse the digits of the given number.
2. Ignore every digit that is `0`.
3. Construct a new number by appending each non-zero digit in reverse order.
4. Compute the sum of the digits of the newly formed number.
5. Multiply the number by its digit sum.
6. Return the final result.

The solution uses basic digit extraction (`% 10`) and integer division (`/ 10`) to process the number efficiently.

## Time Complexity
* **O(d)**, where `d` is the number of digits in `n`.

## Space Complexity
* **O(1)**, as only a constant amount of extra space is used.

---

# 3685. GCD Sum of Array

## Problem Statement

You are given an integer array `nums`.

Compute the GCD values according to the problem definition and return the required GCD sum.


## Approach

### Recursion + Sorting + Two Pointers

1. Traverse the array while maintaining the maximum element seen so far.
2. For each element, compute the GCD of the current element and the maximum element using the Euclidean Algorithm.
3. Store all computed GCD values in a new array.
4. Sort the GCD array.
5. Use two pointers:

   * `left` at the beginning.
   * `right` at the end.
6. Compute the GCD of the paired elements and add it to the answer.
7. Continue until all valid pairs have been processed.
8. Return the final GCD sum.

The Euclidean Algorithm is implemented recursively, allowing each GCD computation to be performed efficiently.

**Topic:** Math, Sorting
**Technique Used:** Recursion (Euclidean Algorithm), Sorting, Two Pointers


## Time Complexity
* O(n log n + n log M)

  * `O(n log M)` for GCD computations (`M` is the maximum element).
  * `O(n log n)` for sorting.
  * `O(n)` for the two-pointer traversal.

## Space Complexity
* O(n)

  * Extra space is used for the `prefixGcd` array.

---

# 1979. Find Greatest Common Divisor of Array

## Problem Statement

Given an integer array `nums`, return the **greatest common divisor (GCD)** of the smallest number and the largest number in the array.

The **greatest common divisor** of two numbers is the largest positive integer that divides both numbers without leaving a remainder.

## Approach

### Math + Recursion (Euclidean Algorithm)

1. Traverse the array to find:

   * The minimum element.
   * The maximum element.
2. Compute the GCD of these two numbers using the **Euclidean Algorithm**.
3. The recursive GCD function works as follows:

   * If `b == 0`, return `a`.
   * Otherwise, recursively compute `gcd(b, a % b)`.
4. Return the computed GCD.

The Euclidean Algorithm efficiently computes the greatest common divisor in logarithmic time.

**Topic:** Math
**Technique Used:** Recursion (Euclidean Algorithm)

## Time Complexity
* O(n + log(min(a, b)))

  * `O(n)` to find the minimum and maximum elements.
  * `O(log(min(a, b)))` to compute the GCD.

## Space Complexity
* O(log(min(a, b)))

  * Due to the recursion call stack of the Euclidean Algorithm.

---

# 1822. Sign of the Product of an Array

## Problem Statement

There is a function `signFunc(x)` that returns:

* `1` if `x` is positive.
* `-1` if `x` is negative.
* `0` if `x` is equal to `0`.

Given an integer array `nums`, return the sign of the product of all elements in the array.

## Approach

### Counting Negative Numbers

1. Traverse the entire array.
2. If any element is `0`, immediately return `0` because the product will be zero.
3. Count the number of negative elements.
4. If the count of negative numbers is odd, the product is negative, so return `-1`.
5. If the count is even, the product is positive, so return `1`.

There is no need to calculate the actual product. We only need to determine whether the number of negative elements is odd or even.

**Topic:** Math, Arrays
**Technique Used:** Counting

## Time Complexity

* O(n)
* The array is traversed once.

## Space Complexity

* O(1)
* Only one counter variable is used.

---

# 3622. Check Divisibility by Digit Sum and Product

## Problem Statement

You are given a positive integer `n`.

Let:

* `sum` be the sum of all digits of `n`.
* `product` be the product of all digits of `n`.

Return `true` if `n` is divisible by `sum + product`; otherwise, return `false`.

## Approach

### Digit Manipulation

1. Store the original value of `n` in `p`.
2. Initialize:

   * `sum = 0` to store the sum of digits.
   * `product = 1` to store the product of digits.
3. Extract each digit using `p % 10`.
4. Add the digit to `sum`.
5. Multiply the digit with `product`.
6. Remove the last digit using `p / 10`.
7. Calculate `total = sum + product`.
8. Check whether `n` is divisible by `total`.
9. Return the result.

**Topic:** Math
**Technique Used:** Digit Manipulation

## Time Complexity

* **O(d)**, where `d` is the number of digits in `n`.

## Space Complexity

* **O(1)**
* Only a constant number of variables are used.

---

# 3827. Count Monobit Integers

## Problem Statement

You are given an integer `n`.

An integer is called **Monobit** if all bits in its binary representation are the same.

For example:

* `0 → 0` → Monobit
* `1 → 1` → Monobit
* `3 → 11` → Monobit
* `7 → 111` → Monobit
* `5 → 101` → Not Monobit

Return the number of Monobit integers in the range `[0, n]`, inclusive.

## Approach

### Binary Conversion + Counting

1. Iterate through every integer from `0` to `n`.
2. Convert each integer into its binary representation using `Integer.toBinaryString()`.
3. Count the number of `0`s and `1`s in the binary representation.
4. If all bits are `0` or all bits are `1`, increment the answer.
5. Return the total count.

This approach directly checks every number in the given range and determines whether its binary representation contains only one type of bit.

**Topic:** Bit Manipulation, Enumeration
**Technique Used:** Binary Conversion + Counting

## Time Complexity

* **O(n log n)**
* There are `n` numbers to check, and each binary representation can contain up to `O(log n)` bits.

## Space Complexity

* **O(log n)**
* The binary representation of each number requires up to `O(log n)` space.
