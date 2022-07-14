public class input4 
{
    public static void main(String[] args) 
    {
        if(args.length<1)
        {
           System.out.println("please supply at least one number  ");
        }
        else
        {
           System.out.println(args[0]);
           System.out.println(args[1]);
        }
    }
}