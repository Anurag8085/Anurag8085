import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int x[]=new int [5];
        Scanner s1 = new Scanner(System.in);
        for (int i = 0; i <5; i++) {
             x[i] = s1.nextInt(); 
        }
        System.out.println("YOUR ARRAY");
        for (int i = 0; i <5; i++) {
            System.out.print(x[i]+" ");
        }
    }
}
