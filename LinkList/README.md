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
