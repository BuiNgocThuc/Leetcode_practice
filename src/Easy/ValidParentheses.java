package Easy;

/*

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

 */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
        private final String s;

        public ValidParentheses(String s) {
                this.s = s;
        }

        public boolean offerSolution() {
                Map<Character, Character> bracketPairs = new HashMap();

                bracketPairs.put('}', '{');
                bracketPairs.put(']', '[');
                bracketPairs.put(')', '(');

                Stack<Character> openingBrackets = new Stack<>();

                for (int i = 0; i < s.length(); i++) {
                        char currBracket = s.charAt(i);

                        // if it is an opening bracket
                        if (bracketPairs.containsValue(currBracket)) {
                                openingBrackets.push(currBracket);
                        }

                        //if it is a closing bracket
                        else if (bracketPairs.containsKey(currBracket)) {
                                if (openingBrackets.isEmpty() || openingBrackets.pop() != bracketPairs.get(currBracket)) {
                                        return false;
                                }
                        }

                }

                // if all brackets are matched
                return openingBrackets.isEmpty();
        }
}
