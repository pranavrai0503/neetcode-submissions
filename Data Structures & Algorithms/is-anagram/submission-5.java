class Solution {
    public boolean isAnagram(String s, String t) {

       if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];
        
        // Count characters in string **s**
        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }
        
        // Decrement counts for characters in string **t**
        for (char ch : t.toCharArray()) {
            if (arr[ch - 'a'] == 0) {
                return false;
            }
            arr[ch - 'a']--;
        }
         return true;
    }
}
