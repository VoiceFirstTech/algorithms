/*
Given a string, you need to reverse the order of characters in each word
within a sentence while still preserving whitespace and initial word order.

Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
*/
class Solution {
    public String reverseWords(String s) {
        String currentWord = "";
        String result = "";
        for (char ch: s.toCharArray()) {
            if (ch == ' ') {
                result += reverseWord(currentWord);
                currentWord = "";
            } else {
                currentWord += ch;
            }
        }
        return result + reverseWord(currentWord).substring(0,currentWord.length());
    }

    public String reverseWord(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += s.charAt(s.length() - (i + 1));
        }
        result += " ";
        return result;
    }
}
