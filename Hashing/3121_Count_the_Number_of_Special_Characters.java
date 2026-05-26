// Problem: 3121 Count the Number of Special Characters
// Language: Java
// Approach: HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {

    public int numberOfSpecialChars(String word) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < word.length(); i++) {

            map.put(word.charAt(i),
                    map.getOrDefault(word.charAt(i), 0) + 1);
        }

        int count = 0;

        for(char ch : map.keySet()) {

            if(map.containsKey((char)(ch + 32))) {
                count++;
            }
        }

        return count;
    }
}
