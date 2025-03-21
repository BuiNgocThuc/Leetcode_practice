package Easy;

/*

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

 */

public class LongestCommonPrefix {
        private String[] strs;

        public LongestCommonPrefix(String[] strs) {
                this.strs = strs;
        }

        public String offerSolution() {
                String prefix = strs[0];
                for (int i = 1; i < strs.length; ++i) {
                        while(strs[i].indexOf(prefix) != 0) { // prefix means beginning by it
                                prefix = prefix.substring(0, prefix.length() - 1);  // if not - will cut the last char of strs[0]
                        }
                }
                return prefix;
        }
}
