# Hashing Problems

# 3121. Count the Number of Special Characters

## Problem Statement

Given a string `word`, return the number of special characters present in it.

A character is considered special if both its uppercase and lowercase forms exist in the string.

## Approach

* Use a HashMap to store the frequency of every character in the string.
* Traverse the string and insert each character into the map.
* Iterate through all characters present in the map.
* For each uppercase character, check whether its corresponding lowercase character exists by using ASCII conversion (`ch + 32`).
* Count all such valid pairs.
* Return the final count.

## Time Complexity

O(n)

* One traversal to build the HashMap.
* One traversal over the unique characters stored in the map.

## Space Complexity

O(n)

* The HashMap stores all unique characters present in the string.
