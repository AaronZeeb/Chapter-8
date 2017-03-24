//Aaron Zeeb
//Examples
public class Recursive_starter
{

    public static void main(String[] args)
    {

        foo(5);
        //System.out.print(sum (4));

        //System.out.println(recursiveMult(6,5)  );

        //System.out.println("exp = abc");
        //guess("abcdefg",0);

        reverse_print("abcde");

        //int_guess(1);

        //System.out.println("The sum is " + sum (4));

        //System.out.println( btp (3,3));





    }//end of main


    public static int btp(int a, int b)
    {
    
    
        if (b == 0)
            return 1;
        else
            return a * btp(a, b - 1);
    }
    
    public static int foo(int x)
    {
        if (x > 0)
            foo(x+1);
    
        return 0;
    }
    
    public static void reverse_print(String s, int len)
    {
        reverse_print("blah");
        /*
        if(reverse_print.length()==0)
        {
            System.out.print "a";
        }
        else()
        {
            System.out.print(reverse_print.substring(-1))
        }
        */
        System.out.println(s.charAt(len-1));
        if(len>1/*<s.length()-1*/)
            reverse_print(s,--len);
        
        if(s.length()>1/*<s.length()-1*/)
            reverse_print(s.substring(1));
        System.out.println(s.charAt(0));
        
    
    }
    
    
    
    
    
    
    
    public static int mystery (int num)
    {
        //System.out.println(num );
        if (num == 1)
            return 1;
        else
        {
    
            return num + mystery(num-1);
    
        }
    
    
    }
    
    public static int count(int num)
    {
        if(num==1)
            return 1;
        else
        {
            System.out.print(num.index(-1));
        }
    }
    
    public static int countTwo(int num)
    {
        
    }
}// end of class







