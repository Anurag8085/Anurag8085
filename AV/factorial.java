import java.util.Scanner;
public class factorial 
{
    public static void main(String[] args)
    {
        int sum =1;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        sc.close();
        for (int i = x; i >0 ; i--) 
        {
            sum=i*sum;
        }
        System.out.println(sum);
        
    }
}
