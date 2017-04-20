import java.util.Scanner;
public class Palindrome
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String x = keyboard.nextLine();
        if(isPalindrome(x))
            System.out.println(x + " is a palindrome");
        else
            System.out.println(x + " is not a palindrome");
    }
    
    public static boolean isPalindrome(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            // if length =0 OR 1 then it is
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
            // check for first and last char of String:
            // if they are same then do the same thing for a substring
            // with first and last char removed. and carry on this
            // until your string completes or condition fails
            return isPalindrome(s.substring(1, s.length()-1));

        // if its not the case than string is not.
        return false;
    }
}
/**
 * Enter a word:
 * Aaron Zeeb
 * Aaron Zeeb is not a palindrome
 * 
 * Enter a word:
 * dogeeseseegod
 * dogeeseseegod is a palindrome
 */
