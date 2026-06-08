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

---

# Odd Even Linked List

## Problem Statement
Given the head of a singly linked list, group all nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The relative order inside the odd and even groups should remain the same.

## Approach
- First, traverse the linked list to find the last node (`dummy`) and count the total number of nodes.
- Use two pointers:
  - `prev` points to the current odd-indexed node.
  - `next` points to the current even-indexed node.
- Remove each even-indexed node from its current position.
- Append the removed even node at the end of the list using the helper `insert()` function.
- Continue this process for all even-positioned nodes.
- Finally, return the modified head of the list.

## Time Complexity
- Finding the length and last node: **O(n)**
- Rearranging the nodes: **O(n)**
- Overall: **O(n)**

## Space Complexity
- No extra data structures are used.
- Overall: **O(1)**

---

# Remove Nth Node From End of List

## Problem Statement
Given the head of a linked list, remove the nth node from the end of the list and return its head.

## Approach
- Use two pointers: `fast` and `slow`.
- Move the `fast` pointer `n` steps ahead.
- Move both `fast` and `slow` simultaneously until `fast` reaches the end of the list.
- At this point, `slow` points to the node that needs to be removed.
- Handle the special case where the node to be removed is the head node.
- Otherwise, traverse from the head to find the node just before `slow` and update its `next` pointer to skip the target node.
- Return the modified linked list.

## Time Complexity
- Moving the `fast` pointer: **O(n)**
- Moving both pointers together: **O(n)**
- Finding the previous node of the target node: **O(n)**
**Overall Time Complexity: O(n)**

## Space Complexity
**O(1)**
Only a few pointer variables are used, and no extra data structures are required.
