import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int x = s1.nextInt();
        int i=0;
       do
       {
        x=x/10;
        i++;
       }while(x!=0);
     System.out.println(i);
    }
}
