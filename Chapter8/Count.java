public class Count
{
    static int end=0;
    public static int Check(int end)
    {
         if(end>=100)
            return Check(end);
        else
        {
            return Check(end+1);
        }
    }
}