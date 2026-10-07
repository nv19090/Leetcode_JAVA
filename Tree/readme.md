### Trees Problem Solutions in JAVA

---

# 94. Binary Tree Inorder Traversal

## Problem Statement

Given the root of a binary tree, return the inorder traversal of its nodes' values.

In inorder traversal, nodes are visited in the following order:

**Left → Root → Right**

## Approach

### Recursion + ArrayList

1. Create an `ArrayList` to store the traversal result.
2. Use a recursive helper function `inorder()` to traverse the tree.
3. If the current node is `null`, return the result.
4. Recursively traverse the left subtree.
5. Add the current node's value to the `ArrayList`.
6. Recursively traverse the right subtree.
7. Return the completed traversal list.

The recursive calls naturally follow the **Left → Root → Right** inorder traversal pattern.

**Topic:** Binary Tree, Recursion  
**Technique Used:** Recursive DFS + Inorder Traversal

## Time Complexity

**O(n)**

Every node in the binary tree is visited exactly once.

## Space Complexity

**O(n)**

The `ArrayList` stores `n` node values, and the recursive call stack can use up to O(n) space in the worst case.

---
