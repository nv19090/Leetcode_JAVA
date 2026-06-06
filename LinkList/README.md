# 237. Delete Node in a Linked List

## Problem Statement

Given a node in a singly linked list, delete the node from the list. You are not given access to the head of the list.

**Note:**

* The given node will not be the tail node.
* All values in the linked list are unique.

## Approach

Since we do not have access to the previous node or the head of the linked list, we cannot delete the given node in the usual way.

To solve this:

1. Copy the value of the next node into the current node.
2. Update the current node's next pointer to skip the next node.

This makes the current node effectively take the place of the next node, removing the target node from the linked list.

## Complexity Analysis

* **Time Complexity:** O(1)
* **Space Complexity:** O(1)


# 876. Middle of the Linked List

## Problem Statement

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

## Approach

We use the **Fast and Slow Pointer** technique.

* Initialize two pointers, `slow` and `fast`, at the head of the linked list.
* Move `slow` one step at a time.
* Move `fast` two steps at a time.
* When `fast` reaches the end of the list, `slow` will be pointing to the middle node.

If the linked list contains an even number of nodes, the algorithm naturally returns the second middle node.

## Complexity Analysis

* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

# LeetCode 141 - Linked List Cycle

## Problem Statement

Given the `head` of a linked list, determine whether the linked list has a cycle in it.

A cycle exists if some node in the list can be reached again by continuously following the `next` pointer.

---

## Approach: Floyd's Cycle Detection Algorithm (Tortoise and Hare)

We use two pointers:

* **Slow Pointer** moves one step at a time.
* **Fast Pointer** moves two steps at a time.

## Complexity Analysis

### Time Complexity

* **O(n)**
* Each pointer traverses the list at most once.

### Space Complexity

* **O(1)**
* No extra data structures are used.

# 142. Linked List Cycle II

## Problem Statement

Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return `null`.

## Approach

Use Floyd's Cycle Detection Algorithm with two pointers:

* Move `slow` one step at a time and `fast` two steps at a time.
* If the pointers meet, a cycle exists.
* Reset `slow` to the head.
* Move both pointers one step at a time.
* The node where they meet again is the starting node of the cycle.

## Time Complexity
O(N)

## Space Complexity
O(1)

---

# Palindrome Linked List

## Problem Statement
Given the head of a singly linked list, return `true` if it is a palindrome, otherwise return `false`.

A palindrome is a sequence that reads the same forward and backward.

## Approach
1. Traverse the linked list and push all node values into a stack.
2. Traverse the linked list again from the beginning.
3. For each node, compare its value with the top element of the stack.
4. If any value does not match, return `false`.
5. If all values match, return `true`.

The stack stores elements in reverse order, allowing comparison of the linked list from both ends.

## Time Complexity
- Traversing the list to fill the stack: **O(n)**
- Traversing the list again for comparison: **O(n)**

**Overall:** `O(n)`

## Space Complexity
- Stack stores all node values: **O(n)**

**Overall:** `O(n)`
