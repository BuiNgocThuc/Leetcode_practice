package Easy;

/*

Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
Therefore, it is not a palindrome.

Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore, it is not a palindrome.

 */

public class PalindromeNumber {
        private int x;

        public PalindromeNumber(int x) {
                this.x = x;
        }

        public boolean offerSolution() {
                if (x < 0) return false;
                int reserved = 0, initialVal = x;
                while(x > 0) {
                        reserved = reserved * 10 + x % 10;
                        x /= 10;
                }
                return reserved == initialVal;
        }

        public boolean offerSolution2() {
                if (x < 0 || x > 0 && x % 10 == 0) return false;

                int reserved = 0;
                while (x > reserved) {
                        reserved = reserved * 10 + x % 10;
                        x /= 10;
                }

                return x == reserved || x == reserved / 10; // compare 1 = 12 / 10 
        }

        public static void main(String[] args) {
                PalindromeNumber pnProblem = new PalindromeNumber(-121);
                boolean result = pnProblem.offerSolution();
                System.out.println(result);
        }
}
