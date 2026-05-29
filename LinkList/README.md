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
