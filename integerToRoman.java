/*
Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.
*/
class Solution {
    public String intToRoman(int num) {
        String romanNum = "";
        int[] intArr = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romanArr = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        for (int i = intArr.length - 1; i >= 0; i--) {
            while (num / intArr[i] > 0) {
               num = num - intArr[i];
               romanNum += romanArr[i];
            }
        }
        return romanNum;
    }
}
