### Priority_Queue Based Problems :

---

# 703. Kth Largest Element in a Stream

## Problem Statement

Design a class that finds the `k`th largest element in a stream of integers.

The class should:

- Initialize with an integer `k` and an array `nums`.
- Support adding a new integer to the stream.
- After each addition, return the `k`th largest element.

## Approach

### Min-Heap / PriorityQueue

1. Use a **Min-Heap** implemented using Java's `PriorityQueue`.
2. Add all elements of `nums` to the priority queue.
3. Remove the smallest elements until only the `k` largest elements remain.
4. When a new value is added:
   - Insert it into the priority queue.
   - If the size becomes greater than `k`, remove the smallest element.
5. The smallest element remaining in the priority queue is always the `k`th largest element.
6. Return `pq.peek()`.

The important idea is to maintain only the **k largest elements** in the Min-Heap.

**Topic:** Heap, Priority Queue  
**Technique Used:** Min-Heap + Maintaining K Largest Elements

## Time Complexity

**Constructor:** `O(n log n)`

All `n` elements are inserted into the priority queue, and up to `n-k` elements may be removed.

**add():** `O(log k)`

A new element is inserted and, if necessary, the smallest element is removed.

## Space Complexity

**O(k)**

The priority queue maintains at most `k` elements after initialization.

---

# 692. Top K Frequent Words

## Problem Statement

Given an array of strings `words` and an integer `k`, return the `k` most frequent strings.

The answer should be sorted by:

- Frequency in descending order.
- Alphabetical order when two words have the same frequency.

## Approach

### HashMap + PriorityQueue

1. Use a `HashMap` to store the frequency of every word.
2. Create a `PriorityQueue` containing `Map.Entry<String, Integer>`.
3. Define a comparator with two conditions:
   - If frequencies are different, sort by frequency in descending order.
   - If frequencies are equal, sort alphabetically using `String.compareTo()`.
4. Add every entry from the `HashMap` to the priority queue.
5. Remove elements from the priority queue using `poll()` and add their keys to the answer.
6. Continue until `k` words have been added.
7. Return the resulting list.

**Topic:** Hashing, Priority Queue, String  
**Technique Used:** HashMap + Custom Comparator + PriorityQueue

## Time Complexity

**O(n + m log m + k log m)**

Where `n` is the number of words and `m` is the number of distinct words.

- Building the frequency map: `O(n)`
- Adding `m` entries to the priority queue: `O(m log m)`
- Extracting `k` elements: `O(k log m)`

## Space Complexity

**O(m)**

The `HashMap` and `PriorityQueue` store up to `m` distinct words.
