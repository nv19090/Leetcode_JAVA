# String problems leetcode

---

# 3612_Process_String_With_Special_Characters

## Problem Statement

You are given a string `s` consisting of lowercase English letters and the special characters `'#'`, `'*'`, and `'%'`.

Process the string from left to right according to the following rules:

- If the current character is a lowercase letter, append it to the result.
- If the current character is `'#'`, duplicate the current result and append it to itself.
- If the current character is `'*'`, remove the last character from the result if it is not empty.
- If the current character is `'%'`, reverse the current result.

Return the final processed string after applying all operations.

## Approach

- Initialize an empty `StringBuilder` to store the processed string.
- Traverse the input string from left to right.
- For each character:
  - If it is a lowercase letter, append it to the `StringBuilder`.
  - If it is `'#'`, duplicate the current content by appending the existing string to itself.
  - If it is `'*'`, remove the last character if the `StringBuilder` is not empty.
  - If it is `'%'`, reverse the current `StringBuilder`.
- After processing all characters, return the final string.

## Time Complexity
- **O(n × m)**
Where:
- `n` = length of the input string.
- `m` = current length of the generated string.

The duplication (`#`) and reversal (`%`) operations may each require traversing the current string, making the worst-case time complexity **O(n × m)**.

## Space Complexity
- **O(m)**
Where:
- `m` is the maximum length of the generated string stored in the `StringBuilder`.

---

# 1189. Maximum Number of Balloons

## Problem Statement
Given a string `text`, return the maximum number of instances of the word **"balloon"** that can be formed using the characters in `text`.

Each character in `text` can be used at most once.

## Approach

### Character Frequency Counting

1. Count the occurrences of the characters required to form the word `"balloon"`:
   * `b`
   * `a`
   * `l`
   * `o`
   * `n`
2. Since the word `"balloon"` contains:
   * `l` twice
   * `o` twice

   divide the counts of `l` and `o` by `2`.

3. The number of complete `"balloon"` words that can be formed is limited by the character with the smallest available count.
4. Return the minimum count among all required characters.
This works because every occurrence of `"balloon"` requires exactly one `b`, one `a`, two `l`s, two `o`s, and one `n`.

## Time Complexity
* **O(n)**, where `n` is the length of the string `text`.

## Space Complexity
* **O(1)**, as only a fixed-size array of length 5 is used.

---

# 1967. Number of Strings That Appear as Substrings in Word

## Problem Statement

Given an array of strings `patterns` and a string `word`, return the number of strings in `patterns` that appear as a substring of `word`.

A substring is a contiguous sequence of characters within a string.

## Approach

### String Matching

1. Initialize a counter to `0`.
2. Traverse each string in the `patterns` array.
3. For every pattern:

   * Use Java's built-in `contains()` method to check whether it exists as a substring of `word`.
   * If it exists, increment the counter.
4. Return the total count.

The solution leverages Java's efficient built-in substring search to determine whether each pattern appears in the given word.

## Time Complexity

* **O(n × m)**
   * `n` = number of strings in `patterns`
   * `m` = length of `word`
   * Each `contains()` operation may take up to `O(m)` in the worst case.

## Space Complexity

* **O(1)**
   * No extra data structures are used.

---

# 4030. Check ASCII Palindromic

## Problem Statement

Given a string `s`, determine whether the concatenation of the **8-bit binary representations of the ASCII values** of its characters forms a palindrome.

For each character:

* Convert its ASCII value into binary.
* Represent it using 8 bits.
* Concatenate all the binary representations.
* Check whether the resulting binary string is a palindrome.

Return `true` if it is a palindrome; otherwise, return `false`.

## Approach

### ASCII Conversion + Binary String + Two Pointers

1. Traverse every character of the string.
2. Convert each character to its ASCII value.
3. Convert the ASCII value into its binary representation using `Integer.toBinaryString()`.
4. Append the binary representation to `Binary`.
5. Ensure the required 8-bit representation by adding leading zeroes.
6. Use two pointers:

   * `i` starting from the beginning.
   * `j` starting from the end.
7. Compare the characters at both positions.
8. If any pair is different, return `false`.
9. If all pairs match, return `true`.

**Topic:** Strings, Math
**Technique Used:** ASCII/Binary Conversion + Two Pointers

## Time Complexity

* **O(n²)** in the worst case due to repeated string concatenation.
* The palindrome check itself takes **O(n)**.

## Space Complexity

* **O(n)**
* The binary representation requires space proportional to the length of the input string.

