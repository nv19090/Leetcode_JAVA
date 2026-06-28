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

# 678. Valid Parenthesis String

## Problem Statement

Given a string `s` containing only three types of characters: `'('`, `')'`, and `'*'`, return `true` if `s` is valid.
The following rules define a valid string:
* Any left parenthesis `'('` must have a corresponding right parenthesis `')'`.
* Any right parenthesis `')'` must have a corresponding left parenthesis `'('`.
* A left parenthesis `'('` must appear before the corresponding right parenthesis `')'`.
* `'*'` can be treated as:

  * A single left parenthesis `'('`, or
  * A single right parenthesis `')'`, or
  * An empty string `""`.

## Approach
This solution uses a **Greedy Range Technique**.
1. Maintain two variables:

   * `open_bracket` → Minimum possible number of unmatched open parentheses.
   * `closing_bracket` → Maximum possible number of unmatched open parentheses.

2. Traverse the string:
   * If the character is `'('`:
     * Increase both minimum and maximum counts.
   * If the character is `')'`:
     * Decrease both counts.
   * If the character is `'*'`:
     * It can act as `'('`, `')'`, or empty.
     * Decrease the minimum count and increase the maximum count.

3. If the maximum count becomes negative, there are too many closing brackets, so return `false`.
4. Keep the minimum count non-negative using:

   ```java
   open_bracket = Math.max(open_bracket, 0);
   ```

5. At the end, if the minimum count is `0`, the string can be valid; otherwise, it cannot.
This greedy method efficiently tracks all possible interpretations of `'*'` without using a stack.

## Time Complexity
* **O(n)**, where `n` is the length of the string.

## Space Complexity
* **O(1)**, as only a few integer variables are used.

---

# 1833. Maximum Ice Cream Bars

## Problem Statement

It is a sweltering summer day, and a boy wants to buy ice cream bars.
You are given an array `costs` where `costs[i]` is the price of the `i-th` ice cream bar, and an integer `coins` representing the number of coins the boy has.
Return the maximum number of ice cream bars the boy can buy with the available coins.
Note that the boy can buy the ice cream bars in any order.

## Approach
### Greedy + Sorting

1. Sort the `costs` array in ascending order.
2. Start purchasing ice cream bars from the cheapest one.
3. Maintain a running sum of the costs spent.
4. If purchasing the current ice cream keeps the total cost within the available coins:

   * Increase the count.
5. Otherwise, stop purchasing further ice creams.
6. Return the total count of ice cream bars bought.

The greedy strategy works because buying cheaper ice creams first always leaves the maximum number of coins available for future purchases, resulting in the maximum possible count.

## Time Complexity
* **O(n log n)**
  * Sorting the array takes `O(n log n)`.
  * Traversing the array takes `O(n)`.

## Space Complexity
* **O(1)** (excluding the space used by the sorting algorithm).

---

# 881. Boats to Save People

## Problem Statement

You are given an array `people` where `people[i]` is the weight of the `i-th` person, and an integer `limit` representing the maximum weight a boat can carry.

Each boat can carry **at most two people** at the same time, provided the sum of their weights does not exceed `limit`.

Return the **minimum number of boats** required to carry every person.

## Approach

### Greedy + Two Pointers + Sorting

1. Sort the array of people's weights in ascending order.
2. Initialize two pointers:

   * `i` at the beginning (lightest person).
   * `j` at the end (heaviest person).
3. While `i <= j`:

   * If the lightest and heaviest person can share a boat (`people[i] + people[j] <= limit`):

     * Place them together.
     * Move both pointers (`i++`, `j--`).
   * Otherwise:

     * The heaviest person must go alone.
     * Move only the `j` pointer.
   * Increment the boat count in both cases.
4. Return the total number of boats used.

The greedy strategy works because pairing the heaviest person with the lightest possible person minimizes the total number of boats.

## Time Complexity
* **O(n log n)**

  * Sorting the array takes **O(n log n)**.
  * The two-pointer traversal takes **O(n)**.

## Space Complexity
* **O(1)** (excluding the space used by the sorting algorithm).

---

# 1846. Maximum Element After Decreasing and Rearranging

## Problem Statement

You are given an array of positive integers `arr`.

Perform the following operations any number of times:

* Decrease the value of any element to a smaller positive integer.
* Rearrange the elements in any order.

After performing the operations, the array must satisfy:

* The first element is equal to `1`.
* The absolute difference between any two adjacent elements is at most `1`.

Return the **maximum possible value** of the largest element in the resulting array.

## Approach

### Greedy + Sorting

1. Sort the array in non-decreasing order.
2. Set the first element to `1` since the final array must start with `1`.
3. Traverse the remaining elements:

    * If the current element is greater than the previous element, set it to `previous + 1`.
    * Otherwise, keep it unchanged.
4. After processing all elements, the last element of the array is the maximum possible value.

The greedy strategy ensures that every element is as large as possible while maintaining the required adjacent difference of at most `1`.

## Time Complexity
* **O(n log n)**

    * Sorting the array takes **O(n log n)**.
    * Traversing the array takes **O(n)**.

## Space Complexity
* **O(1)** (excluding the space used by the sorting algorithm).

---


