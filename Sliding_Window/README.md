 # Sliding Windows problems

---

# 1004. Max Consecutive Ones III

## Problem Statement

Given a binary array `nums` and an integer `k`, return the maximum number of consecutive `1`s in the array if you can flip at most `k` `0`s.

## Approach

### Sliding Window (Two Pointers)

1. Maintain a sliding window using two pointers:

   * `i` → Left boundary of the window.
   * `j` → Right boundary of the window.

2. Traverse the array:

   * Expand the window by moving `j`.
   * Whenever a `0` is encountered, use one available flip (`k`).

3. If the number of flipped `0`s exceeds `k`:

   * Shrink the window from the left.
   * If the element leaving the window is `0`, restore one available flip.

4. After every valid window, update the maximum window size.

The sliding window always represents the longest valid subarray containing at most `k` flipped zeros.

## Time Complexity

* **O(n)**
  * Each element is visited at most twice (once by each pointer).

## Space Complexity

* **O(1)**
  * Only a few variables are used.

---

