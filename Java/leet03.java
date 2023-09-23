/* Given a string s, find the length of the longest
        substring
        without repeating characters.



        Example 1:

        Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.
        Example 2:

        Input: s = "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.
        Example 3:

        Input: s = "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.
        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring. */
  class Solution {

    public int lengthOfLongestSubstring(String s)
    {
       int result = 0;
       int[] chars = new int[128];
       for (int i = 0, j = 0; i < s.length(); i++) {
           j = Math.max(chars[s.charAt(i)], j);
           result = Math.max(result, i - j + 1);
           chars[s.charAt(i)] = i + 1;
       }
       return result;
    }

}

