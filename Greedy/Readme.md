# Greedy Problem Solutions 
---

# 455. Assign Cookies

## Problem Statement
Assume you are an awesome parent and want to give your children some cookies. Each child `i` has a greed factor `g[i]`, which is the minimum size of a cookie that will satisfy the child. Each cookie `j` has a size `s[j]`.
If `s[j] >= g[i]`, the child can be satisfied. Each child can receive at most one cookie, and each cookie can be assigned to at most one child.
Return the maximum number of children that can be satisfied.

## Approach
1. Sort both the greed factor array and the cookie size array.
2. Use two pointers:
   * `i` for children.
   * `j` for cookies.
3. If the current cookie can satisfy the current child (`s[j] >= g[i]`):
   * Assign the cookie.
   * Increment both pointers.
   * Increase the count of satisfied children.
4. Otherwise:
   * Move to the next larger cookie by incrementing `j`.
5. Continue until all children or cookies have been processed.
This greedy approach ensures that the smallest possible cookie is used to satisfy each child, leaving larger cookies for greedier children.

## Time Complexity
* **O(n log n + m log m)**
  * Sorting the greed array: `O(n log n)`
  * Sorting the cookie array: `O(m log m)`
  * Two-pointer traversal: `O(n + m)`

## Space Complexity
* **O(1)** (excluding the space used by the sorting algorithm)

---
