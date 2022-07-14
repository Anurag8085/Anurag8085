import java.util.Scanner;
public class Leap {
   public static void main(String[] args)
   {
   System.out.println("Enter one year");
   Scanner s1 = new Scanner (System.in);
   int x = s1.nextInt();
   s1.close();

   if(x%4==0 && x%100!=0||x%400==0)
   {
    System.out.println("it is a leap year");
   }
   else{
    System.out.println("it is not a leap year");
   }
}
}