/*
* Implement function ToLowerCase() 
* that has a string parameter str, 
* and returns the same string in lowercase.
*
* Recursion takes MORE memory than iteration on this
* Recursion is good for complex problems 
*   ex. trees
*/
class Solution { // Recursive - VALID! Nice work Sameer!
    public String toLowerCase(String str) { // Recursive - should not be used for iterative problems
        // Base case - if length is zero
        String finalStr = "";
        if (str.length() == 1){
            char firstLetter = str.charAt(0);
            finalStr += Character.toLowerCase(firstLetter);
        } else {
            // if not zero - take off first letter
            char firstLetter = str.charAt(0);
            // convert first letter to lowercase
            finalStr += Character.toLowerCase(firstLetter);
            // create substring of rest of string
            String recursiveString = str.substring(1);
            // pass rest of string into recursive function
            finalStr += toLowerCase(recursiveString);
        }
        // return string
        return finalStr;
    }
}

class Solution { // Iterative - VALID!!! Nice work Youssef
    public String toLowerCase(String str) {
        // Create an empty string
        String stringToReturn = "";
        // Loop through every charater in str
        for(int index = 0; index < str.length(); index++) {
            // Add the lowercase version of letter to the string created, and go to next character
            stringToReturn += Character.toLowerCase(str.charAt(index));
        }
        // Return string
        return stringToReturn;
    }
}