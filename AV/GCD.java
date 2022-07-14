import java.util.Scanner;

public class GCD 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int temp;
        while(y>0) 
        {  
            temp=y;
            y=y%x; 
            x=temp;
        }
        System.out.println(x);
    }
}
