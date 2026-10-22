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

# 101. Symmetric Tree

## Problem Statement

Given the root of a binary tree, determine whether the tree is symmetric around its center.

A binary tree is symmetric if its left and right subtrees are mirror images of each other.

## Approach

### Recursion + Mirror Comparison

1. If both nodes are `null`, return `true` because they are symmetric.
2. If only one node is `null`, return `false`.
3. If the values of the two nodes are different, return `false`.
4. Recursively compare:
   - The left child of the first node with the right child of the second node.
   - The right child of the first node with the left child of the second node.
5. Return `true` only if both recursive comparisons return `true`.
6. In `isSymmetric()`, handle an empty tree and then compare the root's left and right subtrees.

The recursive calls check whether both subtrees are mirror images at every level.

## Topic + Technique Used

**Topic:** Binary Tree, Recursion

**Technique Used:** Recursive DFS + Mirror Comparison

## Time Complexity

**O(n)**

Each node is visited at most once.

## Space Complexity

**O(h)** auxiliary space for the recursion stack, where `h` is the height of the tree. In the worst case, this is **O(n)** for a skewed tree.
