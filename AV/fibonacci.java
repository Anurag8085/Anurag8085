import java.util.Scanner;

public class fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Number Of Terms :");
        int x = s1.nextInt();
        s1.close();
        int c=1,a=0;
        int b= 0;
        System.out.print(a+ " " +c+ " ");
        for (int i = 0; i < x; i++) 
        {
            
            a=b;
            b=c;
            c=a+b;

            System.out.print(c + " ");
        }

    }
}
