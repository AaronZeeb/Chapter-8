import java.util.Scanner;
public class Labs
{
    static int total=0;
	static int count;
    /*
    public static int Digit(int num)
    {
        int count=0;
        if(num<10)
        {
            return 1+count;            
        }
        else
        {
            count++;
            return count+Digit(num/10);
        }
    }
    */
    
	/*
    public static int GCD(int num1, int num2)
    {

		if(num2<=num1 && num2%num1==0)
			return num2;

		if (num2==0)
			return num1;
		else
		{
			return GCD(num2, num1%num2);
		}
	
    }
    */
    public static int Fund()
    {   
		/*
		count=0;
        if(count>=10)
            return count+Fund();
        else
		{
			//count++;
            return Fund(count+1);	
		}
		
		if(count>=10)
			return 1+Fund(count);
		else
		{
			count++;
			return Fund(1+count);
		}
		*/
		if(count>=100)
			return count+Fund(total);
		else
			count++;
			return Fund(total+count);
    }
	
}
