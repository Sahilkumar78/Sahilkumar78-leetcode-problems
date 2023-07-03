class Solution {
    public boolean buddyStrings(String s, String goal) {
       
        if (s.length() != goal.length()) {
            return false;
        }

        // If s and goal are equal, check if there are duplicate characters in s
        if (s.equals(goal)) {
            int[] count = new int[26]; // Assuming lowercase English alphabet
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
                if (count[c - 'a'] > 1) {
                    return true; // Found a duplicate character, swapping is possible
                }
            }
            return false; // No duplicate characters, so swapping is not possible
        }

        // Find the differing indices in s and goal
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                stack.push(i);
            }
        }

        // If there are exactly two differing indices, check if swapping them results in goal
        if (stack.size() == 2) {
            int first = stack.pop();
            int second = stack.pop();
            return (s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first));
        }

        return false; 

    
        
    }       
}