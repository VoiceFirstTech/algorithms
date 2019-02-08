/**
Every email consists of a local name and a domain name, separated by the @ sign.

For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.

Besides lowercase letters, these emails may contain '.'s or '+'s.

If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.)

If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)

It is possible to use both of these rules at the same time.

Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails? 
 */
class Solution {
    public int numUniqueEmails(String[] emails) {
        //create array of unique emails
        List<String> uniqueEmailArr = new ArrayList<String>();
        //iterate through array of emails
        for(int i = 0; i < emails.length; i++) {
            String finalEmail = emails[i];
            int atIndex = 0;
            String [] splitEmail = finalEmail.split("@"); 
            String local = splitEmail[0];
            String domain = splitEmail[1];
            
            // find + signs and remove content afterwards
            int localEndIndex = local.indexOf('+');
            if (localEndIndex > -1) {
                local = local.substring(0, localEndIndex);
            }
            
            //find . and remove
            localEndIndex = local.indexOf('.');
            local = local.replace(".", "");
            finalEmail = local + "@" + domain;
            // check if final string is in unique email
            if (!uniqueEmailArr.contains(finalEmail)) {//unique email
                uniqueEmailArr.add(finalEmail);
            }
        }

        
        return uniqueEmailArr.size();
    }
}