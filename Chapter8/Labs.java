import java.util.Scanner;
public class Labs
{
    int num=50, rem=0;
    public static int Digit(int num, int rem)
    {
        //System.out.println("Digit counter.");
        //System.out.println();
        if(num>10)
        {
            rem=/10;
            num++;
        }
        else
            return num;
        return num;
    }
    /**
    public static String palindrome()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println("Palendrome tester.");
        System.out.println();
        System.out.println("Enter a sentence:");
        String line=keyboard.nextLine();
        int left=0, right=line.length()-1;
        int pos=0;
        left=,right=
        left=
        right=
        if(left==right)
        {
            if(post<=(line.length()-1))
            {
            
            }
        }
        while(line.charAt(left)==line.charAt(right)&& left<right)
        {
            left++;
            right--;        
         }
        System.out.println();
       
        if(left<right)
        {
            String command="This is not a palindrome";
            return line;
         }
        else
        {
            String an="This is a palindrome";
            return an;
            }
    }
    /*
    public static double GCD()
    {
        System.out.println();
        System.out.println("GCD finder.");
        System.out.println();
        
    }
    
    public static int Fund()
    {
        System.out.println();
        System.out.println("Fund raising counter.");
        System.out.println();
        
    }  
    */
}
