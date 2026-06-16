# String problems leetcode

---

#3612 Process String With Special Characters

Problem Statement
You are given a string "s" consisting of lowercase English letters and the special characters "'#'", "'*'", and "'%'".

Process the string from left to right according to the following rules:

- If the current character is a lowercase letter, append it to the result.
- If the current character is "'#'", duplicate the current result and append it to itself.
- If the current character is "'*'", remove the last character from the result if it is not empty.
- If the current character is "'%'", reverse the current result.
Return the final processed string after applying all operations.


Approach
1. Initialize an empty "StringBuilder" to store the result.
2. Traverse the input string character by character.
3. For each character:
   - Append letters directly to the result.
   - For "'#'", append the current string to itself.
   - For "'*'", remove the last character if the result is non-empty.
   - For "'%'", reverse the current result.
4. After processing all characters, return the final string.
The solution simulates each operation in the order they appear, ensuring that the string is updated correctly after every step.

Time Complexity
- O(n × k) in the worst case, where:
  - "n" = length of the input string.
  - "k" = current length of the generated string.
- Operations such as duplication ("#") and reversal ("%") may take linear time in the size of the current result.

Space Complexity
- O(k)
- The "StringBuilder" stores the generated string, whose size can grow based on the operations performed.
