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

# 3090. Maximum Length Substring With Two Occurrences

## Problem Statement

Given a string `s`, return the length of the longest substring in which every character appears **at most twice**.

A substring is a contiguous sequence of characters within a string.

## Approach

### Sliding Window + HashMap

1. Use two pointers:

   * `low` → left boundary of the window.
   * `right` → right boundary of the window.
2. Use a `HashMap` to store the frequency of each character in the current window.
3. Move `right` through the string and increase the frequency of the current character.
4. If the frequency of the current character becomes greater than `2`:

   * Move `low` forward.
   * Decrease the frequency of the characters removed from the window.
5. After the window becomes valid again, update the maximum length.
6. Return the maximum substring length.

The sliding window ensures that every character appears at most twice while efficiently finding the longest valid substring.

**Topic:** Strings, Hashing
**Technique Used:** Sliding Window + HashMap

## Time Complexity

* **O(n)**
* Each character is added to and removed from the sliding window at most once.

## Space Complexity

* **O(k)**
* The `HashMap` stores frequencies of the distinct characters in the current window.
* For a fixed character set, this can be considered **O(1)**.

---


