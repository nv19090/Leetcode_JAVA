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

# 860. Lemonade Change

## Problem Statement
At a lemonade stand, each lemonade costs **$5**.
Customers pay with bills of **$5**, **$10**, or **$20**. You must provide the correct change to each customer in the order they arrive.
Initially, you have no change.
Given an integer array `bills` where `bills[i]` is the bill paid by the `i-th` customer, return `true` if you can provide the correct change to every customer, otherwise return `false`.

## Approach
1. Maintain two counters:

   * `fivecoin` → Number of $5 bills available.
   * `tencoin` → Number of $10 bills available.

2. Traverse the `bills` array:

   * If the customer pays with `$5`, increase `fivecoin`.
   * If the customer pays with `$10`:

     * Give one `$5` bill as change.
     * Increment `tencoin`.
     * If no `$5` bill is available, return `false`.
   * If the customer pays with `$20`:

     * Prefer giving one `$10` bill and one `$5` bill as change.
     * Otherwise, give three `$5` bills.
     * If sufficient change is not available, return `false`.

3. If all customers are served successfully, return `true`.
This greedy approach always prioritizes using a `$10 + $5` combination for a `$20` bill, preserving more `$5` bills for future transactions.

## Time Complexity
* **O(n)**, where `n` is the number of customers.

## Space Complexity
* **O(1)**, as only a few variables are used to track the available bills.

---
