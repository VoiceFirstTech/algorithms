/*
Determine whether an integer is a palindrome.
*/
class Solution {
    public boolean isPalindrome(int x) {
        String numString = Integer.toString(x);
        boolean isPalindrome = true;
        for (int i = 0; i < (numString.length() / 2); i++) {
            if (numString.charAt(i) != numString.charAt(numString.length() - (i + 1))) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
