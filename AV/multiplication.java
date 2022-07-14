import java.util.Scanner;

public class multiplication 
{
    public static void main(String[] args) 
    {
         
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int x = s1.nextInt();
        s1.close();
        for (int index = 1; index <= 10; index++) 
        {
           int y = x*index;     
            System.out.println(y);
        }
    }
}
