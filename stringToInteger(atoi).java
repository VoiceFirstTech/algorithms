/*
The function first discards as many whitespace characters as necessary until the
 first non-whitespace character is found. Then, starting from this character,
 takes an optional initial plus or minus sign followed by as many numerical digits
 as possible, and interprets them as a numerical value.
*/
class Solution {
    public int myAtoi(String str) {
        int converted = 0;
        Boolean negative = false;
        String noWhiteSpaceStr = str.trim();
        if (noWhiteSpaceStr.length() == 0) {
            converted = 0;
        } else {
            String numberStr = "";
            int i = 0;
            if (noWhiteSpaceStr.charAt(0) == '+' || noWhiteSpaceStr.charAt(0) == '-') {
                if (noWhiteSpaceStr.charAt(0) == '-') {
                    negative = true;
                }
                noWhiteSpaceStr = noWhiteSpaceStr.substring(1);
            }
            while (i < noWhiteSpaceStr.length() && Character.isDigit(noWhiteSpaceStr.charAt(i))) {
                numberStr += noWhiteSpaceStr.charAt(i);
                i++;
            }
            if (numberStr.matches("^[0-9]+$")) {
                try{
                    if (negative) {
                        numberStr = "-" + numberStr;
                        converted = Integer.parseInt(numberStr);
                    } else {
                        converted = Integer.parseInt(numberStr);
                    }
                }catch(NumberFormatException ex){ // handle your exception
                   if (negative) {
                       converted = Integer.MIN_VALUE;
                   } else {
                       converted = Integer.MAX_VALUE;
                   }
                }
            } else {
                converted = 0;
            }
        }
        return converted;
    }
}
